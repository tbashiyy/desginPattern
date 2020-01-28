package chap1

class BookShelf(private val maxsize: Int): Aggregate<Book>{
    private val books: MutableList<Book> = mutableListOf<Book>()
    private var last: Int = 0

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book): Unit {
        if (maxsize <= last) {
            println("maxsize over")
            return
        }
        books.add(last, book)
        last++
    }

    fun getLength(): Int {
        return last
    }

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }
}