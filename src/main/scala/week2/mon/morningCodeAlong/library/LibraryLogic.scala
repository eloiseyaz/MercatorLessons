package week2.mon.morningCodeAlong.library

import week2.mon.morningCodeAlong.family.{Adult, Forename, Surname}

object LibraryLogic extends App{

  val harryPotter: Book = new Book ("Harry Potter", new Adult(new Forename("J.K."), new Surname("Rowling"))) with Fantasy with AudioBook with DigitalBook with PhysicalBook

  println(harryPotter.author.forename.forename)
  println(harryPotter.title)
  println(harryPotter.read)
  println(harryPotter.enjoy)

  val goneGirl: Book = new Book("Gone Girl", new Adult(new Forename("Gillian"), new Surname("Flynn"))) with Thriller
  println(goneGirl.enjoy)
}
