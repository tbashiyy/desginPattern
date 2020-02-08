package chap8.factory

import java.lang.Exception

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            return try {
                Class.forName(className).getDeclaredConstructor().newInstance() as Factory
            } catch (e: ClassNotFoundException) {
                throw Exception("class $className is not found")
            } catch (e: Exception) {
                throw Exception(e)
            }
        }
    }

    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}