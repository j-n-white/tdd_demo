object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      for (_ <- 0 until self) sb.append("I")
      sb.toString()
    }
  }

}