package chap13

interface Element {
    fun accept(v: Visitor)
}