import RomanNumerals.ToRomanNumerals
import org.scalatest.funspec.AnyFunSpec

class RomanNumeralsTest extends AnyFunSpec {
  describe("Given the toRomanNumerals function") {
    it("when called then it returns a string") {
      assert(1.toRomanNumerals.isInstanceOf[String])
    }
  }
}
