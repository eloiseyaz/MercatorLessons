//Task 1
//a
val nums: List[Int] = List(1, 2, 3, 4, 5)
val cols: Seq[String] = Seq("red", "yellow", "blue")

//b
val tripNums: List[Int] = nums.map{ num => num * 3}

//c
val noBlue: Seq[String] = cols.filterNot{col => col == "blue"}

//d
val lowerCols: Seq[String] = cols.map(col => col.toLowerCase)
val containsOrange: Boolean = lowerCols.contains("orange")


//Task 2
val listElemIsEven: List[Boolean] = nums.map(num => num % 2 == 0)

//Task 3
//a
val davidPets: Map[String, String] = Map(
  "Kevin" -> "Dog",
  "Steve" -> "Cat",
  "Rambo" -> "Fish",
  "Kitty" -> "Dog"
)

//b
val davidDogsMap: Map[String, String] = davidPets.filter(pet => pet._2 == "Dog")
val davidDogsList: List[String] = davidDogsMap.keys.toList