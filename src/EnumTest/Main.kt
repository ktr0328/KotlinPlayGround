package EnumTest

/**
 * Created by ktr on 2017/09/22.
 */
enum class DrinkSizeType(val mililitter: Int) {
    SMALL(350) {
        override fun message(): String = "少ない"
    },
    MEDIUM(500) {
        override fun message(): String = "無難"
    },
    LARGE(1000) {
        override fun message(): String = "さすがに多い"
    };

    abstract fun message(): String
}

fun main(args: Array<String>) {
    DrinkSizeType.values().forEach { println("$it : ${it.message()}") }
}
