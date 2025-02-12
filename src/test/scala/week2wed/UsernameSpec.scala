package week2wed

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week2.wed.Username


class UsernameSpec extends AnyWordSpec with Matchers {

  //Make a new instance of my class.
  //Can do this at top level because my class doesn't take parameters.
  val user: Username = new Username

  "checkUsername" should {

    "return true" when{

      "the username is 8 characters long and all lowercase" in {
        val input: Boolean = user.checkUsername("mercator")
        val expected: Boolean = true
        input shouldBe(expected)
      }

      "the username is more than 8 characters long and all lowercase" in {
        val input: Boolean = user.checkUsername("mercatordigital")
        val expected: Boolean = true
        input shouldBe(expected)
      }

    }

    "return false" when {

      "the username is less than 8 characters long but all in lowercase" in {
        val input: Boolean = user.checkUsername("merc")
        val expected: Boolean = false
        input shouldBe(expected)
      }

      "the username is 8 characters long but contains uppercase" in {
        val input: Boolean = user.checkUsername("Mercator")
        val expected: Boolean = false
        input shouldBe(expected)
      }

      "the username entered is an empty string" in {
        val input: Boolean = user.checkUsername("")
        val expected: Boolean = false
        input shouldBe(expected)
      }

    }
  }
}
