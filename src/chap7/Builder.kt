package chap7

abstract class Builder {
    abstract fun makeTitle(title: String): Unit
    abstract fun makeString(str: String): Unit
    abstract fun makeItems(items: List<String>): Unit
    abstract fun close(): Unit
}