package week2.tues.afternoonTasks.mvpTask4

object AnimalLogic extends App{
  val fluffy: WartHog = WartHog.apply("Fluffy", 7, "orange", 15)
  val hooty: Owl = Owl.apply("Hooty", 3, "brown", 2, 42, 90)
  val toothless: Dragonfly = Dragonfly.apply("Toothless", 2, "blue", "dark brown", 5.3)
  println(fluffy.describe)
  println(hooty.describe)
  println(toothless.describe)
  println(toothless.dietType.diet)
}
