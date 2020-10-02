object RomanNumerals {

  implicit class ToRomanNumerals(self: Int) {
    def toRomanNumerals: String = {
      if (self >= 4000 || self <= 0) throw new IllegalArgumentException(
        "Roman numerals can only be generated for values between 1 and 3999")

      val sb = new StringBuilder()
      var remaining = self

      def appendStringForNumber(string: String, number: Int): Unit = {
        while (remaining >= number) {
          sb.append(string)
          remaining -= number
        }
      }

      appendStringForNumber("M", 1000)

      appendStringForNumber("CM", 900)
      appendStringForNumber("D", 500)
      appendStringForNumber("CD", 400)
      appendStringForNumber("C", 100)

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