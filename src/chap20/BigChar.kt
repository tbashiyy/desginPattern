package chap20

import java.io.File
import java.io.IOException

class BigChar(charName: Char) {
    private var fontData: List<String>

    init {
        fontData = try {
            val file = File("./src/chap20/big$charName.txt")
            file.readLines()
        } catch (e: IOException) {
            listOf("$charName?")
        }
    }

    fun print() {
        fontData.forEach {
            println(it)
        }
    }
}