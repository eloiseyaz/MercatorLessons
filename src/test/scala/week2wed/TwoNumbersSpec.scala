package week2wed

import org.scalatest.flatspec.AnyFlatSpec
import week2.wed.TwoNumbers

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add the 2 parameters" in {
    val twoNums = new TwoNumbers(1, 2) //Making a new instance of my class, so I can access the methods.
    assert(twoNums.add == 3) //This will return a boolean. Method == Expected
  }

  "subtract" should "get the difference between the 2 parameters" in {
    val twoNums = new TwoNumbers(1, 3)
    assert(twoNums.subtract == 2)
    val anotherTwoNums = new TwoNumbers(5, 2)
    assert(anotherTwoNums.subtract == 3)
  }

  "multiply" should "multiply the 2 parameters" in {
    val twoNums = new TwoNumbers(3, 4)
    assert(twoNums.multiply == 12)
  }

  //We want to test edge cases. We want our tests to be able to fail, but they still need to compile.
  //multiply" should "error when input is a double" in {
    //val twoNums = new TwoNumbers(3.5, 4)
    //assert(twoNums.multiply != 14)
  //}
}
