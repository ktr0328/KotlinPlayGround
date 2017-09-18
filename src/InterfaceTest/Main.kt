package InterfaceTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val p = Person("ktr")
    println(p.greet())
    println(p.hoge())
    println(StringBuilder().apply { (0..50).map{append("-")} }.append(System.getProperty("line.separator")))

    val b = Boo("boo")
    println(b)
}

class Person(val name: String): Greetable {
    override fun greet(): String {
        return "I'm $name."
    }
}

class Boo(val name: String) {
    override fun toString(): String {
        return "not Greetable $name."
    }
}
