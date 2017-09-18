package SuperTest

/**
 * Created by ktr on 2017/09/18.
 */
open class Person(val name: String): Animal(name) {
    override fun move(): Unit {
//        TODO("未実装") //To change body of created functions use File | Settings | File Templates.
        println("歩く")
    }

    open fun introduceMyself() {
        println("I am $name.")
    }

    override fun toString(): String = "[name=$name]"
}

class Student(name: String, val id: Long): Person(name) {
    override fun introduceMyself() {
        println("I am $name. ID: $id")
    }

    override fun toString(): String = "[name=$name, id=$id]"
}
