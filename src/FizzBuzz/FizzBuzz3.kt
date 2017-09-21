package FizzBuzz

/**
 * Created by ktr on 2017/09/21.
 */
fun main(args: Array<String>) {
    val (start, end) = Pair(1, 20)

    StringBuilder().apply {
        (start..end).map {
            when (0) {
                it % 15 -> "FizzBuzz"
                it % 3 -> "Buzz"
                it % 5 -> "Fizz"
                else -> it.toString()
            }.let { appendln(it) }
        }
    }.let { println(it) }
}
