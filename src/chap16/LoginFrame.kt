package chap16

import java.awt.CheckboxGroup
import java.awt.Frame
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import kotlin.system.exitProcess

class LoginFrame(title: String): Frame(title), ActionListener, Mediator {
    private val g = CheckboxGroup()
    private val checkGuest = ColleagueCheckbox("Guest", g, true)
    private val checkLogin = ColleagueCheckbox("Login", g, false)
    private val textUser = ColleagueTextField("", 10)
    private val textPass = ColleagueTextField("", 10)
    private val buttonOk = ColleagueButton("OK")
    private val buttonCancel = ColleagueButton("Cancel")

    init {
        textPass.echoChar = '*'

        // Mediatorのセット
        val colleagues: List<Colleague> = listOf(checkGuest, checkLogin, textUser, textPass, buttonOk, buttonCancel)
        setMediator(colleagues)

        // Listenerのセット
        checkGuest.addItemListener(checkGuest)
        checkLogin.addItemListener(checkLogin)
        textUser.addTextListener(textUser)
        textPass.addTextListener(textPass)
        buttonOk.addActionListener(this)
        buttonCancel.addActionListener(this)
    }

    override fun actionPerformed(e: ActionEvent) {
        println(e.toString())
        exitProcess(0)
    }

    override fun createColleagues() {
        TODO("Not yet implemented")
    }

    override fun colleagueChanged() {
        if (checkGuest.state) {
            textUser.setColleagueEnabled(false)
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(false)
        } else {
            textUser.setColleagueEnabled(true)
            userPassChanged()
        }
    }

    private fun userPassChanged() {
        if (textUser.text.isNotEmpty()) {
            textPass.setColleagueEnabled(true)
            if (textPass.text.isNotEmpty()) {
                buttonOk.setColleagueEnabled(true)
            } else {
                buttonOk.setColleagueEnabled(false)
            }
        } else {
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(false)
        }
    }

    private fun setMediator(colleagues: List<Colleague>) {
        colleagues.forEach { it.setMediator(this) }
    }
}