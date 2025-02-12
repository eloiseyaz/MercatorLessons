package week2.tues.afternoonTasks.mvpTask4

case class WartHog(override val name: String, override val age: Int, override val furColour: String, tuskLength: Double) extends Mammal(name, age, furColour, true) with Species {
  override def describe: String = s"This is a warthog named $name. " + super.describe + s" Their tusks are ${tuskLength}cm long."

  override val speciesName: String = "Common Warthog"
  override val conservationStatus: ConservationStatus = LC
  override val averageLifespanRange: LifespanRange = LifespanRange.apply(AnimRange.apply(7, 11), "years")
  override val numberOfYoungRange: AnimRange = AnimRange.apply(2, 4)
  override val dietType: DietType = Omnivore
}
