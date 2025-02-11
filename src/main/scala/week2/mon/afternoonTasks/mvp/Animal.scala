package week2.mon.afternoonTasks.mvp

class Animal (val name: String, val age: Int, val species: Species){
}

object Animal {
  def apply(name: String, age: Int, species: Species) = new Animal(name, age, species)
}
