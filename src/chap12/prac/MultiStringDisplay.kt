package chap12.prac

import chap12.Display

class MultiStringDisplay(): Display() {
    private val strings: MutableList<String> = mutableListOf<String>()

    override fun getColumns(): Int {
        return strings.maxBy { it.length }?.length ?: 0
    }

    override fun getRows(): Int {
        return strings.size
    }

    override fun getRowText(row: Int): String {
        val text = strings[row]
        val length = text.length
        return strings[row] + "　".repeat(getColumns() - length)
    }

    fun add(string: String) {
        strings.add(string)
    }
}