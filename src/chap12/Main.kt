package chap12

fun main() {
    val b1 = StringDisplay("Hello, World!")
    val b2 = SideBorder(b1, '#')
    val b3 = FullBorder(b2)
    val b4 = FullBorder(b3)
    b1.show()
    b2.show()
    b3.show()
    b4.show()
}