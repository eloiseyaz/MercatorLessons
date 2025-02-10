package week2.mon.morningCodeAlong.family

class Name(val name: String)
class Age(val age: Int)

class Dog (val name: Name, val age: Age) {
  val tailWagging: Boolean = true
  val isGood: Boolean = true
  def speak: String = s"$name wants a treat"
}
