package chap17

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver")
        for(i in 0..generator.getNumber()) {
           print("*")
        }
        println("")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {

        }
    }
}