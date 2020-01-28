package chap1

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}