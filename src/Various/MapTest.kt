package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    var map : Map<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    map += "three" to 3
    println(map)

    map -= "three"
    println(map)

    println("two : ${map["two"]}")
    println("three : ${map["three"]}")
}
