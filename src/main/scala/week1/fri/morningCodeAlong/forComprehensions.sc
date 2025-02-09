/**
 * These work on monadic types - Seq, List, Option, Either, Future (will not work on String, Int, Boolean)
 *
 * <- (backwards arrow), simple way of writing a function (flatmap, filter, map, foreach)
 *
 * yield - call the map
 */

//classic
def retrieveNums: Seq[Int] = for (num <- 1 to 10) yield num
retrieveNums
(1 to 10).foreach(num => println(num))

//use operators
def squareNums: Seq[Int] = for (num <- 1 to 5) yield num * num
squareNums

//if guards
def useIfGuard: Seq[Int] = for (num <- 1 to 10 if num % 2 == 0) yield num
useIfGuard


val animals: List[String] = List("Chicken", "Dog", "Hippo", "Cow")
def addS(aList: List[String]): List[String] = aList.map(str => str + "s")
addS(animals)

def lowerCase(aList: List[String]): List[String] = aList.map(str => str.toLowerCase)
lowerCase(animals)

def lowerCaseAndAddS(aList: List[String]): List[String] = for {
  addAnS <- addS(aList)
  lower <- lowerCase(List(addAnS))
} yield lower
lowerCaseAndAddS(animals) //gives a list
lowerCaseAndAddS(animals).mkString(", ")


//Task 1
//a - returns list all in lowercase (see lowerCase line 27)

//b - returns list with first letter capitalised
def capitalise(aList: List[String]): List[String] = aList.map(str => str.capitalize)

// run both methods of following list:
val names: List[String] = List("aRIa", "BaRT", "ChUCk")
def formatNames(aList: List[String]): List[String] = for {
  lower <- lowerCase(aList)
  capital <- capitalise(List(lower))
}yield capital
formatNames(names)

//Task 2
def formatProperNouns(aList: List[String]): List[String] = aList.map(str => str.toLowerCase.capitalize)
formatProperNouns(names)