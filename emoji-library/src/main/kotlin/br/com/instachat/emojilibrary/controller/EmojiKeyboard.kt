package br.com.instachat.emojilibrary.controller

import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import br.com.instachat.emojilibrary.R
import br.com.instachat.emojilibrary.adapter.EmojiTabAdapter
import br.com.instachat.emojilibrary.model.Emoji
import br.com.instachat.emojilibrary.view.EmojiCompatActivity
import br.com.instachat.emojilibrary.view.EmojiEditText
import br.com.instachat.emojilibrary.view.listeners.OnEmojiClickListener
import com.ogaclejapan.smarttablayout.SmartTabLayout
import kotlin.math.max

class EmojiKeyboard(
        private val activity: EmojiCompatActivity,
        private val input: EmojiEditText
) : OnEmojiClickListener {

    private var backspace: ImageView? = null
    private val tabIcons = arrayOfNulls<ImageView>(6)
    val keyboardLayout: RelativeLayout = activity.findViewById(R.id.emoji_keyboard)

    init {
        initEmojiKeyboardViewPager()
        setBackspaceBehaviour()
    }

    private fun initEmojiKeyboardViewPager() {
        val adapter = EmojiTabAdapter(activity.supportFragmentManager)
        adapter.onEmojiClicked(this)

        val viewPager = activity.findViewById<ViewPager>(R.id.emoji_viewpager)
        viewPager.adapter = adapter

        val viewPagerTab = activity.findViewById<SmartTabLayout>(R.id.emoji_tabs)
        val inflater = LayoutInflater.from(activity)
        viewPagerTab.setCustomTabView(configureEmojiTabs(inflater))
        viewPagerTab.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                when (position) {
                    0 -> setTabZeroActive()
                    1 -> setTabOneActive()
                    2 -> setTabTwoActive()
                    3 -> setTabThreeActive()
                    4 -> setTabFourActive()
                    5 -> setTabFiveActive()
                }
            }

            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })
        viewPagerTab.setViewPager(viewPager)
    }

    private fun setTabFiveActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_normal)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_normal)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_normal)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_normal)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_normal)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_activated)
    }

    private fun setTabFourActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_normal)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_normal)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_normal)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_normal)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_activated)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
    }

    private fun setTabThreeActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_normal)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_normal)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_normal)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_activated)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_normal)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
    }

    private fun setTabTwoActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_normal)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_normal)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_activated)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_normal)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_normal)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
    }

    private fun setTabOneActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_normal)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_activated)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_normal)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_normal)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_normal)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
    }

    private fun setTabZeroActive() {
        tabIcons[0]!!.setImageResource(R.drawable.ic_emoji_recent_light_activated)
        tabIcons[1]!!.setImageResource(R.drawable.ic_emoji_people_light_normal)
        tabIcons[2]!!.setImageResource(R.drawable.ic_emoji_nature_light_normal)
        tabIcons[3]!!.setImageResource(R.drawable.ic_emoji_objects_light_normal)
        tabIcons[4]!!.setImageResource(R.drawable.ic_emoji_places_light_normal)
        tabIcons[5]!!.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
    }

    private fun configureEmojiTabs(inflater: LayoutInflater): (ViewGroup, Int, PagerAdapter) -> View {
        return { container, position, _ ->
            val icon = inflater.inflate(R.layout.rsc_emoji_tab_icon_view, container, false) as ImageView
            when (position) {
                0 -> {
                    tabIcons[0] = icon
                    icon.setImageResource(R.drawable.ic_emoji_recent_light_normal)
                }
                1 -> {
                    tabIcons[1] = icon
                    icon.setImageResource(R.drawable.ic_emoji_people_light_normal)
                }
                2 -> {
                    tabIcons[2] = icon
                    icon.setImageResource(R.drawable.ic_emoji_nature_light_normal)
                }
                3 -> {
                    tabIcons[3] = icon
                    icon.setImageResource(R.drawable.ic_emoji_objects_light_normal)
                }
                4 -> {
                    tabIcons[4] = icon
                    icon.setImageResource(R.drawable.ic_emoji_places_light_normal)
                }
                5 -> {
                    tabIcons[5] = icon
                    icon.setImageResource(R.drawable.ic_emoji_symbols_light_normal)
                }
                6 -> icon.setImageResource(R.drawable.sym_keyboard_delete_holo_dark)
            }
            icon
        }
    }

    private fun setBackspaceBehaviour() {
        backspace = activity.findViewById<View>(R.id.backspace) as ImageView
        backspace!!.setOnClickListener { input.dispatchKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL)) }
    }

    override fun emojiCliked(emojicon: Emoji?) {
        if (input.selectionStart < 0) {
            input.append(emojicon!!.emoji)
            return
        }

        input.text?.replace(
                input.selectionStart.coerceAtMost(input.selectionEnd),
                max(input.selectionStart, input.selectionEnd),
                emojicon!!.emoji, 0,
                emojicon.emoji.length
        )
    }
}
