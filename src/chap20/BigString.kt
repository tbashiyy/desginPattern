package chap20

class BigString(private val string: String) {
    private val bigChars: List<BigChar> = string.map { BigCharFactory.getBigChar(it) }

    fun print() {
        bigChars.forEach {
            it.print()
        }
    }
}