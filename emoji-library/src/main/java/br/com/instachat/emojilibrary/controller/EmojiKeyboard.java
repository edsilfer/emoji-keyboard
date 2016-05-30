package br.com.instachat.emojilibrary.controller;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

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
    private static final String TAG = "EmojiKeyboard";

    private EmojiCompatActivity mActivity;

    private ImageView[] mTabIcons = new ImageView[6];
    private RelativeLayout mEmojiKeyboardLayout;
    private EmojiEditText mInput;
    private ImageView mBackspace;

    // CONSTRUCTOR
    public EmojiKeyboard(EmojiCompatActivity activity, EmojiEditText input) {
        this.mInput = input;
        this.mActivity = activity;
        this.mEmojiKeyboardLayout = (RelativeLayout) mActivity.findViewById(R.id.emoji_keyboard);
        this.initEmojiKeyboardViewPager();
        this.setBackspaceBehaviour();
    }

    // INTIALIZATIONS
    private void initEmojiKeyboardViewPager() {
        final EmojiTabAdapter adapter = new EmojiTabAdapter(mActivity.getSupportFragmentManager());
        adapter.setOnEmojiClickListener(this);
        final ViewPager viewPager = (ViewPager) mActivity.findViewById(R.id.emoji_viewpager);
        viewPager.setAdapter(adapter);

        final SmartTabLayout viewPagerTab = (SmartTabLayout) mActivity.findViewById(R.id.emoji_tabs);

        final LayoutInflater inf = LayoutInflater.from(this.mActivity);
        viewPagerTab.setCustomTabView(new SmartTabLayout.TabProvider() {
            @Override
            public View createTabView(ViewGroup container, int position, PagerAdapter adapter) {
                ImageView icon = (ImageView) inf.inflate(R.layout.rsc_emoji_tab_icon_view, container, false);
                switch (position) {
                    case 0:
                        EmojiKeyboard.this.mTabIcons[0] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        break;
                    case 1:
                        EmojiKeyboard.this.mTabIcons[1] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_people_light_normal);
                        break;
                    case 2:
                        EmojiKeyboard.this.mTabIcons[2] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        break;
                    case 3:
                        EmojiKeyboard.this.mTabIcons[3] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        break;
                    case 4:
                        EmojiKeyboard.this.mTabIcons[4] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_places_light_normal);
                        break;
                    case 5:
                        EmojiKeyboard.this.mTabIcons[5] = icon;
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
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_activated);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 1:
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_activated);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 2:
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_activated);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 3:
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_activated);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 4:
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_activated);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 5:
                        EmojiKeyboard.this.mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        EmojiKeyboard.this.mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        EmojiKeyboard.this.mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        EmojiKeyboard.this.mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        EmojiKeyboard.this.mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        EmojiKeyboard.this.mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_activated);
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
        this.mBackspace = (ImageView) mActivity.findViewById(R.id.backspace);
        this.mBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmojiKeyboard.this.mInput.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
            }
        });
    }

    //GETTERS AND SETTERS
    public RelativeLayout getEmojiKeyboardLayout() {
        return mEmojiKeyboardLayout;
    }

    @Override
    public void onEmojiClicked(Emoji emojicon) {
        int start = this.mInput.getSelectionStart();
        int end = this.mInput.getSelectionEnd();

        if (start < 0) {
            this.mInput.append(emojicon.getEmoji());
        } else {
            this.mInput.getText().replace(Math.min(start, end), Math.max(start, end), emojicon.getEmoji(), 0, emojicon.getEmoji().length());
        }
    }
}
