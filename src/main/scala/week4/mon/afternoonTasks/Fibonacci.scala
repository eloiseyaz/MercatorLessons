package week4.mon.afternoonTasks

class Fibonacci {
  def betterFibonacci(n: Int, acc: Int = 1): Option[Int] = {
    if (n < 0) None
    else if (n == 0) Some(0)
    else if (n <= 2) Some(acc)
    else betterFibonacci(n-1, acc + betterFibonacci(n-2).get)
  }
}
