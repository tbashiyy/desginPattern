package chap14

class Trouble(private val number: Int) {
    fun getNumber(): Int {
        return number
    }

    override fun toString(): String {
        return "[Trouble $number]"
    }
}