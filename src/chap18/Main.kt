package chap18

fun main() {
    val gamer = Gamer(100)
    var memento = gamer.createMemento()

    for(i in 0..100) {
        println("==== $i")
        println("現状: $gamer")

        gamer.bet()

        println("所持金は ${gamer.getMoney()}円になりました。")

        if (gamer.getMoney() > memento.getMoney()) {
            println("お金が増えたので保存する")
            memento = gamer.createMemento()
        } else if (gamer.getMoney() < memento.getMoney()) {
            println("おかねが減ったので以前の状態に復元")
            gamer.restoreMemento(memento)
        }

        try {
            Thread.sleep(1000)
        } catch (e: InterruptedException) {
            //
        }

        println("")
    }
}