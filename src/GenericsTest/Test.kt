package GenericsTest

/**
 * Created by ktr on 2017/09/18.
 */
class Test<T>(var value: T) {
    override fun toString(): String {
        return value.toString()
    }
}
