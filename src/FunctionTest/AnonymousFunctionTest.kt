package FunctionTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    // ラムダ
    val square1: (Int) -> Int = { i: Int -> i * i }
    // 無名関数
    val square2: (Int) -> Int = fun(i: Int): Int { return i * i }
    // 無名関数 省略形
    val square3: (Int) -> Int = fun(i: Int) = i * i
}
