### 1. Multiple inheritance of state includes ability to inherit instance FIELDS from multiple classes
- Methods DON'T have state. Only the fields. Ability to inherit instance methods from multiple classes is called multiple inheritance of implementation.

### 3. Multiple inheritance of type includes ability to implement multiple interfaces and/or ability to extend from multiple classes

- Intefaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces
- "State", on the other hand, is represented by instance fields. Only a class can have instance fields and thus only a class can have a state.
- A class can only extend from one class at the most, so it can inherit only one state. Thus Java NOT support multiple inheritance of state.