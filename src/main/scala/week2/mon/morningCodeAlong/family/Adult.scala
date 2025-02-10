package week2.mon.morningCodeAlong.family

class Forename (val forename: String)
class Surname (val surname: String)

class Adult (val forename: Forename, val surname: Surname) { //Type safe because we use classes as types.
  val under18: Boolean = false
}

object Adult {
  def apply(forename: Forename, surname: Surname): Adult = new Adult(forename, surname)
}