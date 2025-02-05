/** If Else */

//Depending on the weather, say what to wear

val weather: String = "hot"

if (weather == "hot") {
  s"It is $weather, bring a sun hat."
} else {
  s"You need a coat, it is $weather"
}

// if true --> hits the first string inside the 'if'
// if false --> hits the second string inside the 'else'

if (weather.toLowerCase == "hot") {
  s"It is ${weather.toLowerCase}, bring a sun hat."
} else if (weather.toLowerCase == "raining") {
  s"It is ${weather.toLowerCase}, bring an umbrella."
} else {
  s"$weather is invalid input, please enter 'raining' or 'hot'."
}

//Multiple options
val season: String = "summer"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  "Bring a coat."
} else {
  "A light jacket is fine."
}

//Task1 - converting percentage scores to grades

val grade: Double = 101

if (grade > 100 || grade < 0) {
  s"$grade is an invalid grade, please enter your grade as a percentage between 0 and 100."
} else if (grade >= 90) {
  s"You got $grade%, that's an A."
} else if (grade >= 80) {
  s"You got $grade%, that's a B."
} else if (grade >= 70) {
  s"You got $grade%, that's a C."
} else if (grade >= 60) {
  s"You got $grade%, that's a D."
} else if (grade >= 50) {
  s"You got $grade%, that's an E."
} else {
  s"You got $grade%, that's an F."
}

//Task2 - finding what movies

val age: Int = 0

if (age > 130 || age < 0) {
  s"You are not $age years old, please enter your real age as an integer between 0 and 130."
} else if (age >= 18) {
  s"You are $age years old so you can watch movies labelled U, PG, 12A, 15 and 18."
} else if (age >= 15) {
  s"You are $age years old so you can watch movies labelled U, PG, 12A and 15."
} else if (age >= 12) {
  s"You are $age years old so you can watch movies labelled U, PG and 12A."
} else if (age >= 8) {
  s"You are $age years old so you can watch movies labelled U and PG."
} else if (age >= 4) {
  s"You are $age years old so you can watch movies labelled U."
} else {
  s"You are $age years old so you are too young to go to the cinema. :("
}
