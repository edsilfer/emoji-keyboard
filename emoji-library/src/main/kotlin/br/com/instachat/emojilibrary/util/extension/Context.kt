package br.com.instachat.emojilibrary.util.extension

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

fun Context.getCompatDrawable(resourceId: Int): Drawable? {
    return ResourcesCompat.getDrawable(this.resources, resourceId, null)
}