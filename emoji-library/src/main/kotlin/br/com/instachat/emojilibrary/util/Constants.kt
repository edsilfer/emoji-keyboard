package br.com.instachat.emojilibrary.util

import br.com.instachat.emojilibrary.R

/**
 * Set of constants used throughout the library
 */
object Constants {
    const val USE_SYSTEM_DEFAULT_KEY = "useSystemDefaults"
    const val EMOJI_KEY = "emojic"
    const val KEY_CAP_EMOJI = 0x20e3
    const val COLOR_MODE_EMOJI = 0xfe0f
    const val RECENT_EMOJIS = "RECENTS"
    const val PREFERENCES_FILE = "EmojiProperties"


    fun keyCapEmojiFrom(unicode: Int): Int {
        return when (unicode) {
            0x0023 -> R.drawable.emoji_0023
            0x002a -> R.drawable.emoji_002a_20e3
            0x0030 -> R.drawable.emoji_0030
            0x0031 -> R.drawable.emoji_0031
            0x0032 -> R.drawable.emoji_0032
            0x0033 -> R.drawable.emoji_0033
            0x0034 -> R.drawable.emoji_0034
            0x0035 -> R.drawable.emoji_0035
            0x0036 -> R.drawable.emoji_0036
            0x0037 -> R.drawable.emoji_0037
            0x0038 -> R.drawable.emoji_0038
            0x0039 -> R.drawable.emoji_0039
            else -> throw IllegalArgumentException("Unknown unicode")
        }
    }
}