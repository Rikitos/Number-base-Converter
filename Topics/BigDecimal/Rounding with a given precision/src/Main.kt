import java.math.BigDecimal
import java.math.RoundingMode

fun main() {             
    // write your code here
    val input1 = BigDecimal(readLine()!!)
    val newScale = readLine()!!.toInt()

    var result = input1.setScale(newScale, RoundingMode.HALF_DOWN)
    println(result)
}