package week2.mon.afternoonTasks.mvp

object AnimalLogic extends App {
  val snowyOwlLifespanRange: ClassRange = new ClassRange(4, 5)
  val snowyOwlYoungRange: ClassRange = new ClassRange(5, 11)
  val bird: AnimalClass = new AnimalClass("Bird")
  val species1: Species = new Species("Snowy Owl", "Vunerable", snowyOwlLifespanRange, snowyOwlYoungRange, bird)
  val animal1: Animal = new Animal("Fluffy", 7, species1)
  println(animal1.name)
}
