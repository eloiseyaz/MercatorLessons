package week4.tues.afternoonTasks

object mvp extends App {

  //Task 1
  //a
  def intDoubler(n: Int): Int = 2 * n

  //b
  def applyTwice(input: Int, f: Int => Int): Int = f(f(input))

  //c
  println(applyTwice(4, intDoubler))


  //Task 2
  //a
  def add(x: Double, y: Double): Double = x + y
  def multiply(x: Double, y: Double): Double = x * y
  def subtract(x: Double, y: Double): Double = x - y
  def divide(x: Double, y: Double): Double = x / y

  //b
  def doubleManipulator(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)


  //Task 3
  //a
  def convertToUpperCase(str: String): String = str.toUpperCase

  //b
  def convertToLowerCase(str: String): String = str.toLowerCase

  //c
  def stringConverter(makeStringUpperCase: Boolean): String => String = {
    if (makeStringUpperCase) convertToUpperCase
    else convertToLowerCase
  }

  //d
  val testString = "cOnVeRtMe"
  println(stringConverter(true)(testString))
  println(stringConverter(false)(testString))


  //Task 4
  //a
  def calculate(operation: String): (Double, Double) => Double = operation.toLowerCase match {
    case "add" => add
    case "multiply" => multiply
    case "subtract" => subtract
    case "divide" => divide
  }

  //b
  println(calculate("add")(3, 4))
  println(calculate("subtract")(3, 4))
  println(calculate("multiply")(3, 4))
  println(calculate("Divide")(3, 4))
  //println(calculate("minus")(3, 4)) no wildcard so causes problems

  //c
  def betterCalculate(operation: String): Either[String, (Double, Double) => Double] = operation.toLowerCase match {
    case "add" => Right(add)
    case "multiply" => Right(multiply)
    case "subtract" => Right(subtract)
    case "divide" => Right(divide)
    case _ => Left("Invalid input")
  }

}
