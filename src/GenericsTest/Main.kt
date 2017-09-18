package GenericsTest

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val test = Test<Int>(3)
    println(test)

    val test2 = Test<Hoge>(Hoge("hogee"))
    println(test2)

    println(Hoge("hogeeee") + Hoge(" + hogee"))
}

class Hoge(var value: String) {
    override fun toString(): String {
        return value
    }
}

operator fun Hoge.plus(hoge: Hoge): String = this.value + hoge.value
