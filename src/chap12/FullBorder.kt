package chap12

class FullBorder(display: Display): Border(display) {
    private val line = "-".repeat(getColumns()-1)

    override fun getColumns(): Int {
        return display.getColumns() + 2
    }

    override fun getRows(): Int {
        return display.getRows() + 2
    }

    override fun getRowText(row: Int): String {
        return if (row == 0 || row == getRows() - 1) {
            return "+${line}+"
        } else {
            "|${display.getRowText(row - 1)}|"
        }
    }
}