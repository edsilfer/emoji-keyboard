package br.com.instachat.emojilibrary.view.listeners

import br.com.instachat.emojilibrary.model.Emoji

interface OnEmojiClickListener {
    fun emojiCliked(emojicon: Emoji?)
}
