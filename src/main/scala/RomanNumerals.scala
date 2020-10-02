object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      val sb = new StringBuilder()
      var remaining = self

      def appendStringForNumber(string: String, number: Int): Unit = {
        while (remaining >= number) {
          sb.append(string)
          remaining -= number
        }
      }

      appendStringForNumber("XC", 90)
      appendStringForNumber("L", 50)
      appendStringForNumber("XL", 40)
      appendStringForNumber("X", 10)
      appendStringForNumber("IX", 9)
      appendStringForNumber("V", 5)
      appendStringForNumber("IV", 4)
      appendStringForNumber("I", 1)

      sb.toString()
    }
  }

}