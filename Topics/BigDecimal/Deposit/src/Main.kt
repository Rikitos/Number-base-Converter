import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val input = readLine()!!.toString()
    val input2 = readLine()!!.toString()
    val input3 = readLine()!!.toString()

    val inputBig = input.toBigDecimal()
    val input2Big = input2.toBigDecimal().setScale(2)
    val input3Big = input3.toBigDecimal()

    val finalAmount = inputBig * (BigDecimal.ONE + input2Big / BigDecimal(100)).pow(input3.toInt())
    println("Amount of money in the account: ${finalAmount.setScale(2, RoundingMode.CEILING)}")
}