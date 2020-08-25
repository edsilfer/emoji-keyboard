package br.com.instachat.emojilibrary.controller.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import br.com.instachat.emojilibrary.R
import br.com.instachat.emojilibrary.adapter.EmojiAdapter
import br.com.instachat.emojilibrary.controller.FragmentEmoji
import br.com.instachat.emojilibrary.model.Emoji
import br.com.instachat.emojilibrary.util.Constants
import br.com.instachat.emojilibrary.view.listeners.OnEmojiClickListener

class Recents : FragmentEmoji(), OnEmojiClickListener {

    private lateinit var adapter: EmojiAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.frag_emoji_recents, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var useSystemDefault = false
        if (arguments != null) {
            useSystemDefault = arguments!!.getBoolean(Constants.USE_SYSTEM_DEFAULT_KEY)
        }
        val gridView = view.findViewById<GridView>(R.id.Emoji_GridView)
        adapter = EmojiAdapter(view.context, listRecents(), useSystemDefault)
        gridView.adapter = adapter
        gridView.onItemClickListener = this
    }

    override fun onResume() {
        super.onResume()
        adapter.updateItems(listRecents())
    }

    override fun emojiCliked(emojicon: Emoji?) {
        adapter.notifyDataSetChanged()
    }
}
