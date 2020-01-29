package chap2

fun main(){
    val p = PrintBanner("Hello")
    println(p.getString())
    p.printWeak()
    p.printStrong()

    val pForClass = PrintBannerForClass("helloForClass")
    pForClass.printStrong()
    pForClass.printWeak()

}