package Various

import java.util.*

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    do {
        println("loop")
        val still = Random().nextInt(10) in (0..3)
    } while (still)

    var count = 3
    while (count-- > 0) {
        println(count)
    }
}
