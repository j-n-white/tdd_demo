object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      var remaining = self

      def appendCharacterForNumber(char: Char, number: Int): Unit = {
        if (remaining >= number) {
          sb.append(char)
          remaining -= number
        }
      }

      appendCharacterForNumber('X', 10)
      appendCharacterForNumber('X', 10)
      if (remaining == 9) sb.append("IX")
      else {
        appendCharacterForNumber('V', 5)
        if (4 == remaining) sb.append("IV")
        else for (_ <- 0 until remaining) sb.append("I")
      }
      sb.toString()
    }
  }

}