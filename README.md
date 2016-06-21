# Test project
This is simple technical task on code coverage, team work and work with code at all.

### Conditions:
1. You've joined the team which consists of:
    * Technical Lead(TL)
    * Business analyst(BA)
    * QA Engineer(QA)
    * Senior Developer(SD)
2. You've got a task: __please increase code coverage for the current project(add unit tests).__
3. You can address any questions to any person in the team(interviewer should cover it).
4. There are no possibilities to change existing code.
### Expected question(but not required!):
  - What is the purpose of using __strictfp__ key word in the class or in the method(TL or SD);
  - What will be usage of current code in business area: precision for unit tests(BA for business area and TL for current value);
  - Do we have any code convention on the project? What is current convention for tests?(QA, SD, TL)
  - What are maximum and minimum values for calculation operations(according to the spec)? What should happen if result of the operation or operands will exceed this value?(BA)
  - Which corner cases are necessary to be covered for math operation implementation? e.g. division by 0(QA or SD)
  - Which corner cases are necessary to be covered for _MathOperationExecutor_?(QA or SD)
### Result can be retrieved by the running _mvn install_ command
### Extended features:
* correct logic of mathematical operation can be changed to incorrect(e.g. in _Subtraction_ or _Division_ class leftOperand and rightOperand can be swapped)