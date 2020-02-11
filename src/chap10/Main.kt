package chap10

fun main() {
    val seed1 = 321
    val seed2 = 10

    val player1 = Player("taro", WinningStrategy(seed1))
    val player2 = Player("tomoya", ProbStrategy(seed2))

    for(i in 1..500) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()

        if(nextHand1.isStrongerThan(nextHand2)) {
            println("winner ${player1.getName()}")
            player1.win()
            player2.lose()
        } else if (nextHand2.isStrongerThan(nextHand1)) {
            println("winner ${player2.getName()}")
            player1.lose()
            player2.win()
        } else {
            println("Even")
            player1.even()
            player2.even()
        }
    }

    println("total result")
    println(player1.getName())
    println(player2.getName())
}