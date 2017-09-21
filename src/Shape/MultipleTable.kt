package Shape

/**
 * Created by ktr on 2017/09/21.
 */
fun main(args: Array<String>) {
    println(generateMultipleTable())
}

fun generateMultipleTable() =
    StringBuilder().apply {
        (1..9).forEach {
            val that = it
            (1..9).forEach { append("%2d ".format(it * that)) }.let { appendln() }
        }
    }
