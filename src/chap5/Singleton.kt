package chap5

object Singleton {
    init {
        println("create singleton")
    }

    fun getInstance(): Singleton {
        return this
    }
}