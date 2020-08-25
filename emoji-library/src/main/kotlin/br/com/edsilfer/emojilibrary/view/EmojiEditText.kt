package br.com.edsilfer.emojilibrary.view

import android.content.Context
import android.text.style.DynamicDrawableSpan
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.View.OnFocusChangeListener
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.AppCompatEditText
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.model.AddEmojiConfiguration
import br.com.edsilfer.emojilibrary.util.Emoji.add
import br.com.edsilfer.emojilibrary.util.Keyboard.dismiss
import br.com.edsilfer.emojilibrary.util.Keyboard.show
import br.com.edsilfer.emojilibrary.view.listeners.KeyboardListener

class EmojiEditText : AppCompatEditText {
    private var keyboardListeners: MutableList<KeyboardListener> = mutableListOf()

    var isKeyboardVisible = false
        private set
    private var iconSize = 0
    private var iconAlignment = 0
    private var useSystemDefault = false

    constructor(context: Context) : super(context) {
        init(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        initializeCustomAttributes(attrs)
        onFocusChangeListener = OnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                isKeyboardVisible = true
                keyboardListeners.forEach { it.keyboardVisible() }
            }
        }
    }

    private fun initializeCustomAttributes(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.EmojiTextView)
        iconSize = typedArray.getDimension(R.styleable.EmojiTextView_emojiSize, textSize).toInt()
        iconAlignment = typedArray.getInt(R.styleable.EmojiTextView_emojiAlignment, DynamicDrawableSpan.ALIGN_BASELINE)
        useSystemDefault = typedArray.getBoolean(R.styleable.EmojiTextView_emojiUseSystemDefault, false)
        typedArray.recycle()
    }

    override fun onKeyPreIme(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(this.windowToken, 0)
            clearFocus()
            isKeyboardVisible = java.lang.Boolean.FALSE
            keyboardListeners.forEach { it.keyboardHidden() }
        }
        return true
    }

    override fun onTextChanged(text: CharSequence, start: Int, lengthBefore: Int, lengthAfter: Int) {
        updateText()
    }

    private fun updateText() = add(AddEmojiConfiguration(
            context = context,
            text = text!!,
            emojiSize = iconSize,
            emojiAlignment = iconAlignment,
            textSize = textSize.toInt(),
            useSystemDefault = useSystemDefault
    ))

    fun showSoftKeyboard() {
        isKeyboardVisible = true
        show(context, this)
    }

    fun hideSoftKeyboard() {
        isKeyboardVisible = false
        clearFocus()
        dismiss(context, this)
    }

    fun addKeyboardListener(keyboardListener: KeyboardListener) {
        keyboardListeners.add(keyboardListener)
    }
}
