package week2.tues.morningCodeAlong.vehicles

case class ElectricCar(override val brand: String, timeToCharge: Int) extends Car(brand, "Electric") with Electric {
  val noisyToDrive: Boolean = false
}
//override val - WHY?
//class -> case class. Case class will autogenerate the val field, we also have the val field being passed down with inheritance.
//We need to explicitly redefine the inherited val.