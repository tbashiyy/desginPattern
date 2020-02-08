package chap8

import chap8.factory.Factory

fun main(args: Array<String>) {
//    if (args.size != 1) {
//        println("Error")
//        exitProcess(0)
//    }
    val factoryName = "chap8.tablefactory.TableFactory"
    val factory = Factory.getFactory(factoryName)

    val asahi = factory.createLink("朝日新聞", "https://www.asahi.com/")
    val yomiuri = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/")
    val usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/")
    val jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/")
    val excite = factory.createLink("Excite", "http://www.excite.com/")
    val google = factory.createLink("Google", "http://www.google.com/")


    val trayNews = factory.createTray("新聞")
    trayNews.add(asahi)
    trayNews.add(yomiuri)

    val trayYahoo = factory.createTray("Yahoo!")
    trayYahoo.add(usYahoo)
    trayYahoo.add(jpYahoo)

    val traySearch = factory.createTray("サーチエンジン")
    traySearch.add(trayYahoo)
    traySearch.add(excite)
    traySearch.add(google)

    val page = factory.createPage("LinkPage", "tomoya yanagibashi")
    page.add(trayNews)
    page.add(traySearch)
    page.outPut()

}