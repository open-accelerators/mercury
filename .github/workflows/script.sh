#!/bin/sh

echo MERCURY_VERSION=xmllint --xpath '/*[local-name()="project"]/*[local-name()="version"]/text()' pom.xml