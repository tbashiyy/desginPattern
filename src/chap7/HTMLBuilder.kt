package chap7

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder: Builder() {
    private var fileName: String? = null
    private var writer: PrintWriter? = null

    override fun makeTitle(title: String) {
        fileName = "$title.html"
        try {
            writer = PrintWriter(FileWriter(fileName!!))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        writer?.println("<html><head><title>$title</title></head><body>")
        writer?.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer?.println("<p>$str</p>")
    }

    override fun makeItems(items: List<String>) {
        writer?.println("<ul>")
        items.map {
            writer?.println("<li>$it</li>")
        }
        writer?.println("</ul>")
    }

    override fun close() {
        writer?.println("</body></html>")
        writer?.close()
    }

    fun getResult(): String {
        return fileName!!
    }
}