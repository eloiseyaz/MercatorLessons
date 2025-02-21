package week3.thurs.afternoonTasks

import java.time.{LocalDate, MonthDay}
import java.time.temporal.ChronoUnit
import scala.io.StdIn.readLine

object mvp extends App {

  //Task 1
  val country: String = readLine("Pick a country: ")
  val formattedCountry = country.trim.toLowerCase.capitalize

  formattedCountry match {
    case "France" => println("Paris")
    case "England" => println("London")
    case "Russia" => println("Moscow")
    case "Italy" => println("Rome")
    case "Belarus" => println("Minsk")
    case "Germany" => println("Berlin")
    case x => println(s"Sorry! If $x is a country, I don't know the capital.")
  }


  //Task 2
  //a
  sealed trait Animal

  //b
  case object Pig extends Animal
  case object BlackRhino extends Animal
  case object Elephant extends Animal
  case object Orangutan extends Animal
  case object Cow extends Animal
  case object Chicken extends Animal
  case object Lemur extends Animal
  case object Mouse extends Animal

  //c
  def findFact(animal: Animal): Unit = animal match {
    case Pig => println("Pigs can fly!")
      case BlackRhino => println("Black rhinos run on their toes!")
      case Elephant => println("Elephants have big ears!")
      case Orangutan => println("Orangutans have 97% of DNA in common with humans!")
      case Cow => println("Cows only sleep around 30 minutes a day!")
      case Chicken => println("Chickens' heads stay stable regardless of their body movements!")
      case Lemur => println("Lemurs' tails are longer than their bodies!")
      case Mouse => println("Mice can squeeze through gaps the size of a pencil!")
  }

  //val chosenAnimal: Animal = Orangutan
  //findFact(chosenAnimal)


  //Task 3
  //a

  def calculateAge(date: LocalDate): Int = {
    ChronoUnit.YEARS.between(date, LocalDate.now).toInt
  }

  sealed trait StarSign
  case object Aquarius extends StarSign
  case object Pisces extends StarSign
  case object Aries extends StarSign
  case object Taurus extends StarSign
  case object Gemini extends StarSign
  case object Cancer extends StarSign
  case object Leo extends StarSign
  case object Virgo extends StarSign
  case object Libra extends StarSign
  case object Scorpio extends StarSign
  case object Sagittarius extends StarSign
  case object Capricorn extends StarSign

  def MonthDayBetween(date: MonthDay, start: MonthDay, end: MonthDay): Boolean = {
    if (date.isAfter(start) && date.isBefore(end)) true
    else false
  }

  def findStarSign(date: LocalDate): StarSign = {
    val birthday: MonthDay = MonthDay.from(date)
    if (MonthDayBetween(birthday, MonthDay.of(1, 19), MonthDay.of(2, 19))) Aquarius
    else if (MonthDayBetween(birthday, MonthDay.of(2, 18), MonthDay.of(3, 21))) Pisces
    else if (MonthDayBetween(birthday, MonthDay.of(3, 20), MonthDay.of(4, 20))) Aries
    else if (MonthDayBetween(birthday, MonthDay.of(4, 19), MonthDay.of(5, 21))) Taurus
    else if (MonthDayBetween(birthday, MonthDay.of(5, 20), MonthDay.of(6, 22))) Gemini
    else if (MonthDayBetween(birthday, MonthDay.of(6, 21), MonthDay.of(7, 23))) Cancer
    else if (MonthDayBetween(birthday, MonthDay.of(7, 22), MonthDay.of(8, 23))) Leo
    else if (MonthDayBetween(birthday, MonthDay.of(8, 22), MonthDay.of(9, 23))) Virgo
    else if (MonthDayBetween(birthday, MonthDay.of(9, 22), MonthDay.of(10, 24))) Libra
    else if (MonthDayBetween(birthday, MonthDay.of(10, 23), MonthDay.of(11, 22))) Scorpio
    else if (MonthDayBetween(birthday, MonthDay.of(11, 21), MonthDay.of(12, 22))) Sagittarius
    else Capricorn
  }

  def calculateAgeAtDeath(birthDate: LocalDate, deathDate: Option[LocalDate]): Option[Int] = deathDate match {
    case x => Some(ChronoUnit.YEARS.between(birthDate, x.get).toInt)
    case None => None
  }

  case class Person(fullName: String, dateOfBirth: LocalDate, occupation: Option[String], lastCountryOfResidence: String, dateOfDeath: Option[LocalDate]) {
    val age: Int = calculateAge(dateOfBirth)
    val starSign: StarSign = findStarSign(dateOfBirth)
    val ageAtDeath: Option[Int] = calculateAgeAtDeath(dateOfBirth, dateOfDeath)
  }

  def createPerson(fullName: String, dateOfBirth: LocalDate, occupation: Option[String], lastCountryOfResidence: String, dateOfDeath: Option[LocalDate]): Person = Person(fullName, dateOfBirth, occupation, lastCountryOfResidence, dateOfDeath)

  val geradus: Person = createPerson("Geradus Mercator", LocalDate.of(1512, 3, 5), Some("Geographer"),"Germany", Some(LocalDate.of(1594, 12, 2)))
  println(geradus.age, geradus.starSign, geradus.ageAtDeath)

  //b
  def horoscope(birthDate: LocalDate): (StarSign, String) = {
    val starSign = findStarSign(birthDate)
    val horoscope = starSign match {
      case Aquarius => "Luckiness lies ahead."
      case Pisces => "Be wise and great wealth will follow shortly."
      case Aries => "A big change is coming."
      case Taurus => "Love is on the horizon."
      case Gemini => "Be wary of those who say they're trustworthy."
      case Cancer => "An important person is coming into your life."
      case Leo => "Nurture your creativity and you will flourish."
      case Virgo => "Bright opportunities lie."
      case Libra => "Be more present and live for the moment."
      case Scorpio => "An abundance of joy is on its way."
      case Sagittarius => "Think carefully before making rash decisions."
      case Capricorn => "Go step by step and you will achieve your goals."
    }
    Tuple2(starSign, horoscope)
  }
  println(horoscope(geradus.dateOfBirth))
}
