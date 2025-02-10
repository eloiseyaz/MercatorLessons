package week2.mon.morningCodeAlong.library

trait Genre {
  def enjoy: String = "Enjoy your book!"
}

trait Fantasy extends Genre {
  override def enjoy: String = "Enjoy your fantasy book!"
}

trait Thriller extends Genre