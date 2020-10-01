import RomanNumerals.ToRomanNumerals
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec

class RomanNumeralsTest extends AnyPropSpec with TableDrivenPropertyChecks {
  private val testCases = Table(
    ("input", "expected"),
    (1, "I"),
    (2, "II"),
    (3, "III"),
    (4, "IV")
  )
  property("Given the toRomanNumerals function when called with an integer it returns the correct string") {
    forAll(testCases) { (input: Int, expected: String) => assertResult(expected)(input.toRomanNumerals) }
  }
}
