/** String Interpolation */

//s

val name: String = "Eloise"
println(s"My name is $name.") //$

println(s"3 * 3 = ${3*3}")

val a: Int = 2001
val b: Int = 4
println(s"a * b = ${a*b}")

//Helpful when debugging code. You can print the result at certain points in a method.


//f
/**
 * Common format specifiers (type safety):
 *
 * %f - Float, Double
 *
 * %d - Int, Long
 *
 * %s - String
 */

val height: Double = 1.7
println(f"$name%s is $height%.2f metres tall.") //2 d.p.
println(s"$name%s is $height%.2f metres tall.") //s interpolation doesn't recognise formatting.

math.Pi //math is a built-in library
println(f"Pi to 2 d.p. is ${math.Pi}%.2f")
println(f"Pi to 5 d.p. is ${math.Pi}%.5f")
println(f"Pi to 2 d.p. is ${math.Pi}%20.2f") //Add padding before
println(f"Pi to 2 d.p. is ${math.Pi}.2f" + "          '") //Add padding after (badly...)
println(f"Pi to 2 d.p. is ${math.Pi}%20.2f.         '") //Add padding after (badly...)

//printf - String
printf("'%s'", "Hello")
printf("'%20s'", "Hello") //Padding before
printf("'%-20s'", "Hello") //Padding after
printf("'%20s%-15s'", "Hello", "") //Padding before and after (takes up 20 characters including the hello so first number needs to be higher for even padding)

//raw
println(s"I'm going onto a \nnew line") //with 's', drops onto new line
println(raw"I'm going onto a \nnew line") //with 'raw', treats backslash commands like regular text (common use for this is regex)

//Task1 - using String values
val nameA: String = "Aaron"
val nameB: String = "Erin"
println(s"$nameA is older than $nameB.")

//Task2 - using String and Int values
val ageAint: Int = 27
val ageBint: Int = 24
println(s"$nameA is ${ageAint-ageBint} years older than $nameB.")

//Task3 - using String and Double values with rounding
val ageAdoub: Double = 27.34
val ageBdoub: Double = 24.82
println(f"$nameA is ${ageAdoub-ageBdoub}%.1f years older than $nameB.")

//Task4 - avoiding backslash commands
println(raw"\n\n\n\n\n\n\n\nsameline\n\n")