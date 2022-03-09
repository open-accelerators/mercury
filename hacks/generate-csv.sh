#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset
# set -o xtrace

API_VERSION=1.0.1
faq -f yaml -o yaml --slurp '.[0].spec.install = {strategy: "deployment", spec:{ deployments: [{name: .[1].metadata.name, spec: .[1].spec }], permissions: [{serviceAccountName: .[4].metadata.name, rules: .[2].rules }], clusterPermissions: [{serviceAccountName: .[4].metadata.name, rules: .[3].rules }]}} | .[0]' deploy/olm-catalog/${API_VERSION}/mercury-operator.csv.yaml deploy/operator.yaml deploy/role.yaml deploy/cluster_role.yaml deploy/service_account.yaml > deploy/olm-catalog/${API_VERSION}/mercury-bundle/manifests/mercury-operator.clusterserviceversion.yaml