package br.com.instachat.emojikeyboard

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.instachat.emojikeyboard.model.Message
import br.com.instachat.emojikeyboard.model.MessageType
import br.com.instachat.emojilibrary.model.layout.EmojiTextView

class MessageAdapter(var data: MutableList<Message>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var context: Context? = null

    override fun getItemViewType(idx: Int): Int = data[idx].type.ordinal

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MessageType.INCOME.ordinal -> getViewHolder(parent, R.layout.rsc_chat_canvas_msg_income)
            else -> getViewHolder(parent, R.layout.rsc_chat_canvas_msg_outgoing)
        }
    }

    private fun getViewHolder(parent: ViewGroup, layout: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(layout, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).apply {
            content.text = data[position].content
            content.setUseSystemDefault(false)
            timestamp.text = formatTimestamp(context!!, data[position].timestamp, "HH:mm")
        }
    }

    private inner class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        val content: EmojiTextView = view.findViewById(R.id.content)
        val timestamp: TextView = view.findViewById(R.id.timestamp)
    }
}
