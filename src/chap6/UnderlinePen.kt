package chap6

import chap6.framework.Product

data class UnderlinePen(private val ulchar: Char): Product {
    override fun use(s: String) {
        val length = s.length
        println("\" $s \"")
        print(" ")
        for(i in 0..length){
            print(ulchar)
        }
        println("")
    }

    override fun createClone(): Product {
        return this.copy()
    }
}