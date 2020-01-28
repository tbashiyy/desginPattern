package chap1

interface Aggregate<T> {
    fun iterator(): Iterator<T>
}