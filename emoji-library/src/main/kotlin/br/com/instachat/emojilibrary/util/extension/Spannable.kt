package br.com.instachat.emojilibrary.util.extension

import android.text.Spannable
import br.com.instachat.emojilibrary.view.EmojiSpan

fun Spannable.removeSpans(textLength: Int) {
    val spans = getSpans(0, textLength, EmojiSpan::class.java)
    spans.forEach { this.removeSpan(it) }
}

fun Spannable.nextUnicode(offset: Int) = Character.codePointAt(this, offset)