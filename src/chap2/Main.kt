package chap2

fun main(){
    val p: Print = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()

    val pForClass: PrintForClass = PrintBannerForClass("helloForClass")
    pForClass.printStrong()
    pForClass.printWeak()

}