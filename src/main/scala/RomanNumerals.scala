object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      if (self == 9) {
        sb.append("IX")
      } else {
        var remaining = self;
        if (remaining >= 5) {
          sb.append("V")
          remaining -= 5
        }
        if (4 == remaining) sb.append("IV")
        else for (_ <- 0 until remaining) sb.append("I")
      }
      sb.toString()
    }
  }

}