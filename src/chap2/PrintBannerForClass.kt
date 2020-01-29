package chap2

class PrintBannerForClass(private val string: String): PrintForClass() {
    private val banner = Banner(string)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}