package chap10

import kotlin.random.Random

class ProbStrategy(private val seed: Int): Strategy {
    private val random = Random(seed)
    private var prevHandValue: Int = 0
    private var currentHandValue: Int = 0

    private val history = Array(3) { IntArray(3) {1} } //javaのArray[3][3]と同値・2次元配列をすべて1で初期化

    override fun nextHand(): Hand {
        val bet = random.nextInt(getSum(currentHandValue))
        var handValue = 0
        if (bet < history[currentHandValue][0]) {
            handValue = 0
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1
        } else{
            handValue = 2
        }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    private fun getSum(hv: Int): Int {
        var sum = 0
        for(i in 0..2) {
            sum += history[hv][i]
        }
        return sum
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        }else{
            history[prevHandValue][(currentHandValue+1)%3]++
            history[prevHandValue][(currentHandValue+2)%3]++
        }
    }
}