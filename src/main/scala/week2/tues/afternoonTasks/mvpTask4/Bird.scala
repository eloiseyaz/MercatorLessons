package week2.tues.afternoonTasks.mvpTask4


abstract class Bird (name: String, age: Int, val featherColour: String, val beakLength: Double, override val canFly: Boolean, override val wingspanInCm: Double) extends Animal(name, age) with Flyable {
  override def describe: String = super.describe + s" They have $featherColour feathers and a ${beakLength}cm long beak."
}
