package br.com.instachat.emojikeyboard

import android.support.design.widget.NavigationView
import android.view.MenuItem
import br.com.instachat.emojikeyboard.model.Message
import br.com.instachat.emojikeyboard.model.MessageType
import br.com.instachat.emojilibrary.model.layout.TelegramPanelEventListener

class SampleController(
        private val view: ChatView
) : TelegramPanelEventListener, NavigationView.OnNavigationItemSelectedListener {

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
        val message = createOutgoingMessage()
        view.addMessage(message)
        echoMessage(message)
    }

    private fun echoMessage(income: Message) {
        doAsync({
            try {
                Thread.sleep(ECHO_DELAY_IN_MILLISECONDS)
                createIncomeMessage(income)
            } catch (e: InterruptedException) {
                view.toast("Unable to echo. Cause: ${e.message}")
            }
        }, { msg -> view.addMessage(msg as Message) })
    }

    private fun createOutgoingMessage() = Message().apply {
        type = MessageType.OUTGOING
        timestamp = currentTime()
        content = view.getText()
    }

    private fun createIncomeMessage(income: Message) = Message().apply {
        type = MessageType.INCOME
        timestamp = currentTime()
        content = income.content
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_toogle -> startWhatsAppDemo()
            R.id.nav_edgar -> view.toast("Monica é linda")
        }
        return true
    }

    private fun startWhatsAppDemo() {
        // TODO: implement
    }
}