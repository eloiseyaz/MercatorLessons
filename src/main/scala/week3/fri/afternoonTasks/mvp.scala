package week3.fri.afternoonTasks

import scala.util.matching.Regex

object mvp extends App {

  //Task 1
  case class Name(value: String)
  case class Postcode(value: String)

  //Task 2
  case class Letter(name: Name, postcode: Postcode)

  //Task 3
  trait GenericPostageError {
    def message: String
  }

  //Task 4
  case class InvalidNameError(message: String) extends GenericPostageError

  //Task 5
  case class InvalidPostcodeError(message: String) extends GenericPostageError

  // Task 9
  object Postcode {
    val validPostcode: Regex = "[A-Z]{1,2}[0-9][A-Z0-9]{0,1} [0-9][A-Z]{2}".r
     def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] = {
      if (validPostcode.matches(maybePostCode.toUpperCase)) Right(Postcode(maybePostCode))
      else Left(InvalidPostcodeError(maybePostCode))
    }
  }

  //Task  10
  object Name{
    val validName: Regex = "[a-z]".r
    def nameOrError(maybeName :String): Either[InvalidNameError, Name] = {
      if ("[0-9]".r.findFirstIn(maybeName) == None) Right(Name(maybeName))
      else Left(InvalidNameError(maybeName))
    }
  }

  //Task 11
  object Letter {
    def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] = for {
      name <- Name.nameOrError(maybeName)
      postcode <- Postcode.postcodeOrError(maybePostcode)
    } yield Letter(name, postcode)
  }
}