package chap9

fun main() {
    val d1 = Display(StringDisplayImpl("Hello, Japan."))
    val d2 = CountDisplay(StringDisplayImpl("Hello, Japan."))
    val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
}