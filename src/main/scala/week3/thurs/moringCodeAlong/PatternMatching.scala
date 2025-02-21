package week3.thurs.moringCodeAlong

object PatternMatching extends App {

  val weather: String = "Cold"

  if (weather.toLowerCase == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid.")
  }

  weather.toLowerCase match {
    case "cold" => println(s"It is $weather! Take a coat.")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => println(s"$weather is not valid.") //Wildcard - this will catch anything else
  }

  val numOfMelons: Int = 2
  numOfMelons match {
    case 1 | 2 | 3 => println("He can carry them without a bag.")
    case 4 | 5 => println("He needs a bag.")
    case x => println(s"$x is invalid.") //if you want to use interpolation with an int, need to assign it to x rather than _ for wildcard
  }

  abstract class Notification //Have to extend this - abstract
  case class  Email (sender: String, title: String, body: String) extends Notification
  case class  Text (sender: String, body: String) extends Notification
  case class  VoiceNote (sender: String, lengthOfBody: Int) extends Notification

  val notification: Notification = Text("Mum", "Where are you?")

  notification match {
    case Email(sender, title, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + ". Message: " + body)
    case Text(sender, body) => println("Text from " + sender)
    case VoiceNote(sender, lengthOfBody) => println("Voice note from " + sender + ". Length: " + lengthOfBody)
  }

  //Task 1

  val flavour: String = "sweet"

  flavour match {
    case "spicy" => println("Try American Hot!")
    case "egg" => println("Try Florentine pizza!")
    case "fish" => println("Try pizza Napoli!")
    case x => println(s"I'm not sure what pizza is $x.")
  }

  //Task 2
  //a
  val pizzaSize: Int = 9
  pizzaSize match {
    case 7 => println("personal")
    case 9 => println("small")
    case 11 => println("medium")
    case 14 => println("large")
    case _ => println("Invalid pizza size")
  }
  //b
  case class Pizza (size: Int, crust: String)
  val pizzaOrder: Pizza = Pizza(7, "classic")
  val getPrice = pizzaOrder match {
    case Pizza(7, "classic") => 5.99
    case Pizza(9, "classic") => 10.99
    case Pizza(9, "italian") => 10.99
    case Pizza(11, "classic") => 12.99
    case Pizza(11, "italian") => 12.99
    case Pizza(11, "stuffed") => 15.98
    case Pizza(14, "classic") => 14.99
    case Pizza(14, "italian") => 14.99
    case Pizza(14, "stuffed") => 17.98
  }
  println(getPrice)
  }


