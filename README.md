
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

<img align="right" width="40%" src="https://avatars3.githubusercontent.com/u/64280816?s=200&v=4">

# An open platform for a modular, digital bank

Project Mercury aims at developing a solution approach for the modernization of core banking systems, exploring new technologies and ways of operating in an open hybrid cloud. Creating and enabling the foundation of an open platform for modular, digital banking. Using open-source software and open standards currently available, combined with industry best practices.

The provided reference implementation can serve as an example. While some resulting artifacts leverage the expertise of developing this solution approach can become reusable templates, repeatable processes, and building blocks of cloud-native components and applications.

We invite the collaboration of technology experts and experienced business practitioners across the financial services industry to join and participate in co-creation.

## Components

### [Mercury Framework](https://github.com/open-accelerators/mercury-framework)

The Mercury Framework contains the core structure of all Service Domains and their implementations of behavior as 
well as a collection of libraries and tools to facilitate the integration between them.

This component is the starting point for developers wishing to implement any given Service Domain.

### [Mercury Framework Examples](https://github.com/open-accelerators/mercury-framework-examples)

Examples implementing service domains using the Mercury Framework. These examples can be built and deployed
using the Mercury Operator on a Kubernetes environment.

### [Mercury Operator](https://github.com/open-accelerators/mercury-operator)

The Mercury Operator manages the deployment of the Service Domain Infras by creating infrastructure components 
essential for service domains to function and communicate.

This component is the starting point for cluster administrators wishing to deploy an ecosystem of Service Domains 
on their application cluster.

## Get involved with the community

We welcome contributions! Here's how you can contribute:

* _Browse issues_ or _file an issue_
* Reach out to our Google Group at [open-accelerators-mercury@redhat.com](open-accelerators-mercury@redhat.com)
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
