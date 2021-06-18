package converter

import java.math.BigDecimal
import java.math.BigInteger

fun main() {

    fun targetToDecimal(num1: String, num2: String, num3: String): String {
        var sourceNum = num1
        var targetBase = num2
        var inputNum = num3.toUpperCase()
        var num = BigInteger("0")
        var strnumbers = inputNum
        var numCount = strnumbers.length.toDouble()
        var extraNum = 0

        for (i in 0 until numCount.toInt()) {
            when (strnumbers[i]) {
                'A' -> extraNum = 10
                'B' -> extraNum = 11
                'C' -> extraNum = 12
                'D' -> extraNum = 13
                'E' -> extraNum = 14
                'F' -> extraNum = 15
                'G' -> extraNum = 16
                'H' -> extraNum = 17
                'I' -> extraNum = 18
                'J' -> extraNum = 19
                'K' -> extraNum = 20
                'L' -> extraNum = 21
                'M' -> extraNum = 22
                'N' -> extraNum = 23
                'O' -> extraNum = 24
                'P' -> extraNum = 25
                'Q' -> extraNum = 26
                'R' -> extraNum = 27
                'S' -> extraNum = 28
                'T' -> extraNum = 29
                'U' -> extraNum = 30
                'V' -> extraNum = 31
                'W' -> extraNum = 32
                'X' -> extraNum = 33
                'Y' -> extraNum = 34
                'Z' -> extraNum = 35
                else -> extraNum = strnumbers[i].toString().toInt()
            }
            var numMultiplier = Math.pow(sourceNum.toDouble(), numCount - 1 - i)
            var numSum = extraNum * numMultiplier
            num += numSum.toBigDecimal().toBigInteger()
        }

        return if (num3 != "0") {
            num.toString()
        } else "0"

    }

    fun decimalToTarget(num1: String, num2: String, num3: String): String {
        var decimalNum = num1.toInt()
        var targetBase = num2.toBigInteger()
        var inputNum = num3.toBigInteger()
        var string = ""
        var zeros = BigInteger("1")
        var count = 0
        var remainder: BigInteger

        do {
            if (zeros <= inputNum) {
                zeros *= targetBase
                count++
            }
        }while (zeros <= inputNum)

        for (i in 0 until count) {
            remainder = inputNum % targetBase
            when (remainder) {
                BigInteger("10") -> string += "A"
                BigInteger("11") -> string += "B"
                BigInteger("12") -> string += "C"
                BigInteger("13") -> string += "D"
                BigInteger("14") -> string += "E"
                BigInteger("15") -> string += "F"
                BigInteger("16") -> string += "G"
                BigInteger("17") -> string += "H"
                BigInteger("18") -> string += "I"
                BigInteger("19") -> string += "J"
                BigInteger("20") -> string += "K"
                BigInteger("21") -> string += "L"
                BigInteger("22") -> string += "M"
                BigInteger("23") -> string += "N"
                BigInteger("24") -> string += "O"
                BigInteger("25") -> string += "P"
                BigInteger("26") -> string += "Q"
                BigInteger("27") -> string += "R"
                BigInteger("28") -> string += "S"
                BigInteger("29") -> string += "T"
                BigInteger("30") -> string += "U"
                BigInteger("31") -> string += "V"
                BigInteger("32") -> string += "W"
                BigInteger("33") -> string += "X"
                BigInteger("34") -> string += "Y"
                BigInteger("35") -> string += "Z"
                else -> string += remainder
            }
            inputNum /= targetBase
        }
        return string.reversed()
    }

    fun fractionalToDecimal(num1: String, numSource: String): String {
        var source = numSource
        var inputNum = num1.toUpperCase()
        var num = BigDecimal.ZERO
        var strNumbers = inputNum
        var numCount = strNumbers.length.toDouble()
        var extraNum = 0

        for (i in 0 until numCount.toInt()) {
            when (strNumbers[i]) {
                'A' -> extraNum = 10
                'B' -> extraNum = 11
                'C' -> extraNum = 12
                'D' -> extraNum = 13
                'E' -> extraNum = 14
                'F' -> extraNum = 15
                'G' -> extraNum = 16
                'H' -> extraNum = 17
                'I' -> extraNum = 18
                'J' -> extraNum = 19
                'K' -> extraNum = 20
                'L' -> extraNum = 21
                'M' -> extraNum = 22
                'N' -> extraNum = 23
                'O' -> extraNum = 24
                'P' -> extraNum = 25
                'Q' -> extraNum = 26
                'R' -> extraNum = 27
                'S' -> extraNum = 28
                'T' -> extraNum = 29
                'U' -> extraNum = 30
                'V' -> extraNum = 31
                'W' -> extraNum = 32
                'X' -> extraNum = 33
                'Y' -> extraNum = 34
                'Z' -> extraNum = 35
                else -> extraNum = strNumbers[i].toString().toInt()
            }
            var numMultiplier = Math.pow(source.toDouble(), 0.0 - 1 - i)
            var numSum = extraNum * numMultiplier
            num += numSum.toBigDecimal()
        }

        return if (num1 != "0") {
            num.toString().substring(2)
        } else "0"

    }


    fun fractional(num1: String, numTarget: String): String {
        var fractionNum = "0.$num1"
        var base = numTarget.toBigDecimal()
        var intRemainder: Int
        var newFraction = fractionNum.toBigDecimal()
        var count = 0
        var string = ""

        do {
            when (newFraction.toInt()) {
                0 -> newFraction *= base
                1 -> newFraction = (newFraction - 1.toBigDecimal()) * base
                2 -> newFraction = (newFraction - 2.toBigDecimal()) * base
                3 -> newFraction = (newFraction - 3.toBigDecimal()) * base
                4 -> newFraction = (newFraction - 4.toBigDecimal()) * base
                5 -> newFraction = (newFraction - 5.toBigDecimal()) * base
                6 -> newFraction = (newFraction - 6.toBigDecimal()) * base
                7 -> newFraction = (newFraction - 7.toBigDecimal()) * base
                8 -> newFraction = (newFraction - 8.toBigDecimal()) * base
                9 -> newFraction = (newFraction - 9.toBigDecimal()) * base
                10 -> newFraction = (newFraction - 10.toBigDecimal()) * base
                11 -> newFraction = (newFraction - 11.toBigDecimal()) * base
                12 -> newFraction = (newFraction - 12.toBigDecimal()) * base
                13 -> newFraction = (newFraction - 13.toBigDecimal()) * base
                14 -> newFraction = (newFraction - 14.toBigDecimal()) * base
                15 -> newFraction = (newFraction - 15.toBigDecimal()) * base
                16 -> newFraction = (newFraction - 16.toBigDecimal()) * base
                17 -> newFraction = (newFraction - 17.toBigDecimal()) * base
                18 -> newFraction = (newFraction - 18.toBigDecimal()) * base
                19 -> newFraction = (newFraction - 19.toBigDecimal()) * base
                20 -> newFraction = (newFraction - 20.toBigDecimal()) * base
                21 -> newFraction = (newFraction - 21.toBigDecimal()) * base
                22 -> newFraction = (newFraction - 22.toBigDecimal()) * base
                23 -> newFraction = (newFraction - 23.toBigDecimal()) * base
                24 -> newFraction = (newFraction - 24.toBigDecimal()) * base
                25 -> newFraction = (newFraction - 25.toBigDecimal()) * base
                26 -> newFraction = (newFraction - 26.toBigDecimal()) * base
                27 -> newFraction = (newFraction - 27.toBigDecimal()) * base
                28 -> newFraction = (newFraction - 28.toBigDecimal()) * base
                29 -> newFraction = (newFraction - 29.toBigDecimal()) * base
                30 -> newFraction = (newFraction - 30.toBigDecimal()) * base
                31 -> newFraction = (newFraction - 31.toBigDecimal()) * base
                32 -> newFraction = (newFraction - 32.toBigDecimal()) * base
                33 -> newFraction = (newFraction - 33.toBigDecimal()) * base
                34 -> newFraction = (newFraction - 34.toBigDecimal()) * base
                35 -> newFraction = (newFraction - 34.toBigDecimal()) * base

            }
            when(newFraction.toInt()) {
                0 -> string += "0"
                1 -> string += "1"
                2 -> string += "2"
                3 -> string += "3"
                4 -> string += "4"
                5 -> string += "5"
                6 -> string += "6"
                7 -> string += "7"
                8 -> string += "8"
                9 -> string += "9"
                10 -> string += "A"
                11 -> string += "B"
                12 -> string += "C"
                13 -> string += "D"
                14 -> string += "E"
                15 -> string += "F"
                16 -> string += "G"
                17 -> string += "H"
                18 -> string += "I"
                19 -> string += "J"
                20 -> string += "K"
                21 -> string += "L"
                22 -> string += "M"
                23 -> string += "N"
                24 -> string += "O"
                25 -> string += "P"
                26 -> string += "Q"
                27 -> string += "R"
                28 -> string += "S"
                29 -> string += "T"
                30 -> string += "U"
                31 -> string += "V"
                32 -> string += "W"
                33 -> string += "X"
                34 -> string += "Y"
                35 -> string += "Z"
            }
            count++
        } while (newFraction != 1.0.toBigDecimal() && count != 5)
        return string
    }

    do {
        print("Enter two numbers in format: {source base} {target base} (to quit type /exit) ")
        val input = readLine()!!.split(" ")
        val sourceNum = input[0]
        if (input.size > 1) {
            val baseNum = input[1]
            do {
                print("Enter number in base $sourceNum to convert to base $baseNum (To go back type /back) ")
                val input = readLine()!!.split(".")
                if (sourceNum == "10" && input[0] != "/back" && input.size == 1) {
                    println("Conversion result: " + decimalToTarget(sourceNum, baseNum, input[0]) + "\n")
                } else if (sourceNum == "10" && input[0] != "/back" && input.size == 2) {
                    println("Conversion result: " + decimalToTarget(sourceNum, baseNum, input[0]) + "." + fractional(input[1], baseNum) + "\n")
                }
//                if (sourceNum == "10" && input != "/back") {
//                    println("Conversion result: " + decimalToTarget("$sourceNum", "$baseNum", "$input") + "\n")
//                }
                if (sourceNum > "0" && sourceNum != "10" && input[0] != "/back" && input.size == 1) {
                    var result = targetToDecimal(sourceNum, baseNum, input[0].toString())
                    println("Conversion result: " + decimalToTarget("$sourceNum", "$baseNum", result) + "\n")
                } else if (sourceNum > "0" && sourceNum != "10" && input[0] != "/back" && input.size == 2) {
                    var result = targetToDecimal(sourceNum, baseNum, input[0].toString())
                    var resultFraction = fractionalToDecimal(input[1], sourceNum)
                    println("Conversion result: " + decimalToTarget(sourceNum, baseNum, result) + "." + fractional(resultFraction, baseNum))
                }
//                if (sourceNum > "0" && sourceNum != "10" && input != "/back") {
//                    var result = targetToDecimal(sourceNum, baseNum, input.toString())
//                    println("Conversion result: " + decimalToTarget("$sourceNum", "$baseNum", result) + "\n")
//                }
            } while (input[0] != "/back")
            print("\n")
        }
    } while (input[0] != "/exit")
}

//import java.math.BigDecimal
//import java.math.RoundingMode
//import kotlin.math.pow
//
//fun main() {
//    process()
//}
//
//fun process() {
//
//    printInitialMessage()
//    val input = readLine()!!.split(' ')
//    var sourceBase = 0
//    var targetBase = 0
//    if (input.contains("/exit")) {
//        return
//    } else {
//        sourceBase = input.first().toInt()
//        targetBase = input.last().toInt()
//
//        while(true) {
//            println("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back) ")
//            val number = readLine()!!
//            when (number) {
//                "/back" -> {
//                    println()
//                    process()
//                    break
//                }
//                else -> println(number.toDecimal(sourceBase).fromDecimal(targetBase))
//            }
//        }
//    }
//}
//
//fun printInitialMessage() = println("Enter two numbers in format: {source base} {target base} (To quit type /exit) ")
//
//fun String.toDecimal(base: Int): String {
//    var result = BigDecimal.ZERO
//    val delimeterIndex = indexOf('.')
//
//    return if (delimeterIndex == -1) "${this.toBigInteger(base)}"
//    else {
//
//        val numberWOutDelimeter = replace(".", "")
//                .map { if (it.isLetter()) "${it.toInt() - 87}" else it }
//
//        numberWOutDelimeter.forEachIndexed { index, number ->
//            result += BigDecimal("$number")
//                    .multiply(BigDecimal(base
//                            .toDouble()
//                            .pow(delimeterIndex - index - 1))
//                            .setScale(5, RoundingMode.HALF_UP))
//        }
//        "$result"
//    }
//}
//
//fun String.fromDecimal(base: Int): String {
//    var number = BigDecimal(this)
//    val delimeterIndex = indexOf('.')
//    val integerPart = number.setScale(0, RoundingMode.DOWN).toBigInteger()
//    var fractPart = number - BigDecimal(integerPart)
//    var fractPartAsList = mutableListOf<String>()
//
//    return if (delimeterIndex == -1) "Conversion result: ${integerPart.toString(base)}"
//    else {
//        var current = fractPart
//        for (i in 1..5) {
//            current = current * BigDecimal(base)
//            fractPartAsList.add(current.toString().substringBefore('.'))
//            current = "0.${current.toString().substringAfter('.')}".toBigDecimal()
//        }
//
//        val ifFractPartHex = fractPartAsList.map{ if (it.toInt() > 9) ('a' + (it.toInt() - 10))
//                .toString() else it }.joinToString("")
//        val res = "${integerPart.toString(base)}.$ifFractPartHex"
//        "Conversion result: $res"
//    }
//}