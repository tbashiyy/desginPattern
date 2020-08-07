package chap17

abstract class NumberGenerator() {
    private val observers: MutableList<Observer> = mutableListOf()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObserver() {
        observers.forEach { it.update(this) }
    }

    abstract fun getNumber(): Int
    abstract fun execute()
}