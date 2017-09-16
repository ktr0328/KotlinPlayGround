package StringTest

/**
 * Created by ktr on 2017/09/16.
 */
fun main(args: Array<String>) {
    val str = "string test"

    str.mapIndexed { i, e -> "${i + 1} : $e" }
            .forEach { println(it) }
}