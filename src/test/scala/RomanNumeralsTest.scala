import RomanNumerals.ToRomanNumerals
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec

class RomanNumeralsTest extends AnyPropSpec with TableDrivenPropertyChecks {
  private val testCases = Table(
    ("input", "expected"),
    (1, "I"),
    (2, "II"),
    (3, "III"),
    (4, "IV"),
    (5, "V"),
    (6, "VI"),
    (7, "VII"),
    (8, "VIII"),
    (9, "IX"),
    (10, "X"),
    (11, "XI"),
    (15, "XV"),
    (18, "XVIII"),
    (19, "XIX"),
    (20, "XX"),
    (39, "XXXIX"),
    (40, "XL"),
    (50, "L"),
    (90, "XC"),
    (100, "C"),
    (400, "CD"),
    (500, "D"),
    (900, "CM"),
    (1000, "M")
  )
  property("Given the toRomanNumerals function when called with an integer it returns the correct string") {
    forAll(testCases) { (input: Int, expected: String) => assertResult(expected)(input.toRomanNumerals) }
  }
}
