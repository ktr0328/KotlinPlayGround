package HitAndBlow

import java.util.*

/**
 * Created by ktr on 2017/09/21.
 * 駄作
 */
fun main(args: Array<String>) {
    val c = object {
        val digit = 4
        val correct: Array<Int> = generateAnswer(digit)

        /**
         * なんかいい方法ないものか迷走
         */
        private fun generateAnswer(digit: Int): Array<Int> {
            val tempArr: MutableList<Int> = MutableList(0, { it })
            return (1..digit).map {
                var num = -1
                do {
                    num = Random().nextInt(10)
                    val flag = tempArr.contains(num)
                    if (!flag) {
                        tempArr.add(num)
                    }
                } while (flag)
                num
            }.toTypedArray()
        }
    }
    println("""
        |< Hit and Blow! >
        |Input 4 digit numbers!
    """.trimMargin())
//    println("ans : ${c.correct.joinToString(prefix = "[", postfix = "]")}") // 答え

    val scanner = Scanner(System.`in`)

    var count = 0
    while (true) {
        var (hit, blow) = Pair(0, 0)
        val input = scanner.nextLine()

        if (input.length != c.digit) {
            println("necessary to input ${c.digit} digit numbers")
            continue
        }

        input.forEachIndexed { index, char ->
            when {
                c.correct[index] == char.toString().toInt() -> blow++
                c.correct.contains(char.toString().toInt()) -> hit++
            }
        }
        println("""
        | hit : $hit
        | blow: $blow
        """.trimMargin())

        if (blow == c.digit) {
            break
        } else {
            count++
            println("try again")
        }
    }

    println("""
        |answer : ${c.correct.joinToString(prefix = "[", postfix = "]")}
        |count  : $count times
        |
        |Congratulation!!
    """.trimMargin())
}


