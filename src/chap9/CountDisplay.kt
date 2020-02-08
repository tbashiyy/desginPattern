package chap9

class CountDisplay(private val impl: DisplayImpl): Display(impl) {
    fun multiDisplay(times: Int): Unit {
        open()
        for(i in 1..times) {
            print()
        }
        close()
    }
}