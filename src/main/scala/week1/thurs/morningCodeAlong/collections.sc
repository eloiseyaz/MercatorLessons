//Seq, List, Map (notice the uppercase)

val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5)
val firstList: List[Int] = List(1, 2, 3, 4, 5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)

//Map has key-value pairs (key -> value). Their types should be declared in the value parameters

//Accessing data

//Seq
val getSeqData: Int = firstSeq(0)
val getSeqHead: Int = firstSeq.head //gets first elem (index 0)
val getSeqTail: Seq[Int] = firstSeq.tail //gets everything except the head
val getSeq2Data: Int = firstSeq(2)
// val getTOoMuchData: Int = firstSeq(12) //out of bounds exception as we have no data in 12th position

//List
val getList1data: Int = firstList(1)
val getListTail: List[Int] = firstList.tail
val getLastInList: Int = firstList.last

//Map
val getMapData = firstMap("three") //enter key to get its value

/** Manipulating data - using map (lowercase) */

val tripledList: List[Int] = firstList.map{
  number => number * 3
}
val tripledSeq: Seq[Int] = firstSeq.map{
  _ * 3
} //bad practise to not name elem

val tripledMap: Map[String, Int] = firstMap.map{
  case (key, value) => (key, value * 3)
}
val changeKey: Map[String, Int] = firstMap.map{
  case (key, value) => (key.capitalize, value)
}
val changeKeyandValue: Map[String, Int] = firstMap.map{
  case (key, value) => (key.capitalize, value * 3)
}

/** Manipulating data - filtering */
//filter
val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number >= 2
)
val filteredList: List[Int] = firstList.filter(
  number => number >= 2
)
filteredSeq == filteredList //returns true because same results

val filteredMap: Map[String, Int] = firstMap.filter(
  number => number._2 >= 2
) //1 is the access key, 2 is the access value

//filterNot (similar to !=)
val filterNotList: List[Int] = firstList.filterNot(number => number >= 2)
val altfilterNotList: List[Int] = firstList.filter(
  number => !(number >= 2)
) //how you do it with filter instead of filterNot

/** Manipulating data - check if an element is present (boolean result) */
//exists - gives condition which at least some data must meet
val existsSeq: Boolean = firstSeq.exists(number => number >= 7)
val existsList: Boolean = firstList.exists(number => number >=2)
val existsMap: Boolean = firstMap.exists(number => number._2 >= 2)

//contains - gives specific piece of data to look for
val containsSeq: Boolean = firstSeq.contains(7)
val containsList: Boolean = firstList.contains(2)
val containsMap: Boolean = firstMap.contains("two") //checks the keys!
val containsOrSeq: Boolean = filteredSeq.contains(7) || firstSeq.contains(12)

/**Task 1 */

//1
val names: Seq[String] = Seq("Waris", "Nimo", "Dorothea", "Sandra", "Lan", "Eloise", "April", "Ash", "Tudor", "Farnoosh")

//2
val colourMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)
val filterColours: Map[Int, String] = colourMap.filter(colour => colour._2 == "blue")

//3
val addOneSeq: Seq[Int] = firstSeq.map(number => number + 1)

//4
val filterOutEvensList: List[Int] = firstList.filterNot(number => number % 2 == 0)

//5
val namesContainR: Boolean = names.exists(name => name.toLowerCase.contains("r"))

/**Task 2
 *
 * 1 - A Set is an unordered iterable that contains no duplicate elements.
 *
 * 2 - flatMap does the same thing as the map method and then does the flatten method to the result. Flatten collapses elements of a collection to create one single collection with elements of the same type (i.e. if you flatten an object of type `List[List[Int]]`, it will return a value of type `List[Int]`).
 */
val flatLowerNames = names.flatMap(name => name.toLowerCase)

/**Making additions - prepend or append */
var x = Seq[Int]()
x = x :+ 1
x = x :+ 2
x //won't work with val (immutable) but does for var (but that is bad practise)

//workaround - create a new val each time
val y: Seq[Int] = Seq(3, 4, 5)
val appendY = y :+ 6
val prependSeq = 2 +: appendY
val appendMultiple = Seq(0, 1, 2) ++ appendY
val appendMap = firstMap + ("six" -> 6) //to order use ListMap instead of Map

/** Deleting */
val removeHead = firstSeq.tail
val removeLast = firstSeq.init
val removeValueInMap = firstMap - "three"
val removeMultipleValuesInMap = firstMap - ("three","one")
