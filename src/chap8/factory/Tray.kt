package chap8.factory

abstract class Tray(private val caption: String): Item(caption) {
    protected val tray: MutableList<Item> = mutableListOf()
    fun add(item: Item): Unit {
        tray.add(item)
    }
}