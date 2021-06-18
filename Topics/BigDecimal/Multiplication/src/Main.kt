import java.math.BigDecimal

fun main() {
    // write your code here
    val input = readLine()!!.toString()
    val input2 = readLine()!!.toString()

    var result = input.toBigDecimal() * input2.toBigDecimal()

    println(result)
}