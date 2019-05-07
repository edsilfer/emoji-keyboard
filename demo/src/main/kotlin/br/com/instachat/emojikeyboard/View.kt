package br.com.instachat.emojikeyboard

import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import br.com.instachat.emojilibrary.controller.TelegramPanel
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

/**
 * Public API for ChatView
 */
interface ChatView {
    /**
     * Adds a new message to the chat view
     */
    fun addMessage(message: Message)

    /**
     * Get message
     */
    fun getMessage(): Message

    /**
     * Displays a short toast
     */
    fun toast(message: String)
}

/**
 * {@link ChatView} implementation
 */
class ChatViewImpl : ChatView, EmojiCompatActivity() {

    private lateinit var inputPanel: TelegramPanel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbarAndDrawerMenu()
        setupMessagesRecyclerView()
        inputPanel = TelegramPanel(this, KeyboardListener(this))
    }

    private fun setupToolbarAndDrawerMenu() {
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this,
                drawer_layout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(ChatController(this))
    }

    private fun setupMessagesRecyclerView() {
        messages.apply {
            layoutManager = LinearLayoutManager(this@ChatViewImpl).apply {
                stackFromEnd = true
            }
            adapter = MessageAdapterImpl(ArrayList())
        }
    }

    override fun addMessage(message: Message) {
        (messages.adapter as MessageAdapter).add(message)
        messages.scrollToPosition(messages.adapter!!.itemCount - 1)
        inputPanel.text = ""
    }

    override fun getMessage(): Message = Message.outgoing(inputPanel.text)

    override fun toast(message: String) = shortToast(message)

    /**
     * Add app bar menu to allow switching from Telegram to WhatsApp
     */
    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}