val melons: Int = 3
val hasBag:Boolean = false
val cost: Double = melons * 1.397

if (melons < 0) {
  println(s"You can't have $melons watermelons. Input a natural number.")
} else if (melons <= 3) {
  println(f"You are buying $melons%d watermelon(s). That will cost you £$cost%.2f. You can carry these without a bag.")
} else if (melons <= 5 && hasBag) {
  println(f"You are buying $melons%d watermelons. That will cost you £$cost%.2f. You will need a bag to carry these.")
} else {
  println(f"$melons%d is too many watermelons for you to carry! It would cost you £$cost%.2f.")
}