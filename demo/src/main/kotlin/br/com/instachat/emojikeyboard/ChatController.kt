package br.com.instachat.emojikeyboard

import android.support.design.widget.NavigationView
import android.view.MenuItem


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