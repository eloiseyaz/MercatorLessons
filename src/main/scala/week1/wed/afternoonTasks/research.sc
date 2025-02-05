val a: Int = 3
val b: Int = 1

var myString: String = "" //I used a variable instead of a value so that I could print it outside the if statement.

if (a > b) {
  myString = "yes"
} else if (b > a) {
  myString = "no"
} else {
  myString = "maybe"
}
println(myString)
