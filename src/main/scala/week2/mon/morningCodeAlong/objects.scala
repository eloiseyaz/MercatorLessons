package week2.mon.morningCodeAlong

object objects extends App{

  object primaryColours { //grouping
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "red"
  }

  //calling the objects
  println(primaryColours.red)
  println(primaryColours.red.toUpperCase)

  object daysOfWeek {
    val mon: String = "Monday"
    val tues: String = "Tuesday"
    val wed: String = "Wednesday"
    val thurs: String = "Thursday"
    val fri: String = "Friday"
    val sat: String = "Saturday"
    val sun: String = "Sunday"
  }

  println(daysOfWeek.mon, daysOfWeek.tues)
}
