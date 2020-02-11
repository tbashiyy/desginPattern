package chap10

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean): Unit
}