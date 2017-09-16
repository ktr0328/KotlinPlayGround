package FizzBuzz

/**
 * Created by ktr on 2017/09/16.
 */
fun main(args: Array<String>) {
    val setting = mapOf<String, Int>("start" to 1, "end" to 20)

    println("~~ FizzBuzz ~~")
//  ver stream
    Array<Int>(setting.get("end")!!, { it + setting.get("start")!! })
            .map { fizzBuzzHelper(it) }
            .forEach { println(it) }

//  ver for
//    for (i in start..end) {
//        println(fizzBuzzHelper(i))
//    }
}

fun fizzBuzzHelper(num: Int): Any {
    if (num % 15 == 0) return "FizzBuzz"
    else if (num % 3 == 0) return "Fizz"
    else if (num % 5 == 0) return "Buzz"
    else return num
}
