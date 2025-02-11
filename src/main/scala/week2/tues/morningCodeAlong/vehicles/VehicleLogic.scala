package week2.tues.morningCodeAlong.vehicles

object VehicleLogic extends App {

  println("\n------Car------\n")
  val ford = new Car("Ford", "Petrol")
  println(ford.fuelType) //Comes from car
  println(ford.drive) //Comes from Vehicle, override in car
  println(ford.brand) //Comes from Vehicle
  println(ford.description) //Comes from Vehicle

  println("\n------Electric Car------\n")
  val electricFord = ElectricCar("Ford", 8) //new ElectricCar object (with charging time of 8 hours)
  println(electricFord.fuelType)
  println(electricFord.drive)
  println(electricFord.brand)
  println(electricFord.description) //All comes from same as above
  println(electricFord.noisyToDrive) //Comes from ElectricCar
  println(electricFord.timeToCharge) //Comes from Electric trait
  println(electricFord.charge) //Comes from Electric trait
}
