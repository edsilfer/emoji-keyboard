package br.com.instachat.emojilibrary.view.listeners

/**
 * Callback for soft keyboard events
 */
interface KeyboardListener {

    /**
     * Called when the keyboard becomes visible
     */
    fun keyboardVisible()

    /**
     * Called when the keyboard becomes invisible
     */
    fun keyboardHidden()
}