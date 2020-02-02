package chap6.framework

interface Product {
    abstract fun use(s: String): Unit
    abstract fun createClone(): Product
}