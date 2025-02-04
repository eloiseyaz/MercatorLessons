/** Arithmetic Operators */

val a: Int = 10
val b: Int = 5
val c: Int = 3

//Add +
a + b

//Subtract -
a - b
b - c

//Divide /
a / b
a / c //gives Int result (so floor of answer)

//Multiply *
a * b
b * b
b * c

//Modulus (remainder) %
a % b
a % c

/** Relational */

// Equality ==
a == a
a == b

//Inequality !=
a != c
b == b

//Less than <
b < a
a < c

//Less than or equal to <=
b <= a
a <= a

//Greater than >
a > b
b > c

//Greater than or equal to >=
a >= c
c >= c
"dog" >= "dog"

/** Logical */

//AND &&
true && true
true && false
(3<6) && (6<7)

//OR ||
true || false
false || true
false || false
(3<6) && (6<7)

//NOT !
!false
!true

//Task1 - Mental Truth Tables

//Task2 - converting word problems into scala
(4 + 3) * 55 < 300
96 / 12 >= 8
"Hamster" < "Hippo" //does alphabetical not by length
"Hamster".length < "Hippo".length //this gives us what we want
8 % 2 == 0
(156 / 8 < 20) && (54 < 20) && (55 / 4 < 14)