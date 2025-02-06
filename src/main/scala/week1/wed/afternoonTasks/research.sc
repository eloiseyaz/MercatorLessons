val a: Int = 3
val b: Int = 4

var myString: String = "" //I used a variable instead of a value so that I could print it outside the if statement.

if (a > b) {
  myString = "yes"
} else if (b > a) {
  myString = "no"
} else {
  myString = "maybe"
}
println(myString)

//Doing with vals

val myValString = if (a > b) {
  "yes"
} else if (b > a) {
  "no"
} else {
  "maybe"
}
println(myValString)

//Can also be done in one line
val myOtherValString = if (a > b) "yes" else if (b > a) "no" else "maybe"
println(myOtherValString)