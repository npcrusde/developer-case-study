# Implement BenefitService
There exist users, users can have benefits(products), implement a service(`BenefitService`) that provides usefull utilities to work with benefit-user relation. There exists a certain flexibility of implementation of this task, we ask you to analyze `predef` package and derive business requirements and edge cases from types there.

## Acceptance criteria
- all error cases should be returned so that they can be further programatically processed by next software layer(e.g. other service/frontend)
- you can assign benefit to a user who has it scheduled
- you cannot assign benefit to user who has it at the moment
- unassign benefit removes only benefit assigned at the moment, it doesn't affect schedules
- you cannot unassign benefit if user doesn't have it at the moment
- you can schedule benefit for a user who already has it
- user can have miltiple schedules for different timestamps
- if there's any criteria missing - implement variant that you see fit


## Other details
- implement `trait BenefitService`
- provide a short description for 'Why did I choose this implementation?'/'Why did I decide this and not that?'
- the underlying data about users and benefits should be stored in a relation databse of your liking (e.g. Mysql or Postgres)
- any libraries are allowed
- do not change anything in `predef` package
- use scala3
- use `mill` build tool

## Extras
- provide a test suite for most critical cases
