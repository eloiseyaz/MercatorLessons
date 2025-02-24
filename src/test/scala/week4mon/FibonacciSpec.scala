package week4mon

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week4.mon.afternoonTasks.Fibonacci

class FibonacciSpec extends AnyWordSpec with Matchers {

  "fibonacci" should {
    val fib = new Fibonacci

    "return nth fibonacci number with valid input" in {
    assert(fib.betterFibonacci(3).get == 2)
    assert(fib.betterFibonacci(4).get == 3)
    assert(fib.betterFibonacci(5).get == 5)
    assert(fib.betterFibonacci(6).get == 8)
    assert(fib.betterFibonacci(10).get == 55)
    }

    "return 0 with 0 input" in {
      assert(fib.betterFibonacci(0).get == 0)
    }

    "return None with negative input" in {
      assert(fib.betterFibonacci(-1).isEmpty)
      assert(fib.betterFibonacci(-3).isEmpty)
      assert(fib.betterFibonacci(-10).isEmpty)
    }
  }
}
