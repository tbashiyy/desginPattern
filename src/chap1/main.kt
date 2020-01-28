package chap1

fun main() {
    val bookshelf = BookShelf(3)

    bookshelf.appendBook(Book("Around The World in 90 Days"))
    bookshelf.appendBook(Book("Bible"))
    bookshelf.appendBook(Book("Cinderella"))
    bookshelf.appendBook(Book("Daddy-Long-Legs"))
    bookshelf.appendBook(Book("Bible"))

    val it = bookshelf.iterator()

    while(it.hasNext()){
        val book: Book = it.next()
        println(book.getName())
    }


}