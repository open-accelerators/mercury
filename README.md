
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

<img align="right" width="40%" src="https://avatars3.githubusercontent.com/u/64280816?s=200&v=4">

# An open platform for a modular, digital bank

Project Mercury aims at developing a solution approach for the modernization of core banking systems, exploring new technologies and ways of operating in an open hybrid cloud. Creating and enabling the foundation of an open platform for modular, digital banking. Using open-source software and open standards currently available, combined with industry best practices.

The provided reference implementation can serve as an example. While some resulting artifacts leverage the expertise of developing this solution approach can become reusable templates, repeatable processes, and building blocks of cloud-native components and applications.

We invite the collaboration of technology experts and experienced business practitioners across the financial services industry to join and participate in co-creation.

## Components

### [Integrations](integrations/README.md)

The Integrations component generates routes between the different components of each Service Domain in order to promote the free flow of data across the system.

### [Mercury Framework](mercury-framework/README.md)

The Mercury Framework contains the core structure of all Service Domains and their implementations of behavior as well as a collection of libraries and tools to facilitate the integration between them.

This component is the starting point for developers wishing to implement any given Service Domain.

### [Mercury Operator](mercury-operator/README.md)

The Mercury Operator manages the deployment of the Service Domain Infras by creating infrastructure components essential for service domains to function and communicate.

This component is the starting point for cluster administrators wishing to deploy an ecosystem of Service Domains on their application cluster.

## Build

Prerequisites: 

* Maven 3.8.4
* Java 11
* Docker or Podman for container images

### Profiles

In the Maven pom there are defined a list of profiles.

* `native` It will trigger the Quarkus Native builds for the operator and the examples
* `container-build` Creates the container images using the native builds. Use the `container-build` property to activate
both profiles at once. e.g. `mvn package -Dcontainer-build`
* `coverage` Execute code coverage analysis.
* `podman` Specific in case you need to use `test-containers` and don't have Docker.
* `platform-release` GPG sign the generated artifacts
* `checkstyle` Run the checkstyle plugin. Active by default
* `crd` Generate CRDs

## Get involved with the community
__(Under construction)__

We welcome contributions! Here's how you can contribute:

* _Browse issues_ or _file an issue_
* Chat with us on [ZulipChat](https://mercury.zulipchat.com/)
* Contribute:
   * Read the _contributing guide_ before starting work on an issue
   * Try to fix _good first issues_
   * Help out on _issues that need help_
   * Join in on _discussion issues_

_Make sure to follow the **Code of Conduct** when contributing so we can foster an open and welcoming community._

## License

Copyright 2020-2021 Red Hat, Inc.

Distributed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

SPDX-License-Identifier: [Apache-2.0](https://spdx.org/licenses/Apache-2.0)
