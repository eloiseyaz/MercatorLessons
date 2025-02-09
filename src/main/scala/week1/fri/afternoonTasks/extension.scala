package week1.fri

//Task 1 & 2
object conversation extends App {
  var input = scala.io.StdIn.readLine()
  while(!(input.toLowerCase.contains("bye"))){
    if (input.toLowerCase.contains("hello") || input.toLowerCase.contains("hey") || input.toLowerCase.contains("hi")) {
      println("Hello Eloise!")
    }else if (input.toLowerCase.contains("weather") || input.toLowerCase.contains("temperature")) {
      println("It's hot and sunny for me today!")
    }else if (input.toLowerCase.contains("sport") || input.toLowerCase.contains("exercise")) {
      println("My favourite sport is netball!")
    }else {
      println("Sorry, I didn't catch that.")
    }
    input = scala.io.StdIn.readLine()
  }
}
//unsure how to do this with vals instead of vars :/

//Task 3

object gradeCalculator extends App {
  //couldn't import method from mvp - maybe because is a worksheet? have copy and pasted the below

  def average(intList: List[Int]): Double = intList.sum.toDouble / intList.length.toDouble

  def valid(score: Int): Boolean = {
    if (score >= 0 && score <= 100) true
    else false
  }

  def validScores(scores: List[Int]): Boolean = {
    if ((for (isValid <- scores.map(score => valid(score))) yield isValid).contains(false)) false
    else true
  }

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

  //new work below here

  def strListToIntList(strList: List[String]): List[Int] = strList.map(str => str.trim.toInt)

  val stringScores = scala.io.StdIn.readLine("Please input your scores as integers separated by commas.").split(",").toList
  val intScores = strListToIntList(stringScores)
  println(determineGrade(intScores))
}