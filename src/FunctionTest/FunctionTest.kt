package FunctionTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    println("1 to 10(default) : ${sumAll()}")
    println("1 to 100 = ${sumAll(1, 100)}")

    val intArr = longArrayOf(1, 4, 5, 10)
    println("[${intArr.joinToString()}] : ${sum(intArr.toList())}")
}

fun sumAll(start: Int = 1, end: Int = 10): Int = (start..end).reduce { e1, e2 -> e1 + e2 }

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
        if (numbers.isEmpty()) accumulator
        else go(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}
