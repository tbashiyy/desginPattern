package chap1

class BookShelfIterator(private val bookShelf: BookShelf): Iterator<Book> {
    private var index: Int = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book {
        val book: Book = bookShelf.getBookAt(index)
        index ++
        return book
    }
}