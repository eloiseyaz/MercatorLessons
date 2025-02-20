package week3.thurs.moringCodealong

object Options extends App {

  trait Pizza {
    val size: Int
    val crust: Option[String]
  }

  object Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") //Must wrap in a Some if we are giving it 'SOMEthing'
  }

  object Small extends Pizza {
    override val size: Int = 9
    override val crust: Option[String] = None //Not giving a default
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic") //Assigning a default
  }

  object Large extends Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  val newPizzaOrder = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("stuffed")
  }

  val emptyCrustPizzaOrder = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = None
  }

  def whatCrust(pizza: Pizza): String = {
    pizza.crust match {
      case Some("classic") => "Classic crust"
      case Some("italian") => "Italian crust"
      case Some("stuffed") => "Stuffed crust"
      case None => "Just the classic crust"
    }
  }

  println(whatCrust(newPizzaOrder))

  //get or else
  println(newPizzaOrder.crust.get) //GET whatever is inside the Some
  //This will not work with the None. There is nothing to get --> use the else
  println(emptyCrustPizzaOrder.crust.getOrElse("classic")) //Either get the contents of the Some OR return the default value given here

  //Task
  case class ChocolateBar (filling: Option[String])

  def getFilling(chocolateBar: ChocolateBar): String = {
    chocolateBar.filling.getOrElse("just chocolate")
  }

  object DairyMilk extends ChocolateBar(None)
  object Bounty extends ChocolateBar(Some("coconut"))
  object Mars extends ChocolateBar(Some("caramel and nougat"))

}

