/**
 * Int - whole number --> 4 bytes (go to for whole number)
 *
 * Long - whole number --> 8 bytes
 *
 * Short - whole number --> 2 bytes
 *
 * Double - simple decimal (same in java)
 *
 * Float - 2.0f (rarely seen, is short equivalent for decimals)
 *
 * String - text (in quotes "")
 *
 * Boolean - true or false
 */

val one: Int = 1
val inferredOne = 1 //scala infers that it is an Int without us telling it


//Task1 - creating values of different types

val four: Int = 4
val text: String = "hello"
val yes: Boolean = true

//Task2 - declaring wrong type

/*
val decimal: Int = 7.5
gives error :(
 */