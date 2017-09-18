package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val square = { i: Int -> i * i }
    val square2: (Int) -> Int = { it * it }
    println(square(5))
    println(square2(5))
    println(StringBuilder().apply { (0..50).map { append("-") } }.append(System.getProperty("line.separator")))

    val counter1 = getCounter()
    val counter2 = getCounter()
    println("c1 : ${counter1()}")
    println("c2 : ${counter2()}")
    println("c1 : ${counter1()}")
    println("c1 : ${counter1()}")
    println("c2 : ${counter2()}")
}

// クロージャ
fun getCounter(): () -> Int {
    var count = 0
    return {
        ++count
    }
}
