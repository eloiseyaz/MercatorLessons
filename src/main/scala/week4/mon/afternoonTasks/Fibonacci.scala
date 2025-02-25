package week4.mon.afternoonTasks

import scala.annotation.tailrec

class Fibonacci {
  def betterFibonacci(n: Int, acc: Int = 1): Option[Int] = {
    if (n < 0) None
    else if (n == 0) Some(0)
    else if (n <= 2) Some(acc)
    else betterFibonacci(n-1, acc + betterFibonacci(n-2).get)
  }

  //Lan Fibonacci
  def fibonacciRecursion(position: Int): Int = {
    @tailrec
    def fibonacciRecursionHelper(baseCountdown: Int, leftNum: Int, rightNum: Int, fibList: List[Int]): Int = {
      if (baseCountdown <= 1) leftNum
      else {
        println(s"$baseCountdown, $leftNum, $rightNum, $fibList")
        fibonacciRecursionHelper( baseCountdown - 1, rightNum, leftNum + rightNum, fibList :+ leftNum)
      }
    }
    fibonacciRecursionHelper(position, 0, 1, Nil)
  }

  //My mash-up
  def evenBetterFibonacci(n: Int, firstAcc: Long = 1, secondAcc: Long = 1): Either[String, Long] = n match {
    case n if n < 0 => Left(s"$n is not a valid index for this sequence.")
    case 0 => Right(0)
    case 1 => Right(firstAcc)
    case _ => evenBetterFibonacci(n-1, secondAcc, firstAcc + secondAcc)
  }
}

