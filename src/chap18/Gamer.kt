package chap18

import java.util.Random

class Gamer(private var money: Int) {
    private var fruits: MutableList<String> = mutableListOf()
    private val random = Random()
    private val fruitsName = listOf("リンゴ", "ぶどう", "バナナ", "みかん")

    fun getMoney(): Int {
        return money
    }

    fun bet() {
        val dice = random.nextInt(6) + 1

        when(dice) {
            1 -> {
                money += 100
                println("所持金がふえました")
            }
            2 -> {
                money /= 2
                println("所持金が半分になりました")
            }
            6 -> {
                val f = getFruit()
                println("フルーツ $f をもらいました。")
                fruits.add(f)
            }
            else -> println("なにも起こりませんでした。")
        }
    }

    fun createMemento(): Memento {
        val m = Memento(money)
        fruits.forEach {
            m.addFruit(it)
        }
        return m
    }

    fun restoreMemento(memento: Memento) {
        money = memento.getMoney()
        fruits = memento.getFruits().toMutableList()
    }

    override fun toString(): String {
        return "[money = $money, fruit = $fruits]"
    }

    private fun getFruit(): String {
        val prefix = if (random.nextBoolean()) "おいしい" else ""
        return "$prefix${fruitsName[random.nextInt(fruitsName.size)]}"
    }
}