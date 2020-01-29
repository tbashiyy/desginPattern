package chap2

open class Banner(private val string: String) {

    fun showWithParen(): Unit {
        println("($string)")
    }

    fun showWithAster(): Unit {
        println("*$string*")
    }

}