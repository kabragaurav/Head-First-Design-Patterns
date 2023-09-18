The strategy design pattern 
- A class that does lot of things of same type depending on request
- Extract these lot of things into separate classes called strategies
- The main class relies on strategy object to do work, instead of its own

Let us say we had a Ducks. Product wanted to add ducks such as RubberDuck, WoodenDuck. <br/>
RubberDuck can squeak but cannot fly. <br/>
WoodenDuck can neither squeak nor fly. <br/>

1. Inheritance <br/>
So, if we keep fly() and quack() method in Duck class, all its implementations have to provide concrete
implementation for these methods. They can skip fly() or quack() if not applicable. <br/>

2. Composition <br/>
We know that fly() and quack() methods differ duck to duck. 
So separate them out in their own classes (see image). <br/>
The duck can now delegate flying and quacking to these classes which can be set using setters.
![Alt text](img/Head%20First%20Design%20Pattern.png "a title")
