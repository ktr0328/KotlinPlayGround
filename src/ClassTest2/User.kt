package ClassTest2

/**
 * Created by ktr on 2017/09/21.
 */
data class User(val name: String, val age: Int) {
    inner class Action {
        fun show(): String = "$name($age)"
    }
}
