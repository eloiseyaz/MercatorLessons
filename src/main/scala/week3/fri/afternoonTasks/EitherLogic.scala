package week3.fri.afternoonTasks

import week3.fri.afternoonTasks.mvp.{InvalidNameError, Letter, Name, Postcode}

object EitherLogic extends App {
  //Task 6 & 7
  val letter: Right [Nothing, Letter] = Right(Letter.apply(Name("Eloise Holland"), Postcode("SE1 5RT")))
  val invalidLetter: Left [InvalidNameError, Nothing] = Left(InvalidNameError.apply("The name is invalid."))

  //Task 8
  println(letter)
  println(invalidLetter)

  //Task 12
  val letterWithANumberInName = Letter.letterOrError("Elo1se Holland", "SE1 5RT")
  val letterWithAnInvalidPostcode = Letter.letterOrError("Eloise Holland", "SE15RT")
  val letterAllInvalid = Letter.letterOrError("Elo1se Holland", "SE15RT")
  val letterAllValid = Letter.letterOrError("Eloise Holland", "SE1 5RT")

  //Task 13
  println(letterWithANumberInName)
  println(letterWithAnInvalidPostcode)
  println(letterAllInvalid) //gives InvalidNameError because name is checked first in the letterOrError method
  println(letterAllValid)
}