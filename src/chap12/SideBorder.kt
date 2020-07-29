package chap12

class SideBorder(display: Display, private val borderChar: Char): Border(display) {
    override fun getColumns(): Int {
        return display.getColumns() + 1
    }

    override fun getRows(): Int {
        return display.getRows()
    }

    override fun getRowText(row: Int): String {
        return borderChar + display.getRowText(row) + borderChar
    }
}