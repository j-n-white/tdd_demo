import org.scalatest.funspec.AnyFunSpec

class RomanNumeralsTest extends AnyFunSpec {
  describe("RomanNumerals") {
    it("returns a string") {
      assert(1.toRomanNumerals().isInstanceOf[String])
    }
  }
}
