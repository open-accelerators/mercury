# Service Domain Base

This folder contains projects generated directly from the [BIAN Official Semantic APIs](https://github.com/bian-official/public/tree/main/release9.1/semantic-apis/swaggers).

Each project contains two modules:

* Java DTO Model
* Java Camel Rest DSL routes

If you want to generate a new project you can just use the [mercury-sd-archetype](../mercury-sd-archetype) as follows:

```{bash}
mvn archetype:generate \
    -DarchetypeGroupId=com.redhat.mercury \
    -DarchetypeArtifactId=mercury-sd-archetype \
    -DarchetypeVersion=1.0-SNAPSHOT \
    -DartifactId=customer-offer \
    -DserviceDomainName=CustomerOffer \
    -DgroupId=com.redhat.mercury \
    -Dversion=1.0.0-SNAPSHOT
```

The project will automatically be added as a module to this parent project.

**Note:** The parent pom is altered also by adding a new line after each line. See [ARCHETYPE-584](https://issues.apache.org/jira/browse/ARCHETYPE-584) for more information.