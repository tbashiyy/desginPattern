package chap21

fun main() {
    val p = PrinterProxy("Alice")
    println("名前は ${p.getPrinterName()}")
    p.setPrinterName("Bob")
    println("名前は ${p.getPrinterName()}")
    p.print("Hello, World")
}