package br.com.edsilfer.emojilibrary.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import br.com.edsilfer.emojilibrary.R
import br.com.edsilfer.emojilibrary.view.adapter.EmojiAdapter
import br.com.edsilfer.emojilibrary.model.Emoji
import br.com.edsilfer.emojilibrary.model.Places
import br.com.edsilfer.emojilibrary.util.Constants

class Places : FragmentEmoji() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.frag_emoji_places, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var data: Array<Emoji> = Places.DATA
        var useSystemDefault = false
        if (arguments != null) {
            data = arguments!!.getParcelableArray(Constants.EMOJI_KEY)?.map { it as Emoji }!!.toTypedArray()
            useSystemDefault = arguments!!.getBoolean(Constants.USE_SYSTEM_DEFAULT_KEY)
        }
        val gridView = view.findViewById<GridView>(R.id.Emoji_GridView)
        gridView.adapter = EmojiAdapter(view.context, mutableListOf(*data), useSystemDefault)
        gridView.onItemClickListener = this
    }
}

