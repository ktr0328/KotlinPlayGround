package Various

/**
 * Created by ktr on 2017/09/18.
 */
fun main(args: Array<String>) {
    val bucket = object {
        val capacity : Int = 5

        var quantity: Int = 0

        fun pour(_quantity: Int): Unit {
            val q = quantity + _quantity
            quantity = if (q < capacity) {
                q
            } else {
                this.capacity
            }
        }

        fun drainAway() {
            quantity = 0
        }

        fun printQuantity() {
            println(quantity)
        }
    }
    bucket.printQuantity()
    bucket.pour(2)
    bucket.printQuantity()
    bucket.pour(5)
    bucket.printQuantity()
    bucket.drainAway()
    bucket.printQuantity()
}

interface Bucket {
    fun fill()
    fun drainAway()

    fun getCapacity(): Int
    fun getQuantity(): Int
}
