package br.com.edsilfer.emojilibrary.model

import android.content.Context
import android.text.Spannable

/**
 * Struct tha encapsulates the required data in order to add emojis to text
 */
data class AddEmojiConfiguration(
        val context: Context,
        val text: Spannable,
        val emojiSize: Int,
        val emojiAlignment: Int,
        val textSize: Int,
        val index: Int = 0,
        val length: Int = -1,
        val useSystemDefault: Boolean = false
) {
    val textLength = if (length < 0 || length >= text.length - index) text.length else length + index
}