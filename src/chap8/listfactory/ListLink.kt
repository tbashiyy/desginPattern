package chap8.listfactory

import chap8.factory.Link

class ListLink(private val caption: String, private val url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=\"$url\">$caption</a></li>\n"
    }
}