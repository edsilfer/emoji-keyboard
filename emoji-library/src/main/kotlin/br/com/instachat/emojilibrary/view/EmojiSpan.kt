package br.com.instachat.emojilibrary.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.style.DynamicDrawableSpan
import android.util.Log
import br.com.instachat.emojilibrary.util.extension.getCompatDrawable
import java.lang.ref.WeakReference

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
class EmojiSpan(
        private val context: Context,
        private val resourceId: Int,
        private val size: Int,
        alignment: Int,
        private val textSize: Int,
        private var height: Int = size,
        private var width: Int = size

) : DynamicDrawableSpan(alignment) {

    companion object {
        private val TAG = EmojiSpan::class.simpleName
    }

    private var top = 0
    private var drawable: Drawable? = null
    private var drawableRef: WeakReference<Drawable?>? = null
    private val cachedDrawable: Drawable?
        get() {
            if (drawableRef == null || drawableRef!!.get() == null) {
                drawableRef = WeakReference(drawable)
            }
            return drawableRef!!.get()
        }

    override fun getDrawable(): Drawable {
        if (drawable == null) {
            try {
                drawable = context.getCompatDrawable(resourceId)
                height = size
                width = height * drawable!!.intrinsicWidth / drawable!!.intrinsicHeight
                top = (textSize - height) / 2
                drawable!!.setBounds(0, top, width, top + height)
            } catch (e: Exception) {
                Log.e(TAG, e.message ?: "Unable to get drawable")
            }
        }
        return drawable!!
    }

    override fun draw(canvas: Canvas, text: CharSequence, start: Int, end: Int, x: Float, top: Int, y: Int, bottom: Int, paint: Paint) {
        canvas.save()
        var transY = bottom - cachedDrawable!!.bounds.bottom
        if (mVerticalAlignment == ALIGN_BASELINE) {
            transY = top + (bottom - top) / 2 - (cachedDrawable!!.bounds.bottom - cachedDrawable!!.bounds.top) / 2 - this.top
        }
        canvas.translate(x, transY.toFloat())
        cachedDrawable!!.draw(canvas)
        canvas.restore()
    }
}