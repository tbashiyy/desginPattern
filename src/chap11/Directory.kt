package chap11

class Directory(private val name: String): Entry() {
    private val directory: MutableList<Entry> = mutableListOf()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        return directory.map {
            it.getSize()
        }.sumBy { it }
    }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun printList(prefix: String) {
        println("$prefix / $this")
        directory.map {
            it.printList("$prefix / ${it.getName()}")
        }
    }
}