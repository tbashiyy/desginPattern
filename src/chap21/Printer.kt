package chap21

class Printer(private var name: String): Printable {
    init {
        heavyJob("Printerのインスタンス($name)を生成中")
    }

    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        println(msg)
        for(i in 0..5) {
            try {
                Thread.sleep(1000)
            } catch (e: InterruptedException) {
                //
            }
            kotlin.io.print(".")
        }
        println("完了。")
    }
}