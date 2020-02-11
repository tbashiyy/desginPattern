package chap10

import kotlin.random.Random

class WinningStrategy(private val seed: Int): Strategy {
    private val random: Random = Random(seed)
    private var won = false
    private lateinit var prevHand: Hand

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}