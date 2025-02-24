package week4.mon.morningCodeAlong

import scala.annotation.tailrec

object Recursion extends App {

  /** Standard Recursion
   *
   * This is when a method is called inside itself.
   *
   * Each new call adds to the call stack. All of these calls are remembered.
   *
   * It will continue to recursively call until the base case is reached. Once here, it is resolved in reverse order.
   */

  def factorial(n: Int): Option[Int] = {
    if (n < 1) None
    else if (n == 1) Some(1)
    else Some(n * factorial(n - 1).get)
  }
  println(factorial(4).get) //returns 24
  println(factorial(20).get) //returns a negative (2s complement?) can get this if we use Long instead of Int
  println(factorial(50).get) //returns 0, num is just way too big
  // println(factorial(10000).get) crashes as is too many calls (stack overflow error)

  /** Tail Recursion
   *
   * Smarter way to write recursion because it stops stack overflow errors.
   *
   * Key Differences:
   *
   * 1. Recursive call must be the last operation a function performs. (@tailrec - will check this)
   *
   * 2. Prevents stack overflow error because it doesn't remember all the previous values, the information is passed through as an accumulator (acc). Scala replaces recursive calls with a simple loop called Tail Call Optimization (TCO).
   *
   * There are 2 ways to do this.
   */

  //Way 1 - with a helper method
  def tailFactorialWithHelper(n: Int): Option[Int] = {
    @tailrec
    def factorialHelper(m: Int, acc: Int): Option[Int] = {
      //method goes in here
      if (m < 1) None
      else if (m == 1) Some(acc)
      else factorialHelper(m-1, acc*m)
    }
    factorialHelper(n, 1)
  }

  println(tailFactorialWithHelper(1).getOrElse("Invalid input"))

  //Way 2 - without helper method
  @tailrec
  def tailFactorialNoHelper(n: Int, acc: Int = 1): Option[Int] = {
    if (n < 1) None
    else if (n == 1) Some(acc)
    else tailFactorialNoHelper(n-1, acc*n)
  }

  println(tailFactorialNoHelper(5).get)

  //Example with string
  @tailrec
  def concatenateWords(word: String, n: Int, acc: String = ""): String = {
    if(n <= 0) acc
    else concatenateWords(word, n-1, word + acc)
  }

  println(concatenateWords("hello", 5))

  //Task
  //a)
  def listLen(list: List[Any]): Int = {
    if (list == List()) 0
    else 1 + listLen(list.tail)
  }

  //b
  @tailrec
  def listLenTail(list: List[Any], acc: Int = 0): Int = {
    if (list == List()) acc
    else listLenTail(list.tail, acc + 1)
  }

  //Extension
  def listLenMatch(list: List[Any], acc: Int = 0): Int = list match {
    case List() => acc
    case _ => listLenMatch(list.tail, acc + 1)
  }

  //Self Extension Task - Want to try tail fibonacci
  def fibonacci(n: Int, acc: Int = 1): Int = {
    if (n <= 2) acc
    else fibonacci(n-1, acc + fibonacci(n-2))
  }
}
