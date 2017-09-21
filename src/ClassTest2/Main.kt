package ClassTest2

/**
 * Created by ktr on 2017/09/21.
 */
fun main(args: Array<String>) {
    val u1 = User("user1", 20)
    val u2 = User("user1", 20)
    val u3 = u1.copy(name = "hoge")

    println("""$u1, $u2
        |u1 == u2 -> ${u1 == u2}
        |$u1, $u3
        |u1 == u3 -> ${u1 == u3}
        |""".trimMargin())

    println(StringBuilder().apply { (0..50).map { append("-") }.let { appendln() } })

    println(u1.Action().show())
}
