package week2.tues.afternoonTasks.mvpTask4

case class Dragonfly(override val name: String, override val age: Int, override val exoColour: String, wingColour: String, override val wingspanInCm: Double) extends Insect(name, age, exoColour, true, wingspanInCm) with Species {
  override def describe: String = s"This is a dragonfly named $name. " + super.describe + s" They have wings which are $wingColour and span ${wingspanInCm*10}mm."

  override val speciesName: String = "Broad-bodied chaser"
  override val conservationStatus: ConservationStatus = LC
  override val averageLifespanRange: LifespanRange = LifespanRange.apply(AnimRange.apply(7, 56), "days")
  override val numberOfYoungRange: AnimRange = AnimRange.apply(100, 400)
  override val dietType: DietType = Carnivore
}
