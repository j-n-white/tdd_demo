object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      var remaining = self
      if (remaining >= 10) {
        sb.append("X")
        remaining -= 10
      }
      if (remaining == 9) sb.append("IX")
      else {
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