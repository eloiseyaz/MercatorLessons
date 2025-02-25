package week4mon

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week4.mon.afternoonTasks.Fibonacci

class FibonacciSpec extends AnyWordSpec with Matchers {
  val fib = new Fibonacci

  "betterFibonacci" should {

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

  "evenBetterFibonacci" should {

    "return nth fibonacci number with valid input" in {
    assert(fib.evenBetterFibonacci(3).fold(l => l, r => r) == 2)
    assert(fib.evenBetterFibonacci(4).fold(l => l, r => r) == 3)
    assert(fib.evenBetterFibonacci(5).fold(l => l, r => r) == 5)
    assert(fib.evenBetterFibonacci(6).fold(l => l, r => r) == 8)
    assert(fib.evenBetterFibonacci(10).fold(l => l, r => r) == 55)
    }

    "return 0 with 0 input" in {
      assert(fib.evenBetterFibonacci(0).fold(l => l, r => r) == 0)
    }

    "return None with negative input" in {
      assert(fib.evenBetterFibonacci(-1).fold(l => l, r => r) == "-1 is not a valid index for this sequence.")
      assert(fib.evenBetterFibonacci(-3).fold(l => l, r => r) == "-3 is not a valid index for this sequence.")
      assert(fib.evenBetterFibonacci(-10).fold(l => l, r => r) == "-10 is not a valid index for this sequence.")
    }
  }
}
