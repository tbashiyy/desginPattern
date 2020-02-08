package chap8.factory

abstract class Item(private val caption: String) {
    abstract fun makeHTML(): String
}