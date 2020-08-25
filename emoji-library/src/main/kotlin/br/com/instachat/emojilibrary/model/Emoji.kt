package br.com.instachat.emojilibrary.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.sql.Timestamp

@Parcelize
data class Emoji(
        var icon: Int = 0,
        val value: Char = 0.toChar(),
        val emoji: String = "",
        val timestamp: Timestamp? = null
) : Parcelable {
    companion object {
        @JvmStatic
        fun from(codePoint: Int): Emoji = Emoji(emoji = newString(codePoint))

        @JvmStatic
        fun from(char: Char): Emoji = Emoji(emoji = char.toString())

        @JvmStatic
        fun from(chars: String): Emoji = Emoji(emoji = chars)

        private fun newString(codePoint: Int): String {
            return if (Character.charCount(codePoint) == 1) {
                codePoint.toString()
            } else {
                String(Character.toChars(codePoint))
            }
        }
    }
}