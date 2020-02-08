package chap8.tablefactory

import chap8.factory.Tray

class TableTray(private val caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val buffer: StringBuffer = StringBuffer()
        buffer.append("<td>")
        buffer.append("<table width='100%' height='1'<tr>")
        buffer.append("<td bgcolor='#cccccc' align='center' colspan='${tray.size}'><b>$caption</b></td>")
        buffer.append("</tr>\n")
        buffer.append("<tr>\n")
        tray.map {
            buffer.append(it.makeHTML())
        }
        buffer.append("</tr></table>")
        buffer.append("</td>")
        return buffer.toString()
    }
}