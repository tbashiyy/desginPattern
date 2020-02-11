package chap10

class Player(private val name: String, private val strategy: Strategy) {
    private var winCount = 0
    private var loseCount = 0
    private var gameCount = 0

    fun nextHand(): Hand {
        return strategy.nextHand()
    }

    fun win(): Unit {
        strategy.study(true)
        winCount++
        gameCount++
    }

    fun lose(): Unit {
        strategy.study(false)
        loseCount++
        gameCount++
    }

    fun even(): Unit {
        gameCount++
    }

    fun getName(): String {
        return "$name:$gameCount games, $winCount win, $loseCount lose."
    }

}