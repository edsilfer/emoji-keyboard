package br.com.instachat.emojilibrary.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import br.com.instachat.emojilibrary.controller.emoji_pages.*
import br.com.instachat.emojilibrary.view.listeners.OnEmojiClickListener

class EmojiTabAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {

    private val recentEmojis = FragmentEmojiRecents()
    private val peopleEmojis = FragmentEmojiPeople()
    private val natureEmojis = FragmentEmojiNature()
    private val objectEmojis = FragmentEmojiObjects()
    private val placesEmojis = FragmentEmojiPlaces()
    private val symbolsEmojis = FragmentEmojiSymbols()


    init {
        peopleEmojis.subscribeRecentListener(recentEmojis)
        natureEmojis.subscribeRecentListener(recentEmojis)
        objectEmojis.subscribeRecentListener(recentEmojis)
        placesEmojis.subscribeRecentListener(recentEmojis)
        symbolsEmojis.subscribeRecentListener(recentEmojis)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "RECENTS"
            1 -> "PEOPLE"
            2 -> "NATURE"
            3 -> "OBJECTS"
            4 -> "PLACES"
            5 -> "SYMBOLS"
            else -> "UNKNOW"
        }
    }

    override fun getCount(): Int = 6

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> recentEmojis
            1 -> peopleEmojis
            2 -> natureEmojis
            3 -> objectEmojis
            4 -> placesEmojis
            5 -> symbolsEmojis
            else -> recentEmojis
        }
    }

    fun onEmojiClicked(listener: OnEmojiClickListener?) {
        recentEmojis.addEmojiconClickListener(listener)
        peopleEmojis.addEmojiconClickListener(listener)
        natureEmojis.addEmojiconClickListener(listener)
        objectEmojis.addEmojiconClickListener(listener)
        placesEmojis.addEmojiconClickListener(listener)
        symbolsEmojis.addEmojiconClickListener(listener)
    }
}
