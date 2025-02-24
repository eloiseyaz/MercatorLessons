package week3.fri.morningCodeAlong

import java.time.LocalDate

object Eithers extends App {

  //Takes 2 different parameters - Left (Error) and Right (Success)
  //Right biased
  //Main use - error handling

  //  def isOdd(x: Int): Either[Boolean, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(false)
  //  println(isOdd(4)) //Left
  //  println(isOdd(7)) //Right


  //Let's make it better!!

  //1. Error handle using extends Exception --> custom errors but have to make sure we use val to make parameters reachable

  class NewError(val errorCode: Int, val errorMessage: String) extends Exception

  //Custom error
  case object IsOddError extends NewError(404, "Input is not odd, it is even.")

  def isOdd(x: Int): Either[NewError, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)

  println(isOdd(4)) //Left
  println(isOdd(7)) //Right


  //2. Error handle using Try/Catch - gives more inbuilt information

  def plusOne(x: String): Either[String, Int] = {
    try {
      Right(x.toInt + 1)
    } catch {
      case exception: Exception => Left(s"failed due to: $exception") //wildcard
    }
  }

  println(plusOne("1")) //Right
  println(plusOne("one")) //Left

  //Eithers with for comprehensions
  //Fail fast -- this means as soon as one condition hits a left, we exit to for comp.

  //Validate a User.

  case class User(username: String, password: String, dateOfBirth: LocalDate)

  /** Conditions:
   *
   * 1. Username but be at least 12 char long
   *
   * 2. Password must be a mixture of upper and lower case
   *
   * 3. Date of birth - must be at least 18
   */

  case class ValidatedUser(username: String, password: String, dateOfBirth: LocalDate) //Return type of final method

  case object UsernameError extends NewError(400, "Username is less than 12 characters long.")

  case object PasswordError extends NewError(400, "Password is not a mix of upper and lower case.")

  case object AgeError extends NewError(400, "")

  val usernameBad = User("user", "Password", LocalDate.of(1984, 3, 13))
  val passwordBad = User("validusername", "password", LocalDate.of(1984, 3, 13))
  val underage = User("validusername", "Password", LocalDate.of(2024, 3, 13))
  val validUser = User("validusername", "Password", LocalDate.of(1984, 3, 13))

  //1. Username
  def validateUsername(username: String): Either[NewError, String] = {
    if (username.length < 12) Left(UsernameError)
    else Right(username)
  }

  println("\nValidate username (bad - left): " + validateUsername(usernameBad.username))
  println("Validate username (success - right): " + validateUsername(validUser.username))

  //2. Password
  def validatePassword(password: String): Either[NewError, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password) Left(PasswordError)
    else Right(password)
  }

  println("\nValidate password (bad - left): " + validatePassword(passwordBad.password))
  println("Validate password (success - right): " + validatePassword(validUser.password))

  //3. Date of birth
  def validateAge(dateOfBirth: LocalDate): Either[NewError, LocalDate] = {
    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left(AgeError)
    else Right(dateOfBirth)
  }

  println("\nValidate age (bad - left): " + validatePassword(underage.password))
  println("Validate age (success - right): " + validatePassword(validUser.password))

  //4. Put all the methods together and return the ValidatedUSer if they are all happy.
  def validateUser(user: User): Either[NewError, ValidatedUser] = {
    for {
      username <- validateUsername(user.username) //calling our method, if happy (right), store in the val called username
      password <- validatePassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)
      validatedUser = ValidatedUser(username, password, dateOfBirth) //make case class using the stored data from the for comp
    } yield validatedUser //final return type
  }

  println("ValidateUser - bad username: " + validateUser(usernameBad)) //username error
  println("ValidateUser - bad password: " + validateUser(passwordBad)) //password error
  println("ValidateUser - bad date of birth: " + validateUser(underage)) //age error
  println("ValidateUser - all ok: " + validateUser(validUser)) //Right - ValidatedUser case class

  //Task
  def calculateMortgage(salary: Int, creditScore: Int): Int = {
    if (creditScore < 550) 0
    else salary * 4
  }

  def canPurchase(deposit: Int, askingPrice: Int): Boolean = {
    if (deposit / 10 >= askingPrice) true
    else false
  }

  case class Buyer(salary: Int, deposit: Int, creditScore: Int) {
    val mortgage: Int = calculateMortgage(salary, creditScore)
  }



}
