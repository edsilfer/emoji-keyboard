package br.com.instachat.emojilibrary.controller;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.adapter.EmojiTabAdapter;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.model.OnEmojiClickListener;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.layout.EmojiEditText;

/**
 * Created by edgar on 21/02/2016.
 */
public class EmojiKeyboard implements OnEmojiClickListener {

    private EmojiCompatActivity activity;

    private ImageView[] tabIcons = new ImageView[6];
    private RelativeLayout keyboardLayout;
    private EmojiEditText input;
    private ImageView backspace;

    public EmojiKeyboard(EmojiCompatActivity activity, EmojiEditText input) {
        this.input = input;
        this.activity = activity;
        this.keyboardLayout = this.activity.findViewById(R.id.emoji_keyboard);
        this.initEmojiKeyboardViewPager();
        this.setBackspaceBehaviour();
    }

    private void initEmojiKeyboardViewPager() {
        final EmojiTabAdapter adapter = new EmojiTabAdapter(activity.getSupportFragmentManager());
        adapter.onEmojiClicked(this);
        final ViewPager viewPager = activity.findViewById(R.id.emoji_viewpager);
        viewPager.setAdapter(adapter);

        final SmartTabLayout viewPagerTab = activity.findViewById(R.id.emoji_tabs);

        final LayoutInflater inf = LayoutInflater.from(this.activity);
        viewPagerTab.setCustomTabView(new SmartTabLayout.TabProvider() {
            @Override
            public View createTabView(ViewGroup container, int position, PagerAdapter adapter) {
                ImageView icon = (ImageView) inf.inflate(R.layout.rsc_emoji_tab_icon_view, container, false);
                switch (position) {
                    case 0:
                        EmojiKeyboard.this.tabIcons[0] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        break;
                    case 1:
                        EmojiKeyboard.this.tabIcons[1] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_people_light_normal);
                        break;
                    case 2:
                        EmojiKeyboard.this.tabIcons[2] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        break;
                    case 3:
                        EmojiKeyboard.this.tabIcons[3] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        break;
                    case 4:
                        EmojiKeyboard.this.tabIcons[4] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_places_light_normal);
                        break;
                    case 5:
                        EmojiKeyboard.this.tabIcons[5] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 6:
                        icon.setImageResource(R.drawable.sym_keyboard_delete_holo_dark);
                        break;
                }
                return icon;
            }
        });

        viewPagerTab.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position) {
                    case 0:
                        // adapter.updateRecentEmojis();
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_activated);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 1:
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_activated);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 2:
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_activated);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 3:
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_activated);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 4:
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_activated);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 5:
                        EmojiKeyboard.this.tabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.tabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.tabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.tabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.tabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.tabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_activated);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        viewPagerTab.setViewPager(viewPager);
    }

    private void setBackspaceBehaviour() {
        this.backspace = (ImageView) activity.findViewById(R.id.backspace);
        this.backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmojiKeyboard.this.input.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
            }
        });
    }

    public RelativeLayout getEmojiKeyboardLayout() {
        return keyboardLayout;
    }

    @Override
    public void onEmojiClicked(Emoji emojicon) {
        int start = this.input.getSelectionStart();
        int end = this.input.getSelectionEnd();

        if (start < 0) {
            this.input.append(emojicon.getEmoji());
        } else {
            this.input.getText().replace(Math.min(start, end), Math.max(start, end), emojicon.getEmoji(), 0, emojicon.getEmoji().length());
        }
    }
}
