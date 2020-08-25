package br.com.edsilfer.emojilibrary.util

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * Set of utilities for dealing with keyboard
 */
object Keyboard {
    const val TAG = "SoftKeyboardUtil"

    @JvmStatic
    fun dismiss(context: Context, editText: EditText) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
        editText.clearFocus()
    }

    @JvmStatic
    fun show(context: Context, editText: EditText) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
        editText.requestFocus()
    }
}