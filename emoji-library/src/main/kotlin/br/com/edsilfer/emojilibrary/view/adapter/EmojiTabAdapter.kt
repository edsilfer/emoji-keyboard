package br.com.edsilfer.emojilibrary.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import br.com.edsilfer.emojilibrary.view.fragments.*
import br.com.edsilfer.emojilibrary.view.listeners.EmojiClickListener

class EmojiTabAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val recentEmojis = Recents()
    private val peopleEmojis = People()
    private val natureEmojis = Nature()
    private val objectEmojis = Objects()
    private val placesEmojis = Places()
    private val symbolsEmojis = Symbols()

    init {
        peopleEmojis.registerListener(recentEmojis)
        natureEmojis.registerListener(recentEmojis)
        objectEmojis.registerListener(recentEmojis)
        placesEmojis.registerListener(recentEmojis)
        symbolsEmojis.registerListener(recentEmojis)
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

    fun onEmojiClicked(listener: EmojiClickListener) {
        recentEmojis.registerListener(listener)
        peopleEmojis.registerListener(listener)
        natureEmojis.registerListener(listener)
        objectEmojis.registerListener(listener)
        placesEmojis.registerListener(listener)
        symbolsEmojis.registerListener(listener)
    }
}
