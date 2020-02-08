package chap8.factory

import java.io.FileWriter
import java.io.IOException

abstract class Page(private val title: String, private val author: String) {
    protected val content = mutableListOf<Item>()

    fun add(item: Item): Unit {
        content.add(item)
    }

    fun outPut(): Unit {
        try {
            val filename = "$title.html"
            val writer = FileWriter(filename)
            writer.write( makeHTML() )
            writer.close()
            println("$filename を作成しました")
        } catch(e: IOException) {
            e.printStackTrace()
        }
    }

    fun getContent(): Any {
        return content
    }

    abstract fun makeHTML(): String
}