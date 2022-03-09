# Hack scripts

Multipurpose utility scripts.

## Generate Catalog

The `generate-catalog.sh` script depends on [opm](https://mirror.openshift.com/pub/openshift-v4/x86_64/clients/ocp/latest/) 
which is a cli to work with the Operator Bundle Format. It also requires a container engine like Docker or Podman.

For more details about this process read the [Managing custom catalogs](https://docs.openshift.com/container-platform/4.9/operators/admin/olm-managing-custom-catalogs.html)
section in the OpenShift documentation.

Check the script configuration capabilities and default values with the `-h` flag.

```shell
# Print help
$ ./generate-catalog.sh -h
```

The script will use the resources in the [olm-catalog](../deploy/olm-catalog) for the specific version and will build
and validate a container image for the bundle.

After that, the script creates a catalog and adds the generated bundle to it.

Finally, a container image for the catalog is created and validated.

Example:

```shell
# Generate the catalog and also push the images to the default registry. i.e. quay.io/ecosystem-appeng
./generate-catalog.sh -p

# Generate and push the catalog but the resulting images will be tagged as latest 
./generate-catalog.sh -pv latest
```

## Generate CSV

The `generate-csv.sh` script is a convenience script that generates a CSV from the 
existing resources in the [deploy](../deploy) folder.

## Update version references

The `update-version.sh` script expects 2 arguments, one is the _current version_ and the other is the _next version_.
Then it will read the [version-resources](./version-resources) file and find all the matching files to replace the
_current version_ by the _next version_.

Example:

```shell
./update-version.sh 1.0.1-SNAPSHOT 1.0.1.Final
```