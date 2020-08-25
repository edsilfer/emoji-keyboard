package br.com.edsilfer.emojilibrary.view

import androidx.appcompat.app.AppCompatActivity


open class EmojiActivity : AppCompatActivity() {

    private var onBackPressedListener: OnBackPressedListener? = null

    override fun onBackPressed() {
        if (onBackPressedListener != null) {
            if (!onBackPressedListener!!.onBackPressed()!!) {
                super.onBackPressed()
            }
        } else {
            super.onBackPressed()
        }
    }

    open fun setOnBackPressed(backListener: OnBackPressedListener) {
        this.onBackPressedListener = backListener
    }


    interface OnBackPressedListener {
        fun onBackPressed(): Boolean?
    }
}
