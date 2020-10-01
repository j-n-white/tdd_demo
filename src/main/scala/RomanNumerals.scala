object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals:String = {
      self.toString
    }
  }

}