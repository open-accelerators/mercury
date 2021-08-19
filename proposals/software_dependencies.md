# Software Dependencies

Each Service Domain has a set of software dependencies defined
in the [Dominant Behaviors](./mercury_primer.md#dominant-behaviors).

## Common Dependencies

Any given Service Domain requires:

* `messaging`: For State Change notification and asynchornous first order connections
* `analysis-reporting`: For data monitoring of the business activity
* `security`: Authentication/Authorization
* `persistence`: Persist the records current state

## Specific Dependencies

* `rules-management`: Decision based behavior (DMN)
* `workflow-management` and `state-machine`: Business Process Management (BPM)
* `data-management`: Each service owns their own data repository.
