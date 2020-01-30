package chap3

class CharDisplay(private val string: String): AbstractDisplay() {
    override fun open(): Unit {
        println("<<")
    }

    override fun print(): Unit {
        println(string)
    }

    override fun close(): Unit {
        println(">>")
    }
}