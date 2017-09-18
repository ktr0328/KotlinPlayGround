package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val x = 10

    val num : String = when(x) {
        0 -> "zero"
        in (1..100) -> "within"
        else -> "else"
    }

    println(num)
}
