package week2.mon.afternoonTasks.mvp

class ClassRange (val lower: Int, val upper: Int)

class Species (val speciesName: String, val conservationStatus: String, val avgLifespanRange: ClassRange, val numOfYoungRange: ClassRange, val animalClass: AnimalClass){
}
