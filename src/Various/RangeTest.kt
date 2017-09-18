package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val range: List<Int> = (10 downTo 1 step 3).toList()
    println(range)

    val range2: IntRange = (1..30)
    println("range : $range2")
    println("100 : ${100 in range2} , 20 : ${20 in range2}")
}
