Decorator Pattern
- Handful of classes but they can be combined to form more classes
- E.g. Americano, Latte and Mocha are three classes on their own. Then they can be combined within themselves
to form total of 7 classes. This is "class explosion" problem
- Basically creating combined classes is duplicating code of existing classes.

Advantages
- Adding optional extra behaviour at runtime is easy
- A common interface for end user even though multiple wrappers are there
- Especially if class is `final`, cannot use inheritance
- Follows S of SOLID principle

Disadvantage
- Order of wrapping matters

![Decorator Pattern](img/Decorator%20Design%20Pattern.png "Decorator Pattern")

