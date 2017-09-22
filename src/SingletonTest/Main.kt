package SingletonTest

/**
 * Created by ktr on 2017/09/22.
 */
fun main(args: Array<String>) {
    val user1 = User("hoge")
    val user2 = User("hage")
    val user3 = User("huga")

    user1.greet()
    user2.greet("hoge")
    user3.greet("hage")
}

interface Greetable {
    fun greet(to: String = "")
}

class User(val name: String): Greetable {
    override fun greet(to: String) {
        count++
        println("""
            |Hello $to! I'm $name!
            | @greet count: $count""".trimMargin())
    }

    companion object {
        private var count = 0
    }
}
