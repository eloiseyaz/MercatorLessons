package week2.mon.morningCodeAlong.family

class Child (val forename: String) { // () - class parameters, {} - body of the class (all the logic)

  val under18: Boolean = true
  private def idPlease: String = "Can I see your ID?" // private - reduces the scope of where it is accessible, can only be called within the class body.


}
