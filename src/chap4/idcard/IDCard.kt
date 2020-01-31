package chap4.idcard

import chap4.framework.Product

class IDCard(private val owner: String): Product() {
    init {
        println("$owner のカードを作ります。")
    }

    override fun use(): Unit {
        println("$owner のカードを使います。")
    }

    fun getOwner(): String {
        return owner
    }
}