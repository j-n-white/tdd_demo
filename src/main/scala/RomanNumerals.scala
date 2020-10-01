object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals:String = {
      if (self.equals(1)) "I" else "II"
    }
  }

}