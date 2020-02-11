package chap10

class Hand private constructor(private val handValue: Int) {

    companion object {
        final val HANDVALUE_GUU = 0
        final val HANDVALUE_CHO = 1
        final val HANDVALUE_PAA = 2

        final val Hands: List<Hand> = listOf(
            Hand(HANDVALUE_GUU),
            Hand(HANDVALUE_CHO),
            Hand(HANDVALUE_PAA)
        )

        final val name: List<String> = listOf(
            "グー",
            "チョキ",
            "パー"
        )

        fun getHand(handValue: Int): Hand {
            return Hands[handValue]
        }
    }

    fun isStrongerThan(h: Hand): Boolean {
        return fight(h) == 1
    }

    fun isWeakerThan(h: Hand): Boolean {
        return fight(h) == -1
    }

    fun getName(): String {
        return name[handValue]
    }

    private fun fight(h: Hand): Int {
        return when(h.handValue) {
            this.handValue -> 0
            (this.handValue + 1) % 3 -> 1
            else -> -1
        }
    }

}