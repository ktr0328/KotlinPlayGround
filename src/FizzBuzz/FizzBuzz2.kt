package FizzBuzz

/**
 * Created by ktr on 2017/09/17.
 */
fun main(args: Array<String>) {
    val base = arrayOf(10, 20, 30, 40)
    base.forEach { println("[ ${FizzBuzz(it)}]") }

    println(StringBuilder().apply {
        (0..200).map { append("-") }
        append(System.getProperty("line.separator"))
    })

    println("[ ${FizzBuzz2(20)} ]")
}

fun FizzBuzz(num: Int): StringBuilder = StringBuilder().apply {
    (1..num).map {
        when {
            it % 15 == 0 -> append("FizzBuzz")
            it % 3 == 0 -> append("Fizz")
            it % 5 == 0 -> append("Buzz")
            else -> append(it)
        }
        append(" ")
    }
}

fun FizzBuzz2(num: Int): String = ArrayList<String>().apply {
    (1..num).map {
        when {
            it % 15 == 0 -> add("FizzBuzz")
            it % 3 == 0 -> add("Fizz")
            it % 5 == 0 -> add("Buzz")
            else -> add("$it")
        }
    }
}.joinToString(", ")
