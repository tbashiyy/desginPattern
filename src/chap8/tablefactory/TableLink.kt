package chap8.tablefactory

import chap8.factory.Link

class TableLink(private val caption: String, private val url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<td><a href='$url'>$caption</a></td>\n"
    }
}