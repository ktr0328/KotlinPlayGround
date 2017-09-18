package Optional

/**
 * Created by ktr on 2017/09/16.
 */
fun main(args: Array<String>) {
    val name: String? = "ktr"
    val nobody: String? = null
    println(greet(name))
    println(greet(nobody))
}

fun greet(name: String?) = name?.let { "Hello, $name!" } ?: "Hello."
