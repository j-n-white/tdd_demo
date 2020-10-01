import RomanNumerals.ToRomanNumerals
import org.scalatest.funspec.AnyFunSpec

class RomanNumeralsTest extends AnyFunSpec {
  describe("Given the toRomanNumerals function") {
    it("when called then it returns a string") {
      assert(1.toRomanNumerals.isInstanceOf[String])
    }
    it("when called on 1 then it returns \"I\"") {
      assert(1.toRomanNumerals.eq("I"))
    }
  }
}
