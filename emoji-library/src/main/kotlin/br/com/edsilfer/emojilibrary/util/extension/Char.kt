package br.com.edsilfer.emojilibrary.util.extension

import android.util.SparseIntArray

object SoftBank {
    val EMOJI_MAP = SparseIntArray(471)
}

fun Char.isSoftBankEmoji(): Boolean = toInt() shr 12 == 0xe

fun Char.asSoftBankEmojiResource(): Int {
    return if (isSoftBankEmoji()) SoftBank.EMOJI_MAP[toInt()] else 0
}

fun Int.charCount(): Int = Character.charCount(this)

fun Int.toHexString(): String = Integer.toHexString(this)