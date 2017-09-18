package FunctionTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    println(containsDigit("aaaaa1"))
    println(containsDigit("aaaaa"))
}

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containsDigit(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
//    forEach(str) here@{
//        if (it.isDigit()) {
//            result = true
//            return@here
//        }
//    }
    return result
}
