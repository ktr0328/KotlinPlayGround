package Various

import java.util.*

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
//    for (x in (10 downTo 0)) {
//        val result = if (x != 0) "$x," else "Bomb!${System.getProperty("line.separator")}"
//        print(result)
//        Thread.sleep(300)
//    }

    class MyIterator {
        operator fun hasNext(): Boolean = Random().nextInt(5) != 1
        operator fun next(): String = "in loop"
    }

    class MyIterable {
        operator fun iterator() = MyIterator()
    }

    for (item in MyIterable()) {
        println(item)
    }

    // label
    loop@ for (x in 1..10) {
        for (y in 1..10){
            if (y == 5) {
                break@loop
            }
            print(y)
        }
    }
}
