package ClassTest

import java.util.*

/**
 * Created by ktr on 2017/09/17.
 */
fun main(args: Array<String>) {
    val names = arrayOf("now", "HOGE", "huga", "HUGA", "boo", "baa")

    val people = names.map { Person(it, Random().nextInt(99)) }.toList()
    people.sortedBy { it.age }.forEach { println("${it} ${it.now}") }

    val rational = Rational(1, 2) // 分数
    println(rational)

//    println(Rational(1, 0)) // エラー IllegalArgumentException

    println("3/8 + 2/5 = ${Rational(4, 8).plus(Rational(2, 5))}")
    
    println("2 + 5/9 = ${2 + Rational(5, 9)}")
}
