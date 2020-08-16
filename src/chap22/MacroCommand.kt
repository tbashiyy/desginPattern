package chap22

import java.util.*

class MacroCommand: Command {
    private val commands = mutableListOf<Command>()

    override fun execute() {
        commands.forEach {
            it.execute()
        }
    }

    fun append(cmd: Command) {
        if (cmd != this) {
            commands.add(cmd)
        }
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            println(commands.size)
            commands.removeLast()
            println(commands.size)
        }
    }

    fun clear() {
        commands.clear()
    }
}