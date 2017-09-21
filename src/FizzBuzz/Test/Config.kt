package FizzBuzz.Test

/**
 * Created by ktr on 2017/09/22.
 */
interface FizzBuzz {
    fun run(): Unit
    fun printConfig(): String
}

data class Config(val pair1: Pair<String, Int>, val pair2: Pair<String, Int>, val range: IntRange) : FizzBuzz {
    private val pair3: Pair<String, Int> = Pair("${pair1.first}${pair2.first}", pair1.second * pair2.second)
    override fun run(): Unit {
        println("----------------------------------------------------------")
        println(this)

        StringBuilder().apply {
            range.map {
                when (0) {
                    it % pair3.second -> appendln(pair3.first)
                    it % pair1.second -> appendln(pair1.first)
                    it % pair2.second -> appendln(pair2.first)
                    else -> appendln(it.toString())
                }
            }
        }.let { println(it) }

    }

    override fun printConfig(): String {
        return """
            |<Config>
            |   pair1 : ${pair1.first} @${pair1.second}
            |   pair2 : ${pair2.first} @${pair2.second}
            |   both  : ${pair3.first} @${pair3.second}
            |   range : ${range.first} ~ ${range.last}
            |</Config>
            |""".trimMargin()
    }

    override fun toString(): String {
        return printConfig()
    }
}
