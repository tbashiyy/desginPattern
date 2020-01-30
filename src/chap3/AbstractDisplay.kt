package chap3

abstract class AbstractDisplay {
    abstract fun open(): Unit
    abstract fun print(): Unit
    abstract fun close(): Unit

    fun display(): Unit {
        open()
        for (i in 0..4) {
            println("$i 回目")
            print()
        }
        close()
    }
}