package chap8.listfactory

import chap8.factory.Page

class ListPage(private val title: String, private val author: String): Page(title, author) {
    override fun makeHTML(): String {
        val buffer: StringBuffer = StringBuffer()
        buffer.append("<html><head><title>$title</title></head>\n")
        buffer.append("<body>\n")
        buffer.append("<h1>$title</h1>\n")
        buffer.append("<ul>\n")
        content.map {
            buffer.append(it.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }

}