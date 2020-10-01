object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals:String = {
      if (self == 1) "I" else "II"
    }
  }

}