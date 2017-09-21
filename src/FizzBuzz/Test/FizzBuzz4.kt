package FizzBuzz.Test

/**
 * Created by ktr on 2017/09/22.
 */
fun main(args: Array<String>) {
    val state = Config(Pair("Fizz", 3), Pair("Buzz", 5), (1..20))
    state.run()

    state.copy(Pair("Hoge", 3), Pair("Huga", 4), (1..50)).run()

    state.copy(pair2 = Pair("Buzzzzzzzzzzzzzzzzzz", 5)).run()
}
