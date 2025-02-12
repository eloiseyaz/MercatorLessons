package week2.tues.morningCodeAlong.vehicles

class Car (brand: String, val fuelType: String) extends Vehicle(brand) {
  override def drive: String = s"This $brand car uses ${fuelType.toLowerCase} fuel."
}
