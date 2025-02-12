package week2wed

import org.scalatest.flatspec.AnyFlatSpec
import week2.wed.FizzBuzz


class FizzBuzzSpec extends AnyFlatSpec{

  val fb: FizzBuzz = new FizzBuzz

  "fizzBuzz" should "return FizzBuzz for multiples of 15" in {
    assert(fb.fizzBuzz(15) == "FizzBuzz")
  }

  "fizzBuzz" should "return Fizz for multiples of 3" in {
    assert(fb.fizzBuzz(3) == "Fizz")
  }

  "fizzBuzz" should "return Buzz for multiples of 5" in {
    assert(fb.fizzBuzz(5) == "Buzz")
  }

  "fizzBuzz" should "return input x as string for anything else" in {
    assert(fb.fizzBuzz(2) == "2")
  }

  "fizzBuzz" should "return \"0\" for 0" in {
    assert(fb.fizzBuzz(0) == "0")
  }

}

