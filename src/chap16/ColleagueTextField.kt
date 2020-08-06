package chap16

import java.awt.Color
import java.awt.TextField
import java.awt.event.TextEvent
import java.awt.event.TextListener
import java.lang.Exception

class ColleagueTextField(text: String, columns: Int): TextField(text, columns), TextListener, Colleague {
    private var mediator: Mediator? = null

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
        background = if (enabled) Color.white else Color.lightGray
    }

    override fun textValueChanged(e: TextEvent) {
        mediator?.colleagueChanged() ?: throw InvalidColleagueException("mediator is not defined")
    }
}