package chap8.tablefactory

import chap8.factory.Page

class TablePage(private val title: String, private val author: String): Page(title, author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>\n")
        buffer.append("<body>\n")
        buffer.append("<table width='80%' border='3'>\n")
        content.map {
            buffer.append("<tr>${it.makeHTML()}</tr>")
        }

        buffer.append("</table>\n")
        buffer.append("<hr><address>$author</address></body></html>")
        return buffer.toString()
    }
}