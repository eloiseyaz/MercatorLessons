package week2.tues.morningCodeAlong

object CaseClasses extends App{

  //Standard Class
  class SuperHero(val realName: String, val heroName: String, val weakness: String)
  new SuperHero("Clark Kent", "Superman", "Kryptonite") //Made a new SuperHero object from the SuperHero class.

  //Case Class
  case class SuperHero2(realName: String, heroName: String, weakness: String) //each parameter is a val by default
  val superman = SuperHero2.apply("Clark Kent", "Superman", "Kryptonite") //.apply method is built in. Object is  made using the SuperHero2 case class.
  val superman2 = SuperHero2.apply("Clark Kent", "Superman", "Kryptonite") //.apply method is built in. Object is  made using the SuperHero2 case class.
  println(superman == superman2) //True - compares the field values not the object reference/memory location (like classes).

  //.copy method
  val copiedSuperman = superman.copy(weakness = "gravity")
  println(copiedSuperman.weakness)
  println(superman.weakness)
  val updatedName = superman.copy(realName = "Andy Probert", weakness = "pints")
  println(updatedName.realName + updatedName.weakness)

}

//Task
object KennelTask extends App {

  case class Dog(name: String, breed: String, age: Int)

  val spot = Dog.apply("Spot", "Dalmatian", 3)
  val pongo = Dog.apply("Pongo", "Labrador", 10)
  val max = Dog.apply("Max", "German Shepherd", 2)
  val fluffy = Dog.apply("Fluffy", "Husky", 5)

  case class Kennel(name: String, dogs: List[Dog])

  val myKennel = Kennel.apply("The Kennel", List(spot, pongo, max, fluffy))
}
