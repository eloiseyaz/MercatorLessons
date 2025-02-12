package week2.tues.afternoonTasks.mvpTask4


trait Species {
  val speciesName: String
  val conservationStatus: ConservationStatus
  val averageLifespanRange: LifespanRange
  val numberOfYoungRange: AnimRange
  val dietType: DietType
}
