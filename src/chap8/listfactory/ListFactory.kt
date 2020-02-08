package chap8.listfactory

import chap8.factory.Factory
import chap8.factory.Link
import chap8.factory.Page
import chap8.factory.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }

}