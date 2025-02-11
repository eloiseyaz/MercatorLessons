package week2.tues.afternoonTasks.mvpTask4

sealed trait ConservationStatus {
  val fullConStatus: String
  val conStatus: String
  val widerConStatus: String
}

object EW extends ConservationStatus {
  val fullConStatus: String = "Extinct in the Wild"
  val conStatus: String = "EW"
  val widerConStatus: String = "Extinct"
}

object CR extends ConservationStatus {
  val fullConStatus: String = "Critically Endangered"
  val conStatus: String = "CR"
  val widerConStatus: String = "Threatened"
}

object EN extends ConservationStatus {
  val fullConStatus: String = "Endangered"
  val conStatus: String = "EN"
  val widerConStatus: String = "Threatened"
}

object VU extends ConservationStatus {
  val fullConStatus: String = "Vulnerable"
  val conStatus: String = "VU"
  val widerConStatus: String = "Threatened"
}

object NT extends ConservationStatus {
  val fullConStatus: String = "Near Threatened"
  val conStatus: String = "NT"
  val widerConStatus: String = "Lower Risk"
}

object CD extends ConservationStatus {
  val fullConStatus: String = "Conservation Dependent"
  val conStatus: String = "CD"
  val widerConStatus: String = "Lower Risk"
}

object LC extends ConservationStatus {
  val fullConStatus: String = "Least Concern"
  val conStatus: String = "EW"
  val widerConStatus: String = "Lower Risk"
}

object DD extends ConservationStatus {
  val fullConStatus: String = "Data Deficient"
  val conStatus: String = "DD"
  val widerConStatus: String = "Other"
}

object NE extends ConservationStatus {
  val fullConStatus: String = "Not Evaluated"
  val conStatus: String = "NE"
  val widerConStatus: String = "Other"
}
