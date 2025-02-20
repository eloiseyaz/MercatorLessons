package week2.tues.afternoonTasks

/** Task 1
 *
 * 1. A class can be extended whereas a case class cannot.
 *
 * 2. A case class has boilerplate code built in whereas this all needs to be written for a class.
 *
 * 3. A class needs the keyword `new` to instantiate a value whereas this is not needed in a case class.
 * */

object mvp extends App{

  /** Task 2 */
  case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)
  //a) Runnable - doesn't need the new, but it still works
  val firstPerson = new Person("Carlos", 23, "Spanish", true)

  //b) Runnable
  val secondPerson = Person("Carlos", 23, "Spanish", true)

  //c) Runnable
  val thirdPerson = Person("Chloe", 25, "British", false)


  class Animal(name: String, colour: String, pet: Boolean)
  //d) Produces error (`new` is necessary as Animal is a class, not a case class)
  //val cat = Animal("cat", "black", true)

  //e) Runnable
  val dog = new Animal("dog", "white", true)

  /** Task 3 */
  case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)

  val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
  val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
  val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
  val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
  val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")

  //chocolateMuffin and anotherChocolateMuffin are the only pairing which will return true as they are the only pair which has the same flavour string and the rest of their information is also the same.

  println(chocolateMuffin == anotherChocolateMuffin)
}
