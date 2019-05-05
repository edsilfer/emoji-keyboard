package br.com.instachat.emojikeyboard

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.View
import br.com.instachat.emojikeyboard.adapter.MessageAdapter
import br.com.instachat.emojikeyboard.model.Message
import br.com.instachat.emojilibrary.controller.TelegramPanel
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity
import java.util.*

interface ChatView {
    fun addMessage(message: Message)
    fun getText(): String
    fun toast(message: String)
}

class ChatActivity :
        ChatView,
        EmojiCompatActivity() {

    private val controller = SampleController(this)
    private var adapter: MessageAdapter? = null
    private var bottomPanel: TelegramPanel? = null
    private var messages: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbarAndDrawerMenu()
        setupMessagesRecyclerView()
        bottomPanel = TelegramPanel(this, controller)
    }

    private fun setupToolbarAndDrawerMenu() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(controller)
    }

    private fun setupMessagesRecyclerView() {
        messages = findViewById<View>(R.id.messages) as RecyclerView
        val layout = LinearLayoutManager(this)
        layout.stackFromEnd = true
        messages?.layoutManager = layout
        adapter = MessageAdapter(ArrayList())
        messages?.adapter = adapter
    }

    /**
     * Add app bar menu to allow switching from Telegram to WhatsApp
     */
    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun addMessage(message: Message) {
        adapter!!.dataset.add(message)
        adapter!!.notifyDataSetChanged()
        messages!!.scrollToPosition(adapter!!.itemCount - 1)
        bottomPanel?.text = ""
    }

    override fun toast(message: String) = short_toast(message)

    override fun getText(): String = bottomPanel!!.text
}