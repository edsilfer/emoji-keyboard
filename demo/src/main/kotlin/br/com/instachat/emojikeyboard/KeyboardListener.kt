package br.com.instachat.emojikeyboard

import br.com.instachat.emojikeyboard.model.Message
import br.com.instachat.emojikeyboard.model.MessageType
import br.com.instachat.emojilibrary.model.layout.TelegramPanelEventListener

class KeyboardListener(private val view: ChatView) : TelegramPanelEventListener {

    companion object {
        const val ECHO_DELAY_IN_MILLISECONDS = 1200L
    }

    override fun onAttachClicked() {
        view.toast("Attach was clicked!")
    }

    override fun onMicClicked() {
        view.toast("Mic was clicked!")
    }

    override fun onSendClicked() {
        val message = Message(type = MessageType.OUTGOING,
                content = view.getText()
        )
        view.addMessage(message)
        echo(message)
    }

    private fun echo(income: Message) {
        doAsync({
            try {
                Thread.sleep(ECHO_DELAY_IN_MILLISECONDS)
                Message(type = MessageType.INCOME,
                        content = income.content)
            } catch (e: InterruptedException) {
                view.toast("Unable to echo. Cause: ${e.message}")
            }
        }, { msg -> view.addMessage(msg as Message) })
    }
}