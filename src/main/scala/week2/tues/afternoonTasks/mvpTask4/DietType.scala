package week2.tues.afternoonTasks.mvpTask4

//Monday Extension

sealed trait DietType {
  val diet: String
  val eats: String
}

object Herbivore extends DietType {
  val diet: String = "herbivore"
  val eats: String = "They only eat plants."
}

object Omnivore extends DietType {
  val diet: String = "omnivore"
  val eats: String = "They eat both meat AND plants."
}

object Carnivore extends DietType {
  val diet: String = "carnivore"
  val eats: String = "They only eat meat."
}