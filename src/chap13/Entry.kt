package chap13

import chap11.FileTreatmentException

abstract class Entry: Element{
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }

    open fun iterator(): Iterator<Entry> {
        throw FileTreatmentException()
    }

    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }
}