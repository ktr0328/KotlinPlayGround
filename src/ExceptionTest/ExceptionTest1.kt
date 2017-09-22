package ExceptionTest

/**
 * Created by ktr on 2017/09/22.
 */
fun main(args: Array<String>) {
    var a: String = "1"
    a = "a"

    try {
        println(a.toInt())
    } catch (e: NumberFormatException) {
        println(2)
    } finally {
        println(3)
    }
}
