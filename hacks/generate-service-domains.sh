#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset

dir_path=$(dirname $0)

print_usage() {
  echo "
Generates SDK projects for the Mercury Framework. If the folder already exists it will be skipped.
    * Creates a new maven project from the mercury-sd-archetype
    * Pulls the current BIAN Semantic API OpenAPI spec
    * Generates the Proto files from the OpenAPI spec 
    * Cleans up the generated pom files
  
Flags:
  -a <api_version>   Set the Api Version for generating the protobuf model. Defaults to v10
  -v <version>       Set the Project Version to use. Defaults to the project version. 
  -p <project>       Builds a specific project.
  -f                 Force the re-creation of the project in case the folder already exists.
  -d                 Set the debug flag.
  -h                 Prints this message.

Examples:

# Simple usage to generate all the service domains
$ generate-service-domains.sh 

# Generate only the BankDrafts project
$ generate-service-domains.sh -p BankDrafts
"
}

API_VERSION=v10
PROJECT_VERSION=$(xmllint --xpath '/*[local-name()="project"]/*[local-name()="version"]/text()' pom.xml)
PROJECT=''
force=''

while getopts 'dfha:v:p:' flag; do
  case "${flag}" in
    a) API_VERSION="${OPTARG}" ;;
    v) PROJECT_VERSION="${OPTARG}" ;;
    p) PROJECT="${OPTARG}" ;;
    f) force='true' ;;
    d) set -o xtrace ;;
    h) print_usage
       exit 0 ;;
    *) print_usage
       exit 1 ;;
  esac
done

generate_archetype() {
  mvn archetype:generate -B \
         -DarchetypeGroupId=io.github.open-accelerators \
            -DarchetypeArtifactId=mercury-sd-archetype \
            -DarchetypeVersion=${PROJECT_VERSION} \
            -DartifactId=${2} \
            -DserviceDomainName=${1} \
            -DgroupId=io.github.open-accelerators \
            -Dversion=${PROJECT_VERSION}
}

generate_sdk() {
  artifact_id=$(sed 's/^[[:upper:]]/\L&/;s/[[:upper:]]/\L-&/g' <<< ${1})
  package_id=${artifact_id//-/}
  if [[ ${force} ]]
  then
    if [[ -d ${artifact_id} ]]
    then
      rm -rf ${artifact_id}
    fi
    sed -i '/<module>'${artifact_id}'<\/module>/d' pom.xml
  fi
  
  if [[ ! -d ${artifact_id} ]]
  then
    generate_archetype "$1" "$artifact_id"
    curl https://raw.githubusercontent.com/bian-official/public/main/release10.0.0/semantic-apis/oas3/yamls/${1}.yaml --output ${artifact_id}/${artifact_id}-common/src/main/resources/${1}.yaml
    mkdir -p ${artifact_id}/${artifact_id}-common/src/main/proto/${API_VERSION}
    podman run -v "${PWD}/${artifact_id}/${artifact_id}-common/src/main/resources:/api:Z" \
      -v "${PWD}/${artifact_id}/${artifact_id}-common/src/main/proto/${API_VERSION}:/local:Z" \
      openapitools/openapi-generator-cli generate -g protobuf-schema -i /api/${1}.yaml -o local \
      --package-name=com.redhat.mercury.${package_id}.${API_VERSION} --model-package=model --api-package=api\
      --skip-validate-spec
    find ${artifact_id}/${artifact_id}-common/src/main/proto -type f -name "*.proto" -exec sed -i 's/model\/todo_object_mapping.proto/google\/protobuf\/any.proto/g' {} +
    find ${artifact_id}/${artifact_id}-common/src/main/proto -type f -name "*.proto" -exec sed -i 's/TODO_OBJECT_MAPPING/google.protobuf.Any/g' {} +
    find ${artifact_id}/${artifact_id}-common/src/main/proto -type f -name "*.proto" -exec sed -i 's/\"model\//\"'${API_VERSION}'\/model\//g' {} +
    rm ${artifact_id}/${artifact_id}-common/src/main/resources/${1}.yaml
    sed -i 's/[[:space:]]*$//' ${artifact_id}/pom.xml
    sed -i '/^$/d' ${artifact_id}/pom.xml
  fi
}

sd_file="$( cd -- "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"/service-domains
cd mercury-framework/service-domains

if [ -z "${PROJECT:-}" ]
then
  while read line
  do
    if [[ $line != \#* ]]
    then
      generate_sdk $line
    fi
  done < $sd_file
else
  generate_sdk $PROJECT
fi

# clean up pom.xml
sed -i 's/[[:space:]]*$//' pom.xml
sed -i '/^$/d' pom.xml

cd -
