package br.com.instachat.emojilibrary.util

import android.text.Spannable
import br.com.instachat.emojilibrary.model.layout.EmojiSpan

fun Spannable.removeSpans(textLength: Int) {
    val spans = getSpans(0, textLength, EmojiSpan::class.java)
    spans.forEach { this.removeSpan(it) }
}

fun Spannable.nextUnicode(offset: Int) = Character.codePointAt(this, offset)