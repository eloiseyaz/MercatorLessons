package week4.mon.afternoonTasks

import scala.annotation.tailrec

object mvp extends App {
  //Task 1
  //a
  object Euros2024 extends Enumeration {
    val Spain,
    England,
    France,
    Netherlands,
    Germany,
    Portugal,
    Switzerland,
    Türki̇ye,
    Austria,
    Belgium,
    Denmark,
    Georgia,
    Italy,
    Romania,
    Slovakia,
    Slovenia = Value
  }

  //b
  @tailrec
  def printableList(list: List[Any], acc: String = ""): String = {
    if (list == List()) acc
    else if (list.length == 1) printableList(list.tail, acc + list.head.toString)
    else printableList(list.tail, acc + list.head.toString + ", ")
  }
  println(printableList(Euros2024.values.toList))


  //Task 2
  //a
  sealed class Team(name: String)
  object Team {
    //b
    case object Spain
    case object England
    case object France
  }
  val teamList:List[Object] = List(Team.Spain, Team.England, Team.France)
  println(printableList(teamList))
  //longer to access so a bit annoying


  //Task 3
  @tailrec
  def triangle(n: Int, acc: Int = 0): Either[String, Int] = n match {
    case n if n < 0 => Left("Not a positive integer.")
    case 0 => Right(acc)
    case _ => triangle(n-1, n+acc)
  }


  //Task 4
  val list: List[Int] = (for {
    num <- 1  to 20
  } yield num).toList

  def isEven(i: Int): Either[String, Boolean] = i match {
    case i if i < 0 => Left(s"There is no position $i in the list.")
    case i if i < list.length => Right(list(i)%2==0)
    case i => Left(s"There is no position $i in the list.")
  }

  @tailrec
  def isEvenRecursive(i: Int, nums: List[Int], acc: Boolean = false): Either[String, Boolean] = i match {
    case i if i < 0 || i >= nums.length=> Left(s"There is no position $i in the list.")
    case 0 => Right(acc)
    case _ => isEvenRecursive(i-1, nums, !acc)
  }

  @tailrec
  def isEvenRecursiveAgain(i: Int, nums: List[Int]): Either[String, Boolean] = i match {
    case i if i < 0 || i >= nums.length=> Left(s"There is no position $i in the list.")
    case 0 => Right(nums.head % 2 == 0)
    case _ => isEvenRecursiveAgain(i-1, nums.tail)
  }
}
