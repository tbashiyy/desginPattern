package chap21

interface Printable {
    fun setPrinterName(name: String)
    fun getPrinterName(): String
    fun print(string: String)
}