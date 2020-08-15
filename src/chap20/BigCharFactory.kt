package chap20

object BigCharFactory {
    private val pool: HashMap<Char, BigChar> = hashMapOf()

    fun getBigChar(charName: Char):BigChar {
        return pool.getOrElse(charName, {
            val bigChar = BigChar(charName)
            pool[charName] = bigChar
            return bigChar
        })
    }
}