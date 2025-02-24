## Afternoon Task: Recursion

### MVP:
1. Start by looking up the teams that played in the 2024 Euros.

   a) Create an object called `Euro2024` that extends `Enumeration`. Provide all the teams who participated in the 2024 Euros.

   b) Write a tail-recursive method to print all the teams.


2. Duplicate MVP Q1 but instead of using `Enumeration`, implement it using case objects.

   a) Make a sealed class `Team` which has a constructor parameter `name` of type `String`, and a companion object with the same name.

   b) Enter the case objects inside the companion object. What do you notice about accessing the values?


3. Create a method that has an input of a positive `Int`. This method will return the sum of all numbers between 0 and the given `Int`.
    - For example, if we input `5`, then the output should be `5 + 4 + 3 + 2 + 1 = 15`.
    - This is similar to the factorial method but uses addition instead of multiplication.


4. Using recursion and given a list with all integers from 1 to 20 inclusive, create a method called `isEven` that checks if a number at a given index position is even or not. The return type of this method should be `Either[String, Boolean]`.



### Extension:

You will need to use tail recursion to give the Xth value of the Fibonacci sequence. The return type should be an `Either`. This method will need to be proven to work using unit testing, not using print lines!

1. Create a new class called `FibonacciCalc` and `FibonacciCalcSpec`.

2. Using TDD, write a placeholder method then implement a test spec. Run and see the not implemented error.

3. Populate your method with logic. Run tests.

### Research:

Look into advantages and disadvantages of using Enumeration compared to case objects for recursion.

- When would you use one over the other?
- Is there anything we need to be careful about when using either one?