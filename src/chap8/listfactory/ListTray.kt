package chap8.listfactory

import chap8.factory.Tray

class ListTray(private val caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val buffer: StringBuffer = StringBuffer()
        buffer.append("<li>\n")
        buffer.append("$caption\n")
        buffer.append("<ul>\n")
        tray.map {
            buffer.append(it.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("</li>\n")
        return buffer.toString()
    }
}