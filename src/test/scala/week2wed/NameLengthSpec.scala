package week2wed

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week2.wed.NameLength

class NameLengthSpec extends AnyWordSpec with Matchers {

  val name: NameLength = new NameLength
  val longer: String = "thisIsALongerString"
  val shorter: String = "short"
  val emptyString: String = ""

  "getNameLength" should {

    "return length of first name" when {

      "the first name is longer than the surname" in {
        val input: Int = name.getNameLength(longer, shorter)
        val expected: Int = longer.length
        input shouldBe(expected)
      }

      "the surname is an empty string" in {
        val input: Int = name.getNameLength(longer, emptyString)
        val expected: Int = longer.length
        input shouldBe(expected)
      }

    }

    "return length of surname" when {

      "the surname is longer than the first name" in {
        val input: Int = name.getNameLength(shorter, longer)
        val expected: Int = longer.length
        input shouldBe(expected)
      }

      "the first name is an empty string" in {
        val input: Int = name.getNameLength(emptyString, longer)
        val expected: Int = longer.length
        input shouldBe(expected)
      }

    }

    "return 0" when {

      "both names are the same length" in {
        val input: Int = name.getNameLength(shorter, shorter)
        val expected: Int = 0
        input shouldBe(expected)
      }

      "both names are empty strings" in {
        val input: Int = name.getNameLength(emptyString, emptyString)
        val expected: Int = 0
        input shouldBe(expected)
      }

    }
  }
}
