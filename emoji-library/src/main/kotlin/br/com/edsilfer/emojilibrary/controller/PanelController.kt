package br.com.edsilfer.emojilibrary.controller

import android.os.Build
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.view.EmojiActivity
import br.com.edsilfer.emojilibrary.view.EmojiActivity.OnBackPressedListener
import br.com.edsilfer.emojilibrary.view.EmojiEditText
import br.com.edsilfer.emojilibrary.view.EmojiKeyboard
import br.com.edsilfer.emojilibrary.view.listeners.KeyboardListener
import br.com.edsilfer.emojilibrary.view.listeners.PanelEventListener

class PanelController(
        private val context: EmojiActivity,
        private val listener: PanelEventListener?
) : KeyboardListener, TextWatcher {

    private var toogleIcon = true
    private val emojiKeyboard: EmojiKeyboard
    private var isEmojiKeyboardVisible = false

    private var panel: Toolbar = context.findViewById<View>(R.id.panel) as Toolbar
    private var input: EmojiEditText = panel.findViewById<View>(R.id.input) as EmojiEditText
    private var curtain: LinearLayout = context.findViewById<View>(R.id.curtain) as LinearLayout

    var text: String
        get() = input.text.toString()
        set(text) {
            input.setText(text)
        }

    init {
        initBottomPanel()
        setInputConfig()
        onBackPressed()
        emojiKeyboard = EmojiKeyboard(context, input)
    }

    private fun initBottomPanel() {
        panel.setNavigationIcon(R.drawable.input_emoji)
        panel.setTitleTextColor(-0x1)
        panel.inflateMenu(R.menu.telegram_menu)
        panel.setNavigationOnClickListener {
            if (isEmojiKeyboardVisible) {
                curtain.visibility = LinearLayout.INVISIBLE
                if (input.isKeyboardVisible) {
                    panel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp)
                    input.hideSoftKeyboard()
                } else {
                    panel.setNavigationIcon(R.drawable.input_emoji)
                    input.showSoftKeyboard()
                }
            } else {
                panel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp)
                curtain.visibility = LinearLayout.INVISIBLE
                showEmojiKeyboard()
            }

        }
        panel.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_attach -> listener?.onAttachClicked()
                R.id.action_mic -> if (text.isEmpty()) listener?.onMicClicked() else listener?.onSendClicked()
            }
            false
        }
    }

    private fun setInputConfig() {
        input.inputType = InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
        input.addKeyboardListener(this)
        input.addTextChangedListener(this)
    }

    override fun keyboardVisible() {
        curtain.visibility = LinearLayout.VISIBLE
        showEmojiKeyboard()
    }

    override fun keyboardHidden() {
        curtain.visibility = LinearLayout.INVISIBLE
        hideEmojiKeyboard()
    }

    /*
    Handles the animation of the panel buttons when text is written in the EditText
     */
    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        val micButton = panel.menu.findItem(R.id.action_mic)
        if (text.isNotEmpty() && toogleIcon) {
            toogleIcon = false
            panel.findViewById<View>(R.id.action_attach).animate().scaleX(0f).scaleY(0f).setDuration(150).start()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                panel.findViewById<View>(R.id.action_mic).animate().scaleX(0f).scaleY(0f).setDuration(75).withEndAction {
                    micButton.setIcon(R.drawable.ic_send_telegram)
                    panel.findViewById<View>(R.id.action_mic).animate().scaleX(1f).scaleY(1f).setDuration(75).start()
                }.start()
            }
        } else if (text.isEmpty()) {
            toogleIcon = true
            panel.findViewById<View>(R.id.action_attach).animate().scaleX(1f).scaleY(1f).setDuration(150).start()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                panel.findViewById<View>(R.id.action_mic).animate().scaleX(0f).scaleY(0f).setDuration(75).withEndAction {
                    micButton.setIcon(R.drawable.ic_microphone_grey600_24dp)
                    panel.findViewById<View>(R.id.action_mic).animate().scaleX(1f).scaleY(1f).setDuration(75).start()
                }.start()
            }
        }
    }

    private fun onBackPressed() {
        context.setOnBackPressed(object : OnBackPressedListener {
            override fun onBackPressed(): Boolean? {
                if (isEmojiKeyboardVisible) {
                    hideEmojiKeyboard()
                    return true
                }
                return false
            }
        })
    }

    private fun showEmojiKeyboard() {
        isEmojiKeyboardVisible = true
        emojiKeyboard.keyboardLayout.visibility = LinearLayout.VISIBLE
        curtain.visibility = LinearLayout.INVISIBLE
    }

    private fun hideEmojiKeyboard() {
        isEmojiKeyboardVisible = false
        panel.setNavigationIcon(R.drawable.input_emoji)
        emojiKeyboard.keyboardLayout.visibility = LinearLayout.GONE
        curtain.visibility = LinearLayout.VISIBLE
    }

    /*
    DO NOTHING
     */
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun afterTextChanged(p0: Editable?) {}
}

