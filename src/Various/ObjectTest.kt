package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val func = ::square
    println(func(10))
}

fun square(i: Int): Int = i * i
