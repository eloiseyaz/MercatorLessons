/** Examples */

(number: Int) => number + 1 //Anonymous function - cannot reuse anywhere else.
val addOne = (number: Int) => number + 1 //Named function - only done when we want to reuse, cannot override it because it's immutable.
def add (number:Int): Int = number + 1 //Method (which is type of function) - named so we can reuse it, must have a name!
//override def add (number:Int): Int = number + 10 //Override method - same name with different implementation.

//Task 1 - println() is never the last expression of a method because it is of type unit which cannot be used anywhere else.

//Task 2 - Whether aValue is true or false, the function below will return 42 as it's the last expression in the method
val aValue: Boolean = 2 < 3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42
}

def makeATea(sugars: Int, milks: Int): String = {
  s"Add boiling water to your cup with a teabag.\nAdd $sugars spoonful(s) of sugar and $milks splashes of milk.\nStir and enjoy!"
}
makeATea(3, 2)

val vat: Double = 1.2
def priceIncVat(priceOfItem: Double): Double = {
  BigDecimal(priceOfItem * vat).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}


//Task 1 - Method which takes 2 inputs and returns saying if the first or second input was bigger. If they are equal it returns "same".
def getBigVal(input1: Int, input2: Int): String = {
  if (input1 > input2) "first"
  else if (input1 < input2) "second"
  else "same"
}

//Task 2 - Method which takes someone's first and surname. It returns the length of the longest name or 0 if both names are the same length.
def nameLength(firstName: String, surname: String): Int = {
  val firstNameLen: Int = firstName.length
  val surnameLen: Int = surname.length
  if (firstNameLen > surnameLen) firstNameLen
  else if (firstNameLen < surnameLen) surnameLen
  else 0
}

/** Referential Transparency
 *
 * We say something has referential transparency when a function's return value is based solely on the input. (i.e. addition(1, 2) always = 3)
 */
def addTwoInts(x: Int, y: Int): Int = x + y
3 + 3
3 + addTwoInts(1, 2)
addTwoInts(1, 2) + addTwoInts(1, 2)
6
//When writing more complex code think about what is simpler for our brains