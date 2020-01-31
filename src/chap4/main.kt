package chap4

import chap4.idcard.IDCardFactory

fun main(): Unit {
    val factory = IDCardFactory()
    val card1 = factory.create("taro")
    val card2 = factory.create("jiro")
    val card3 = factory.create("ichiro")
    card1.use()
    card2.use()
    card3.use()
    println(factory.getOwners())
}