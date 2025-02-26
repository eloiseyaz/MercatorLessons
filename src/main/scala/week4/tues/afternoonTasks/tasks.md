# Afternoon Task: Higher order functions.

## MVP:

### Passing a function as an argument:

Question 1.

a. Create a function called `intDoubler` that takes an input of type `Int` and returns an `Int`. This method will return
the input `Int` doubled.

b. Create a second function called `applyTwice` that takes two parameters.

i. The first parameter is an `input:Int`.

ii. The second parameter is a function called `f` that takes an `Int` and returns an `Int`. (Having this as a parameter makes the `applyTwice` method a higher order function.)

iii. The `applyTwice` function must apply `f` twice in succession to the `input`.

c. Call the `applyTwice` function passing in the `intDoubler` as your `f`.

(E.g. `applyTwice(4, intDoubler)` should equal 16)

Question 2.

a. Create 4 functions (addition, multiplication, division, subtraction), each taking two doubles as inputs and returning a `Double` as the result.

b. Create a function called `IntManipulator` that takes in two doubles and a mathematical operation (as made above) as a function and returns the result as a double.

### Returning a function:

Question 3.

a. Create a function called `convertToUpperCase` that takes any string input and returns that string as uppercase.

b. Create a function called `convertToLowerCase` that takes any string input and returns that string as lowercase.

c. Create a third function called `stringConverter` that takes a Boolean input with parameter name `makeStringUpperCase`. If the input is `true`, return the `convertToUpperCase` method; if `false`, return the `convertToLowerCase` method.

d. Copy `val testString = "cOnVeRtMe"` and apply your `stringConverter` method to your `testString` and print the result when the input is `true` and when it is `false`.

Question 4.

a. Create a `calculate` method that takes an input called `operation: String` and pattern matches it to return one of the previously written methods from question 2; `add`, `subtract`, `multiply`, and `divide`.

(Example: `calculate("add")` will return the `add` method from Q2)

b. Try applying different string inputs to the `calculate` method to return each of the arithmetic methods.

c. What happens if you enter an input that doesn’t match any of the methods? Should we account for this in our pattern match? What would change if we did?

## Extension and Research:

Question 1.

a. Create a function called `max` that takes two Doubles and returns the maximum of the two numbers. (HINT: research and use the built-in `max` method.)

b. Create a function called `maxListNum` that takes a list of doubles and the `max` function made in part a. It should return the largest number in the list. (HINT: research and use the built-in `reduce` method.)

Question 2.

a. Create a function named `applyFunc` that takes two parameters: a function of type `Int => Int` and a `givenInt: Int`. The `applyFunc` should apply the function parameter to the `givenInt` and return the result.

b. Create two functions, one named `triple` that triples the `givenInt`, and one named `square` that squares the `givenInt`.

c. Use the `applyFunc` to apply the `triple` and `square` methods to the number 5 and print the result.

Question 3.

a. Create a function named `power` that takes an `exponent: Int` and returns a function `Int => Int`. The returned function should take a `base: Int` and raise it to the power of `exponent`. (HINT: research and use `Math.pow()`)

b. Use the above `power` function to create a `square` function that squares numbers (base 2).

c. Apply the `square` function to the number 6 and print the result.