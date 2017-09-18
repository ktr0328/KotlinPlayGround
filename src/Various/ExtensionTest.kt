package Various

/**
 * Created by ktr on 2017/09/18.
 * 拡張関数
 */
fun main(args: Array<String>) {
    val str: String = "Kotlin Test hoge"
    println("$str.split() : ${str.countWords()}")

    val num: Int = 5
    println("$num^2 = ${num.square()}")
}

// fun countWords(s: String): Int = s.split("""\s+""".toRegex()).size
fun String.countWords(): Int = this.split("""\s+""".toRegex()).size

// 二乗
fun Int.square(): Int = this * this
