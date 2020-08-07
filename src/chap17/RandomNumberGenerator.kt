package chap17

import java.util.*

class RandomNumberGenerator: NumberGenerator() {
    private val random = Random()
    private var number: Int? = null

    override fun getNumber(): Int {
        return number ?: throw Exception("number is not executed")
    }

    override fun execute() {
        for(i in 0..20) {
            number = random.nextInt(50)
            notifyObserver()
        }
    }
}