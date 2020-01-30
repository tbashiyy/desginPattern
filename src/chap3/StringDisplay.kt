package chap3

class StringDisplay(private val string: String): AbstractDisplay() {
    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine(): Unit {
        val width = string.length
        var line = "+"
        for(i in 1..width){
            line += "-"
        }
        line += "+"
        println(line)
    }
}