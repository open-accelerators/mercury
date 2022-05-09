# Mercury Service Domain Archetype

This Maven archetype generates a default set of `service-domain` modules that can be used when implementing
a new Service Domain.

## Required Properties

* `sdName`: CamelCase name of the Service Domain. E.g. `CustomerOffer`, `CustomerCreditRating`
* `artifactId`: Used for naming the packages and in the `pom.xml` files. Use the hyphenated format.
e.g. `customer-offer`, `customer-credit-rating`

### Limitations

Due to a [bug in the archetype plugin](https://issues.apache.org/jira/browse/ARCHETYPE-490).
The `sdArtifactId` has to be defined but the default value can be used as is.

Each time a new module is added to the `pom.xml` a blank line is added. This has to be formatted
and cleaned up after running the archetype.

## Usage

```shell
mvn archetype:generate -DarchetypeGroupId=com.redhat.mercury \
  -DarchetypeArtifactId=mercury-sd-archetype \
  -DarchetypeVersion=1.0.2-SNAPSHOT \
  -DartifactId=account-recovery \
  -DsdName=AccountRecovery \
  -DgroupId=com.redhat.mercury \
  -Dversion=1.0.2-SNAPSHOT
```

This should be executed within the [service-domains](../service-domains) folder so that it is 
automatically added as a module.

The generated module will be named using the `artifactId` (e.g. account-recovery) and will include
the following sub-modules:

* `<service-domain>-common`: This project should contain all common model (.proto file) and constants used in any
other `<service-domain>` library. That includes CloudEvent types, data model, `<ServiceDomain>Service` 
and `<ServiceDomain>NotificationService` abstract classes.
* `<service-domain>-client`: Library used by any service domain willing to communicate to this `service-domain`
using the Binding Service. The `<ServiceDomain>Client` class must implement all the methods from
`<ServiceDomain>Service` and convert each request into a CloudEvent to send it to the Binding Service
through the `outboundBindingService` gRPC client
