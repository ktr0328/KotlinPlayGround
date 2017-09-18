package InterfaceTest

/**
 * Created by ktr on 2017/09/18.
 */
interface Greetable {
    fun greet(): String

    // デフォルト実装
    fun hoge(): String {
        return "hoge"
    }
}
