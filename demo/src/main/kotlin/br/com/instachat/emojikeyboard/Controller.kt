package br.com.instachat.emojikeyboard

import android.view.MenuItem
import br.com.instachat.emojilibrary.model.layout.TelegramPanelEventListener
import com.google.android.material.navigation.NavigationView

private const val ECHO_DELAY = 1000L

/**
 * Middleware for manipulating screen information
 */
class ChatController(private val view: ChatView) : NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_toogle -> startWhatsAppDemo()
            R.id.nav_edgar -> view.toast("Author clicked")
        }
        return true
    }

    private fun startWhatsAppDemo() {
        // TODO: implement
    }

}

/**
 * Listener for keyboard interactions
 */
class KeyboardListener(private val view: ChatView) : TelegramPanelEventListener {

    override fun onAttachClicked() = view.toast("Attach was clicked!")

    override fun onMicClicked() = view.toast("Mic was clicked!")

    override fun onSendClicked() = with(view.getMessage()) {
        view.addMessage(this)
        echo(this)
    }

    private fun echo(income: Message) = doAsync(
            delay(ECHO_DELAY) { Message.income(income.content) },
            { msg -> view.addMessage(msg as Message) }
    )
}