package chap19

fun main() {
    val frame = SafeFrame("State Sample")
    while(true) {
        for(hour in 0..24){
            frame.setClock(hour)
            try {
                Thread.sleep(1000)
            } catch(e: InterruptedException) {
                //
            }
        }
    }
}