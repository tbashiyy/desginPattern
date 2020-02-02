package chap5

fun main(): Unit {
    println("Start")

    val obj1: Singleton = Singleton.getInstance()
    val obj2: Singleton = Singleton.getInstance()

    if( obj1 == obj2 ){
        println("is equal")
    } else {
        println("is not equal")
    }

    println("End")
}