package FizzBuzz

/**
 * Created by ktr on 2017/09/16.
 */
fun main(args: Array<String>) {
    println("~~ FizzBuzz ~~")
//  ver stream
    Array<Int>(20, { it + 1 }).map { fizzBuzzHelper(it) }.forEach { println(it) }

//  ver for
//    for (i in 1..20) println(fizzBuzzHelper(i))
}

fun fizzBuzzHelper(num: Int): Any {
    when {
        num % 15 == 0 -> return "FizzBuzz"
        num % 3 == 0 -> return "Fizz"
        num % 5 == 0 -> return "Buzz"
        else -> return num
    }
}
