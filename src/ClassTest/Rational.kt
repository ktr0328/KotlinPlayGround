package ClassTest

/**
 * Created by ktr on 2017/09/17.
 * 分数
 */
class Rational(val n: Int, val d: Int) {
    init {
        // 分母 0 -> throw IllegalArgumentException
        require(d != 0, { "denominator must not be null" })
    }

    // lazy : 呼ばれて初めて生成される
    private val g by lazy { gcd(Math.abs(n), Math.abs(d)) }
    val numerator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }

    fun plus(that: Rational): Rational =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )

    // 演算子のオーバーライド + が効くようになる
    operator fun plus(n: Int): Rational = Rational(numerator + n * denominator, denominator)

    // tailrec: 明示的な再帰
    tailrec private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override fun toString(): String = "$numerator/$denominator"
}

operator fun Int.plus(r: Rational): Rational = r + this
