package week2.thurs.burger

abstract class Burger (val doublePatty: Boolean, val bunType: Burger.BunType) {

}

object Burger {
  sealed trait BunType
  case object SeededBun extends BunType
  case object SeedlessBun extends BunType
  case object Lettuce extends BunType
  case object GlutenFree extends BunType
}
