package week2.mon.morningCodeAlong.library

import week2.mon.morningCodeAlong.family.Adult

class Book(val title: String, val author:Adult) extends ReadingFormat with Genre {
  def read: String = "Keep turning those pages!"
}

object Book {
  def apply(title: String, author:Adult) = new Book(title, author)
}