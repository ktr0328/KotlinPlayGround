package FunctionTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    log { "出力される" }
    log(false) { "出力されない" }
}

/**
 * inline
 * 実行時のコストが下がる
 * t or f 判定後にStringの生成が行われるため。
 * 生成されてから渡されるのを防ぐ
 */
inline fun log(debug: Boolean = true, message: () -> String) {
    if (debug) {
        println(message())
    }
}
