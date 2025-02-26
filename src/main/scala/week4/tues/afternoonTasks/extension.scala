package week4.tues.afternoonTasks

object extension extends App {

  //Task 1
  //a
  def max(x: Double, y: Double): Double = x.max(y)

  //b
  def funcListNum(list: List[Double], f: (Double, Double) => Double): Double = {
    list.reduce((x, y) => f(x, y))
  }


  //Task 2
  //a
  def applyFunc (f: Int => Int, givenInt: Int): Int = f(givenInt)

  //b
  def triple(givenInt: Int): Int = 3 * givenInt
  def square(givenInt: Int): Int = givenInt * givenInt

  //c
  println(applyFunc(triple, 5))
  println(applyFunc(square, 5))


  //Task 3
  //a
  def power(exponent: Int): Int => Int = {
    def returnPower(base: Int): Int = Math.pow(base, exponent).toInt
    returnPower
  }

  //b
  val newSquare = power(2)

  //c
  println(newSquare(6))

}
