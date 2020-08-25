package br.com.edsilfer.emojilibrary.view.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.model.Emoji
import br.com.edsilfer.emojilibrary.view.EmojiTextView

class EmojiAdapter @JvmOverloads constructor(
        context: Context,
        var data: MutableList<Emoji>,
        private val useSystemDefault: Boolean)
    : ArrayAdapter<Emoji?>(context, R.layout.rsc_emoji_item, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if (view == null) {
            view = View.inflate(context, R.layout.rsc_emoji_item, null)
            view.tag = ViewHolder(view, useSystemDefault)
        }

        if (null != getItem(position)) {
            val emoji = getItem(position)
            val holder = view!!.tag as ViewHolder
            holder.icon.text = emoji!!.emoji
        }

        return view!!
    }

    override fun getCount(): Int = data.size

    fun updateItems(items: List<Emoji>) {
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    internal class ViewHolder(view: View?, useSystemDefault: Boolean?) {
        var icon: EmojiTextView = view!!.findViewById<View>(R.id.emoji_icon) as EmojiTextView

        init {
            icon.setUseSystemDefault(useSystemDefault!!)
        }
    }
}
