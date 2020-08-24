package br.com.instachat.emojilibrary.view

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import br.com.instachat.emojilibrary.R

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class WhatsAppPanel @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet,
        defStyleAttr: Int,
        defStyleRes: Int
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.rsc_whatsapp_panel, this, true)
    }

}
