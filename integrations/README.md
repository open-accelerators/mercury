# Integrations

The Integrations component links together smaller components into a single system that functions as one,

These links establish a route between the components of the process and control layer of each Service Domain to promote the free flow of data across the system. 

These integrations depend on Camel K and are implemented by the Mercury Operator.

## Components

### Camel K

  The _camel-k_ directory contains specific Camel k integrations for the different types of use cases and Service Domains as well as dependencies to the corresponding java libraries

### Mercury Camel

  The _mercury-camel_ directory is a common library available to all integrations to execute cloud event activities

### Service Domain Integration

  The _service-domain-integration_ directory contains Java code that is utilized by the Camel K integrations  
