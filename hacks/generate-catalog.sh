#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

REGISTRY='quay.io/ecosystem-appeng'
DEV_VERSION=1.0.2
STABLE_VERSION=1.0.1
CATALOG_VERSION=$DEV_VERSION
CE=''
push='false'

print_usage() {
  echo "Generates the operator bundle and operator catalog container images and push them to the registry

  -c <docker|podman>      Set your preferred container engine. By default tries Podman and then Docker
  -r <container registry> Set the registry. Defaults to quay.io/ecosystem-appeng
  -v <version>            Set the image version to be used in the catalog image tag. Default to $CATALOG_VERSION
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

while getopts 'phdv:c:r:' flag; do
  case "${flag}" in
    c) CE="${OPTARG}" ;;
    r) REGISTRY="${OPTARG}" ;;
    v) CATALOG_VERSION="${OPTARG}" ;;
    d) set -o xtrace ;;
    p) push='true' ;;
    *) print_usage
       exit 1 ;;
  esac
done

check_commands

# Build and validate bundles
versions=("1.0.1" "1.0.2")
for v in "${versions[@]}"
do
  ${CE} build -t ${REGISTRY}/mercury-bundle:$v -f ./deploy/olm-catalog/bundle.Dockerfile ./deploy/olm-catalog/$v/
  if [ "$push" == true ]
  then
    ${CE} push ${REGISTRY}/mercury-bundle:$v
  fi
  opm alpha bundle validate --tag ${REGISTRY}/mercury-bundle:$v --image-builder=${CE}
done

# Build and validate catalog
opm init mercury-operator --default-channel=stable --description=./README.md --icon=./docs/images/mercury.png --output yaml > ./deploy/olm-catalog/catalog/operator.yaml
for v in "${versions[@]}"
do
  opm render ${REGISTRY}/mercury-bundle:$v --output yaml >> ./deploy/olm-catalog/catalog/operator.yaml
done
cat << EOF >> ./deploy/olm-catalog/catalog/operator.yaml
---
schema: olm.channel
package: mercury-operator
name: stable
entries:
  - name: mercury-operator.$STABLE_VERSION
---
schema: olm.channel
package: mercury-operator
name: dev
entries:
  - name: mercury-operator.$DEV_VERSION
EOF
opm validate ./deploy/olm-catalog/catalog

${CE} build -f ./deploy/olm-catalog/catalog.Dockerfile -t ${REGISTRY}/mercury-catalog:${CATALOG_VERSION} ./deploy/olm-catalog
if [ "$push" == true ]
then
  ${CE} push ${REGISTRY}/mercury-catalog:${CATALOG_VERSION}
fi