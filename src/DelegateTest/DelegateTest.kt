package DelegateTest

import kotlin.reflect.KProperty

/**
 * Created by ktr on 2017/09/22.
 */
fun main(args: Array<String>) {
    val myClass = MyClass()
    println(myClass.str)
    myClass.str = "ラーメン"
    println(myClass.str)
}

class MyClass {
    private var _str: String? = null
    var str: String? by object {
        operator fun getValue(thisRef: MyClass, property: KProperty<*>): String? {
            println("   ${property.name}がgetされました")
            return _str
        }

        operator fun setValue(thisRef: MyClass, property: KProperty<*>, value: String?) {
            println("   ${property.name}に${value}がsetされました")
            _str = value
        }
    }
}
