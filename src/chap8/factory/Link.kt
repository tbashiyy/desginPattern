package chap8.factory

abstract class Link(private val url: String, private val caption: String): Item(caption) {

}