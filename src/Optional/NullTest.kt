package Optional

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val list = listOf("not null", null, "hoge", "huga", null, "piyo")
    list.forEach { it?.let(::println) }
    println("-------------------------------------------")

    list.forEachIndexed { i, s -> s?.let { println("$i: $s") } }
//    list.forEach { println(requireNotNull(it)) } // エラー@null
    println("-------------------------------------------")

    val str1: String? = "Hello!"
    val str2: String? = null
    (str1 ?: "NULL").let { println("str1: $it") }
    (str2 ?: "NULL").let { println("str2: $it") }
//    (str2 ?: throw AssertionError()).let { println(it) } // エラー@null
    println("-------------------------------------------")

    val any: Any? = "文字列"
    (any as? Int)?.let { println(it) } // ダウンキャスト safe cast
    (any as? String)?.let { println(it) }
}
