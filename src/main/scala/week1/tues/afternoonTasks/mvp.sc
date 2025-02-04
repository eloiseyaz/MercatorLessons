//Task 1

  // a) false, (3+4)*57 is 399 which is greater than 300
  (3 + 4) * 57 < 300

  // b) true, 144/12 is 12 which is equal to 12
  144 / 12 >= 12

  // c) false, they are the same length
  "Cat".length < "Dog".length

  // d) true, "Rabbit" is 6 characters and "Hamster" is 7
  "Rabbit".length < "Hamster".length

  // e) true, 17/2 has a remainder of 1
  17 % 2 == 1

  // f) true, 75/9 returns 8 and 89/6 returns 14 so both inequalities are true
  (75 / 9 < 30) && (89 / 6 < 20)


//Task 2

val myString: String = "I love scala already" //creates a value of our string but this is not printed

println("I love scala already") //prints our string, but it does not create a value for this

//Task 3
"A" < "a"
"Ba" < "aa"

/**
 * It is interesting that inequalities can compare strings as well as numbers.
 * The default is to compare alphabetically, but you can use `.length` to sort by length instead.
 * When comparing alphabetically, all the capital letters are before lower case letters so I think it is going through character by character and comparing their unicode values.
 */