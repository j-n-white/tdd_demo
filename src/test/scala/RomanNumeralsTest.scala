import RomanNumerals.ToRomanNumerals
import org.scalatest.funspec.AnyFunSpec

class RomanNumeralsTest extends AnyFunSpec {
  describe("Given the toRomanNumerals function") {
    it("when called on 1 then it returns \"I\"") {
      assertResult("I")(1.toRomanNumerals)
    }
    it("when called on 2 then it returns \"II\"") {
      assertResult("II")(2.toRomanNumerals)
    }
    it("when called on 3 then it returns \"III\"") {
      assertResult("III")(3.toRomanNumerals)
    }
    it("when called on 4 then it returns \"IV\"") {
      assertResult("IV")(4.toRomanNumerals)
    }
  }
}
