#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

REGISTRY='quay.io/ecosystem-appeng'
API_VERSION=1.0.1
IMG_VERSION=${API_VERSION}-SNAPSHOT
CHANNEL=1.0.x
CE=''
push='false'

print_usage() {
  echo "Generates the operator bundle and operator catalog container images and push them to the registry

  -c <docker|podman>      Set your preferred container engine. By default tries Podman and then Docker
  -r <container registry> Set the registry. Defaults to quay.io/ecosystem-appeng
  -v <version>            Set the image version to be used in the image tag
  -p                      When set, the resulting images will be pushed
  -d                      Set the debug flag
  -h                      Prints this message"
}

check_commands() {
  commands=(opm cat)
  for i in "${commands[@]}"
  do
     :
     if ! command -v $i &> /dev/null
     then
       echo "$i is not installed and is required"
       exit 1
     fi
  done
  if [ ! -z "$CE" ]
  then
    if ! command -v $CE &> /dev/null
    then
      echo "$CE could not be found. Is it installed?"
      exit 1
    fi
    return
  fi
  CE='podman'
  if ! command -v $CE &> /dev/null
  then
    echo "$CE could not be found. Trying Docker"
    CE='docker'
    if ! command -v $CE &> /dev/null
    then
      echo "$CE could not be found. Either Podman or Docker are required"
      exit 1
    fi
  fi
}

while getopts 'phdc:r:v:' flag; do
  case "${flag}" in
    c) CE="${OPTARG}" ;;
    r) REGISTRY="${OPTARG}" ;;
    v) IMG_VERSION="${OPTARG}" ;;
    d) set -o xtrace ;;
    p) push='true' ;;
    *) print_usage
       exit 1 ;;
  esac
done

check_commands

# Build and validate bundle
${CE} build -t ${REGISTRY}/mercury-bundle:${IMG_VERSION} -f ./deploy/olm-catalog/bundle.Dockerfile ./deploy/olm-catalog/${API_VERSION}/
if [ "$push" == true ]
then
  ${CE} push ${REGISTRY}/mercury-bundle:${IMG_VERSION}
fi
opm alpha bundle validate --tag ${REGISTRY}/mercury-bundle:${IMG_VERSION} --image-builder=${CE}

# Build and validate catalog
opm init mercury-operator --default-channel=${CHANNEL} --description=./README.md --icon=./docs/images/mercury.png --output yaml > ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
opm render ${REGISTRY}/mercury-bundle:${IMG_VERSION} --output yaml >> ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
cat << EOF >> ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
---
schema: olm.channel
package: mercury-operator
name: ${CHANNEL}
entries:
  - name: mercury-operator.${API_VERSION}
EOF

opm validate ./deploy/olm-catalog/${API_VERSION}/mercury-catalog

${CE} build -f ./deploy/olm-catalog/mercury-catalog.Dockerfile -t ${REGISTRY}/mercury-catalog:${IMG_VERSION} ./deploy/olm-catalog/${API_VERSION}
if [ "$push" == true ]
then
  ${CE} push ${REGISTRY}/mercury-catalog:${IMG_VERSION}
fi