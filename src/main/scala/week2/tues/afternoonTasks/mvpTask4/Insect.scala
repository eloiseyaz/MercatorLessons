package week2.tues.afternoonTasks.mvpTask4

abstract class Insect (name: String, age: Int, val exoColour: String, override val canFly: Boolean, override val wingspanInCm: Double) extends Animal(name, age) with Flyable {
  override def describe: String = super.describe + s" Their exoskeleton is $exoColour."
}
