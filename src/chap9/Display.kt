package chap9

open class Display(private val impl: DisplayImpl) {
    fun open(): Unit {
        impl.rawOpen()
    }

    fun print(): Unit {
        impl.rawPrint()
    }

    fun close(): Unit {
        impl.rawClose()
    }

    final fun display(): Unit {
        open()
        print()
        close()
    }
}