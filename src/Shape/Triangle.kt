package Shape

/**
 * Created by ktr on 2017/09/21.
 */
fun main(args: Array<String>) {
    val range = (1..7 step 2)
    range.forEach { println(generateTriangle(it)) }
}

fun generateTriangle(n: Int = 5): StringBuilder =
    StringBuilder().apply {
        appendln("[num: $n]")
        val m: Int = (n * 2 - 1) / 2 + 1

        (0..n * 2).forEach { append("_") }.let { append(System.lineSeparator()) }

        for (i in 1..n) {
            append("|")
            for (j in 1..n * 2 - 1) {
                when {
                    j > m - i && j < m + i -> append("▲")
                    else -> append(" ")
                }
            }
            appendln("|")
        }
    }
