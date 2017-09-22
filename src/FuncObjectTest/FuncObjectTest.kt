package FuncObjectTest

/**
 * Created by ktr on 2017/09/22.
 */
fun main(args: Array<String>) {
    val method1 = Int::inc
    println(method1)

    // anonymous
    val method2 = { i: Int -> i * i }
    println(method2(4))

    listOf(1, 2, 3).map(Int::inc).joinToString(prefix = "[", postfix = "]").let { println(it) }

//    val length: String.()->Int = String::length
    listOf("Kotlin", "かわいいよ", "Kotlin").map(String::length).let { println(it) }
}
