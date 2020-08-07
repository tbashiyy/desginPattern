package chap17

interface Observer {
    fun update(generator: NumberGenerator)
}