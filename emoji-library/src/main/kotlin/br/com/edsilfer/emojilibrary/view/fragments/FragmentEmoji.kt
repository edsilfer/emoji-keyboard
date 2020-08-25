package br.com.edsilfer.emojilibrary.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import androidx.fragment.app.Fragment
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.data.EmojiStore
import br.com.edsilfer.emojilibrary.model.Emoji
import br.com.edsilfer.emojilibrary.view.listeners.EmojiClickListener

open class FragmentEmoji : Fragment(), OnItemClickListener {

    private var rootView: View? = null
    private var emojiClickedListener: MutableList<EmojiClickListener> = mutableListOf()
    private lateinit var emojiStore: EmojiStore

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.frag_emoji_people, container, false)
        emojiStore = EmojiStore.instance(rootView!!.context)
        return rootView
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        val emoji = parent.getItemAtPosition(position) as Emoji
        emojiStore.save(emoji)
        emojiClickedListener.forEach { it.emojiCliked(emoji) }
    }

    fun registerListener(listener: EmojiClickListener) {
        emojiClickedListener.add(listener)
    }

    fun listRecents(): MutableList<Emoji> = emojiStore.list()
}
