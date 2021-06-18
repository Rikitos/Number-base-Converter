import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val input1 = readLine()!!.toBigDecimal()
    val input2 = readLine()!!.toBigDecimal()
    val input3 = readLine()!!.toBigDecimal()

    val result = (input1 + input2 + input3) / BigDecimal(3)

    println("${result.setScale(0, RoundingMode.DOWN)}")
}