#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset
set -o xtrace

API_VERSION=1.0.1
IMG_VERSION=${API_VERSION}-SNAPSHOT
CHANNEL=1.0.x

# Build and validate bundle
podman build -t quay.io/ecosystem-appeng/mercury-bundle:${IMG_VERSION} -f ./deploy/olm-catalog/bundle.Dockerfile ./deploy/olm-catalog/${API_VERSION}/
podman push quay.io/ecosystem-appeng/mercury-bundle:${IMG_VERSION}
opm alpha bundle validate --tag quay.io/ecosystem-appeng/mercury-bundle:${IMG_VERSION} --image-builder=podman

# Build and validate catalog
opm init mercury-operator --default-channel=${CHANNEL} --description=./README.md --icon=./docs/images/mercury.png --output yaml > ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
opm render quay.io/ecosystem-appeng/mercury-bundle:${IMG_VERSION} --output yaml >> ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
cat << EOF >> ./deploy/olm-catalog/${API_VERSION}/mercury-catalog/operator.yaml
---
schema: olm.channel
package: mercury-operator
name: ${CHANNEL}
entries:
  - name: mercury-operator.${API_VERSION}
EOF

opm validate ./deploy/olm-catalog/${API_VERSION}/mercury-catalog

podman build -f ./deploy/olm-catalog/mercury-catalog.Dockerfile -t quay.io/ecosystem-appeng/mercury-catalog:${IMG_VERSION} ./deploy/olm-catalog/${API_VERSION}
podman push quay.io/ecosystem-appeng/mercury-catalog:${IMG_VERSION}