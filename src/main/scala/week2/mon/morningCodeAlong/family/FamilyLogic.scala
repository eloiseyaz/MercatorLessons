package week2.mon.morningCodeAlong.family

object FamilyLogic extends App{

  new Child("Alice") //1 use
  val child1 = new Child("Alice")
  val child2 = new Child("Alice")
  println("Is child1 and child 2 the same? " + (child1 == child2)) //False, each is a new object in memory.

  println(child1.forename)
  println(child1.under18)
  //println(child1.idPlease) //cannot access this because the method is private in child class

  val nick = new Child("Nick")

  //Adult
  val adult1: Adult = Adult.apply(new Forename("Eloise"), new Surname("Holland")) //with apply method
  val adult2: Adult = new Adult(new Forename("Eloise"), new Surname("Holland")) //without apply method - need to use keyword `new`
  println(adult1.forename) //accessing the class level of Forename
  println(adult1.forename.forename) //accessing inside the Forename class to get the string

  //Dog Task
  val bingo: Dog = new Dog(new Name("Bingo"), new Age(5))
  println(bingo.age.age)
  println("Is Bingo's tail wagging? " + bingo.tailWagging)
  println("Is Bingo a good dog? " + bingo.isGood)
}
