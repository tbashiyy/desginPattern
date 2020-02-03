package chap7

class TextBuilder: Builder() {
    private val buffer: StringBuffer = StringBuffer()
    override fun makeTitle(title: String) {
        buffer.append("==============================\n")
        buffer.append("[ $title ]\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■ $str \n")
        buffer.append("\n")
    }

    override fun makeItems(items: List<String>) {
        items.map { buffer.append("- $it \n") }
        buffer.append("\n")
    }

    override fun close(): Unit {
        buffer.append("==============================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}