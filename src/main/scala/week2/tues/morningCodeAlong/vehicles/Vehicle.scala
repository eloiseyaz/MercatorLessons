package week2.tues.morningCodeAlong.vehicles

abstract class Vehicle (val brand: String) {
  def drive: String //abstract method
  val description: String = s"This vehicle is a $brand."
}
//Abstract - WHY?
//1. Prevents me making (instantiating) a Vehicle - have to extend it.
//2. Then why not a trait if it's always going to be extended? I want constructor parameters (brand), traits do not allow for this.