package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    var set: Set<Int> = mutableSetOf(1, 2, 1, 3)
    set -= 3
    println(set)

    set += 4
    println(set)
}
