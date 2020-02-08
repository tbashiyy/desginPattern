package chap9

class StringDisplayImpl(private val string: String): DisplayImpl() {
    private val width = string.length

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("+")
        for(i in 1..width){
            print("-")
        }
        println("+")
    }
}