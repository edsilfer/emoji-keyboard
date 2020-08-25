package br.com.edsilfer.emojikeyboard

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.edsilfer.emojilibrary.view.EmojiTextView


/**
 * Public API for message adapter
 */
interface MessageAdapter {
    /**
     * Add a new item to the list
     */
    fun add(message: Message)
}


/**
 * Message adapter implementation
 */
class MessageAdapterImpl(private var data: MutableList<Message>) : RecyclerView.Adapter<MessageViewHolder>(), MessageAdapter {

    override fun getItemCount(): Int = data.size

    override fun getItemViewType(idx: Int): Int = data[idx].type.layout

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): MessageViewHolder = MessageViewHolder(parent.inflate(view))

    override fun onBindViewHolder(holder: MessageViewHolder, idx: Int) = holder.bind(data[idx])

    override fun add(message: Message) {
        data.add(message)
        notifyDataSetChanged()
    }

}

class MessageViewHolder constructor(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(msg: Message) {
        /*
        Not using Kotlin synthetic because view is dynamically inflated
         */
        (view.findViewById(R.id.content) as EmojiTextView).text = msg.content
        (view.findViewById(R.id.timestamp) as TextView).text = msg.timestamp.format("HH:mm")
    }
}