package chap11

import javax.swing.text.html.parser.Entity

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Any? {
        throw FileTreatmentException()
    }

    fun printList(): Unit {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }
}
