package chap12.prac

import chap12.Border
import chap12.Display

class UpDownBorder(display: Display, borderCh: Char): Border(display) {
    private val line = borderCh.toString().repeat(getColumns() + 1)

    override fun getColumns(): Int {
        return display.getColumns()
    }

    override fun getRows(): Int {
        return display.getRows() + 2
    }

    override fun getRowText(row: Int): String {
        return if (row == 0 || row == getRows() - 1) {
            line
        } else {
            display.getRowText(row - 1)
        }
    }
}