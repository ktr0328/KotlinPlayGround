package ClassTest

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by ktr on 2017/09/17.
 */
class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 100)

    val now: String = SimpleDateFormat("yyyy/MMMM").format(Date())
        get() = "@${field}"

    override fun toString(): String = "[ name : $name, age : $age ]"
}
