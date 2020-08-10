package chap18

class Memento(private val money: Int) {
    private val fruits: MutableList<String> = mutableListOf()

    fun getMoney(): Int {
        return money
    }

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }

    fun getFruits(): List<String> {
        return fruits.toList()
    }
}