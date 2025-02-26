package week4.tues.morningCodeAlong

object HigherOrderFunctions extends App {

  /** Higher Order Functions - HOF
   *
   * Definition: they are a function that EITHER takes in a function as a parameter or returns a function as a result.
   *
   * Why do we use them?
   *
   * 1. Modular, reusable code (often easier to read).
   *
   * 2. Reduce repeated code (makes code more concise).
   *
   * What do they do? manipulate collections (e.g. map, filter, fold, reduce, etc.)
   */

  //HOF - functions as parameters
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x)

  //Now we need to write functions which can be passed in to my HOF (Int => Int).
  def addTwo(x: Int): Int = x + 2
  def square(x: Int): Int = x * x
  def double(x: Int): Int = x * 2

  println(firstHigherOrderFunction(3, addTwo))
  println(firstHigherOrderFunction(3, square))
  println(firstHigherOrderFunction(3, double))

  //This method will process a List[String]
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function)
  def toUpper(str: String): String = str.toUpperCase
  def addS(str: String): String = str + "s"
  def toLower(str: String): String = str.toLowerCase

  val myList: List[String] = List("Apple", "Orange", "Mango", "Grape")

  println(processTheList(myList, toUpper))
  println(processTheList(myList, addS))
  println(processTheList(myList, toLower))

  // Fold Left
  val numbersList: List[Int] = List(1, 2, 3, 4, 5)
  numbersList.foldLeft(0)((acc, nextInt) => acc + nextInt) //Adds all the numbers in list
  //numbersList.foldLeft(0)(_+_) a shorthand of above

  //Method that takes List[String] and returns them as String (in sentence
  val stringList = List("we", "love", "scala")
  println(stringList.foldLeft("")((acc, word) => acc + " " + word).trim)

  //Fold Right is same as above except moves right to left

  //Task 1
  //a
  println(numbersList.foldLeft(1)((acc, nextInt) => acc * nextInt))
  println(numbersList.foldLeft(1)(_*_))

  //b
  println(numbersList.filter(int => int%2==0))

  //c
  println(stringList.foldLeft(0)((acc, nextWord) => acc + nextWord.length))

  //d
  println(stringList.foldLeft("")((acc, word) => acc + " " + word.capitalize).trim)


  //HOF - function is return type
  case class Employee(name: String, lengthOfEmployment: Int, salary: Double)
  val amanda = Employee("Amanda", 2, 30000.0)

  def bigPayRise: Double => Double = salary => salary * 2
  def mediumPayRise: Double => Double = salary => salary * 1.3
  def smallPayRise: Double => Double = salary => salary * 1.1

  //This is method that selects pay rise based on employment length
  def getPayRiseCalc(employee: Employee): Double => Double = {
    employee.lengthOfEmployment match {
      case year if year <= 3 => smallPayRise
      case year if year <= 5 => mediumPayRise
      case _ => bigPayRise //make sure everything else is caught when using wildcard
    }
  }

  //This method will return the new salary for a given employee.
  def getFinalSalary(employee: Employee): Double = {
    val applyThePayRise: Double => Double = getPayRiseCalc(employee)
    applyThePayRise(employee.salary)
  }

  println(getFinalSalary(amanda))


  //Task 2
  case class Item(price: Double)
  //a
  def smallDiscount: Double => Double = price => price * 0.8
  def medDiscount: Double => Double = price => price * 0.6
  def bigDiscount: Double => Double = price => price * 0.5

  def getDiscountCalc(item: Item): Double => Double = {
    item.price match {
      case price if price < 20 => smallDiscount
      case price if price <= 50 => medDiscount
      case _ => bigDiscount
    }
  }

  def getFinalPrice(item: Item): Double = {
    getDiscountCalc(item)(item.price)
  }

  //b
  val pictureFrame = Item(56)
  println(getFinalPrice(pictureFrame))
}
