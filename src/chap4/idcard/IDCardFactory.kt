package chap4.idcard

import chap4.framework.Factory
import chap4.framework.Product

class IDCardFactory(): Factory() {
    private val owners: MutableList<String> = mutableListOf()

    override fun createProduct(owner: String): IDCard {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        val owner = (product as IDCard).getOwner()
        owners.add(owner)
    }

    fun getOwners(): List<String> {
        return owners
    }

}