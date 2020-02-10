package chap9


class RandomDisplay( private val impl: DisplayImpl): Display(impl) {
    fun randomDisplay(maxTimes: Int): Unit {
        val rand = (Math.random() * maxTimes).toInt()
        for(i in 1..rand) {
            println(display())
        }
    }
}