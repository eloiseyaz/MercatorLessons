//Task 1
def square(num: Int): Int = num * num

//Task 2
def isOdd(num: Int): Boolean = num % 2 == 1

//Task 3
def sumOfSquareOdds(intList: List[Int]): Int = (for {
  squares <- intList.map(num => square(num))
  squaredOdds <- List(squares).filter(num => isOdd(num))
} yield squaredOdds).sum

val myList: List[Int] = List(1, 2, 3, 4, 5)
sumOfSquareOdds(myList)

//Task 4
def average(intList: List[Int]): Double = intList.sum.toDouble / intList.length.toDouble //finds average of list of numbers

def valid(score: Int): Boolean = {
  if (score >= 0 && score <= 100) true
  else false
} //checks if inputted score is valid

def validScores(scores: List[Int]): Boolean = {
  if ((for (isValid <- scores.map(score => valid(score))) yield isValid).contains(false)) false
  else true
} //checks if all inputted scores are valid

def determineGrade(scores: List[Int]): String = {
  if (validScores(scores)) {
    val avg = average(scores)
    if (avg > 90) {
      f"Your average score is $avg%.2f%% so your grade is an A!"
    } else if (avg > 80) {
      f"Your average score is $avg%.2f%% so your grade is a B!"
    } else if (avg > 70) {
      f"Your average score is $avg%.2f%% so your grade is a C."
    } else if (avg > 60) {
      f"Your average score is $avg%.2f%% so your grade is a D."
    } else {
      f"Your average score is $avg%.2f%% so your grade is an E. :("
    }
  } else {
    "The scores you have inputted are invalid. Please make sure all scores are inputted as integer percentages between 0 and 100."
  }
}
