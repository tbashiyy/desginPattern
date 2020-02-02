package chap6

import chap6.framework.Product

data class MessageBox(private val decochar: Char): Product {

    override fun use(s: String): Unit {
        val length = s.length
        for(i in 0..length+4){
            print(decochar)
        }
        println("")
        println("$decochar $s $decochar")
        for(i in 0..length+4){
            print(decochar)
        }
        println("")
    }

    override fun createClone(): Product {
        return this.copy()
    }

}