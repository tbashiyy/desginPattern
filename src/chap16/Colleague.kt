package chap16

import java.lang.Exception

interface Colleague {
    fun setMediator(mediator: Mediator)
    fun setColleagueEnabled(enabled: Boolean)
}

class InvalidColleagueException(message: String): Exception(message)