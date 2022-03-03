#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset
#set -o xtrace

die () {
    echo >&2 "$@"
    exit 1
}

[ "$#" -eq 2 ] || die "2 arguments required, $# provided"

dir_path=$(dirname $0)
file='version-resources'
current=$1
next=$2


replace () {
  path=$(dirname "$1")
  file_exp=$(basename "$1")
  for i in `find $path -name $file_exp`
  do
    sed -i 's/'${current}'/'${next}'/' $i
  done
}

while read line
do
  if [[ $line != \#* ]]
  then
    replace "$line"
  fi
done < $dir_path/$file