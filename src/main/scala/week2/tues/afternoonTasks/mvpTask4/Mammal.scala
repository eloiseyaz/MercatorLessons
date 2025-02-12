package week2.tues.afternoonTasks.mvpTask4

abstract class Mammal (name: String, age: Int, val furColour: String, val hasTail: Boolean) extends Animal(name, age) {
  override def describe: String = super.describe + s" They have $furColour fur${if (hasTail) " and a tail" else ""}."
}
