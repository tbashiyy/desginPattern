package chap7

fun main(): Unit {
    val textBulider = TextBuilder()
    Director(textBulider)
    println(textBulider.getResult())

    val htmlBuilder = HTMLBuilder()
    Director(htmlBuilder)
    println(htmlBuilder.getResult())
}