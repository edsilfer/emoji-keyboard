package br.com.edsilfer.emojilibrary.view

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.style.DynamicDrawableSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.model.AddEmojiConfiguration
import br.com.edsilfer.emojilibrary.util.Emoji.add

class EmojiTextView @JvmOverloads constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyle: Int = 0
) : AppCompatTextView(context, attrs, defStyle) {

    private var emojiSize = 0
    private var emojiAlignment = 0
    private var textStart = 0
    private var textLength = -1
    private var useSystemDefault1 = false


    init {
        if (attrs == null) {
            emojiSize = textSize.toInt()
        } else {
            initCustomAttributes(attrs)
        }
    }

    private fun initCustomAttributes(attrs: AttributeSet?) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.EmojiTextView)
        emojiSize = typedArray.getDimension(R.styleable.EmojiTextView_emojiSize, textSize).toInt()
        emojiAlignment = typedArray.getInt(R.styleable.EmojiTextView_emojiAlignment, DynamicDrawableSpan.ALIGN_BASELINE)
        textStart = typedArray.getInteger(R.styleable.EmojiTextView_emojiTextStart, 0)
        textLength = typedArray.getInteger(R.styleable.EmojiTextView_emojiTextLength, -1)
        useSystemDefault1 = typedArray.getBoolean(R.styleable.EmojiTextView_emojiUseSystemDefault, false)
        typedArray.recycle()
    }

    override fun setText(text: CharSequence, type: BufferType) {
        val builder = SpannableStringBuilder(text)
        if (text.isNotEmpty()) {
            add(AddEmojiConfiguration(
                    context,
                    builder,
                    emojiSize,
                    emojiAlignment,
                    textSize.toInt(),
                    textStart,
                    textLength,
                    false
            ))
        }
        super.setText(builder, type)
    }

    fun setUseSystemDefault(useSystemDefault: Boolean) {
        useSystemDefault1 = useSystemDefault
    }
}
