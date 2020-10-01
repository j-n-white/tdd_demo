object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      if (5 == self) sb.append("V")
      else if (4 == self) sb.append("IV")
      else for (_ <- 0 until self) sb.append("I")
      sb.toString()
    }
  }

}