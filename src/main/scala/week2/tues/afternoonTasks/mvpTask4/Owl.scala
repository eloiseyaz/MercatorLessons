package week2.tues.afternoonTasks.mvpTask4

case class Owl(override val name: String, override val age: Int, override val featherColour: String, override val beakLength: Double, hootsPerNight: Int, override val wingspanInCm: Double) extends Bird(name, age, featherColour, beakLength, true, wingspanInCm) with Species {
  override def describe: String = s"This is an owl named $name. " + super.describe + s" They can fly and have a wingspan of ${wingspanInCm/100}m. They hoot $hootsPerNight times per night."

  override val speciesName: String = "Snowy Owl"
  override val conservationStatus: ConservationStatus = VU
  override val averageLifespanRange: LifespanRange = LifespanRange.apply(AnimRange.apply(10, 28), "years")
  override val numberOfYoungRange: AnimRange = AnimRange.apply(5, 11)
  override val dietType: DietType = Carnivore
}