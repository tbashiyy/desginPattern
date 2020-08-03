package chap13

class Directory(private val name: String): Entry() {
    private val dir: MutableList<Entry> = mutableListOf()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        var size: Int = 0
        val it = dir.iterator()

        while(it.hasNext()) {
            val entry = it.next()
            size += entry.getSize()
        }

        return size
    }

    override fun add(entry: Entry): Entry {
        dir.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> {
        return dir.iterator()
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}