import RomanNumerals.ToRomanNumerals
import org.scalatest.funspec.AnyFunSpec

class RomanNumeralsTest extends AnyFunSpec {
  describe("Given the toRomanNumerals function") {
    it("when called on 1 then it returns \"I\"") {
      assertResult("I")(1.toRomanNumerals)
    }
  }
}
