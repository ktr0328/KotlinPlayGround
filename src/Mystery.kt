/**
 * Created by ktr on 2017/09/20.
 */
fun main(args: Array<String>) {
    println("なぜfalse？？？？？？？？？？？")
    /**
     * 256の間だとtrue
     * Int? はIntegerとして扱われていて、なんかプールされているらしい？
     * boxingが関係している模様
     * 謎
     */

    val a: Int? = 127
    val b: Int? = 128
    val c: Int? = -128
    val d: Int? = -129

    println("127 === 127 -> ${a === 127}")
    println("128 === 128 -> ${b === 128}")
    println("-128 === -128 -> ${c === -128}")
    println("-129 === -129 -> ${d === -129}")

    println("-------------------------------")
}
