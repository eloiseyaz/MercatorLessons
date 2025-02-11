## Afternoon Task: Case classes and objects
### MVP:
1. What are three main differences between a class and a case class?
2. Without coding it, which of the following lines of code is runnable and which will produce an error? Then, code it and check!
* `case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)`\
   a) `val firstPerson = new Person("Carlos", 23, "Spanish", true)`\
   b) `val secondPerson = Person("Carlos", 23, "Spanish", true)`\
   c) `val thirdPerson = Person("Chloe", 25, "British", false)`
* `class Animal(name: String, colour: String, pet: Boolean)`\
   d) `val cat = Animal("cat", "black", true)`\
   e) `val dog = new Animal("dog", "white", true)`
3. After reviewing all combinations, which ones are true when compared using the `==`
   operator? Once decided, code it and check!
* `case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)`\
   a) `val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")`\
   b) `val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")`\
   c) `val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")`\
   d) `val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")`\
   e) `val oneMoreChocolateMuffin = Muffin(”Chocolate", 3.50, "Mercator Bakery")`\
   f) `val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")`
4. Go back to your animal sanctuary and begin by refactoring if you need to. Then change aspects of your code and experiment with scope. When/where can you access information?
* Add variables/values and methods in different places.
* Use keywords like ‘private’ and ‘abstract’. How can you use this? How does it affect access?
* Work with case classes. What needs to change when you change a class to a case class?

### Extension:
1. Construct a case class that takes in a minimum of 3 parameters, each of a different type,
   and a case object.
2. Create 3 instances of the case class.
3. Use the `.copy` method to create a further 3 instances, each time modifying a different
   class parameter.
4. Use the `.toString` method to print all parameters of the instance you have already
   created for exercise 3.
5. Use the `.equals` method to compare case class instances you have already created as
   part of the exercises so far.

### Research:
1. We discussed `.copy`, `.toString` and `.equals` methods but there are a lot more
   available, such as `.getClass`, `canEqual`, etc. Find as many as you can, what do they
   do? Try to apply them the case classes you’ve created.
2. Is there difference between `.equals` and `.==` methods and why?