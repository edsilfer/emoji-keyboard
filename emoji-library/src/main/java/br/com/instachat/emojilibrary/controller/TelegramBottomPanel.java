package br.com.instachat.emojilibrary.controller;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.adapter.EmojiTabAdapter;
import br.com.instachat.emojilibrary.model.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.EmojiEditText;

/**
 * Created by edgar on 18/02/2016.
 */
public class TelegramBottomPanel {

    private static final String TAG = "TelegramBottomPanel";

    private EmojiCompatActivity mActivity;

    private Toolbar mBottomPanel;
    private EmojiEditText mInput;
    private ImageView[] mTabIcons = new ImageView[6];
    private LinearLayout mEmojiKeyboard;

    private Boolean isEmojiKeyboardVisible = Boolean.FALSE;

    // CONSTRUCTOR
    public TelegramBottomPanel(EmojiCompatActivity activity) {
        this.mActivity = activity;

        this.initBottomPanel();
        this.initEmojiKeyboardViewPager();
        this.setInputConfig();
        this.setOnBackPressed();
    }

    // INITIALIZATION
    private void initBottomPanel() {
        this.mBottomPanel = (Toolbar) this.mActivity.findViewById(R.id.panel);
        this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        this.mBottomPanel.setTitleTextColor(0xFFFFFFFF);

        this.mEmojiKeyboard = (LinearLayout) this.mActivity.findViewById(R.id.emoji_keyboard);
        this.mBottomPanel.inflateMenu(R.menu.rsc_bottom_panel_menu);

        this.mBottomPanel.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TelegramBottomPanel.this.isEmojiKeyboardVisible) {
                    if (TelegramBottomPanel.this.mInput.isSoftKeyboardVisible()) {
                        TelegramBottomPanel.this.mBottomPanel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp);
                        TelegramBottomPanel.this.mInput.hideSoftKeyboard();
                    } else {
                        TelegramBottomPanel.this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
                        TelegramBottomPanel.this.mInput.showSoftKeyboard();
                    }
                } else {
                    TelegramBottomPanel.this.mBottomPanel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp);
                    TelegramBottomPanel.this.showEmojiKeyboard(0);
                }
            }
        });

        this.mBottomPanel.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int i = item.getItemId();

                if (i == R.id.action_attach) {

                } else if (i == R.id.action_mic) {

                }
                return Boolean.TRUE;
            }
        });

    }

    private void showEmojiKeyboard(int delay) {
        if (delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        TelegramBottomPanel.this.isEmojiKeyboardVisible = Boolean.TRUE;
        TelegramBottomPanel.this.mEmojiKeyboard.setVisibility(LinearLayout.VISIBLE);
    }

    private void hideEmojiKeyboard() {
        TelegramBottomPanel.this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        TelegramBottomPanel.this.isEmojiKeyboardVisible = Boolean.FALSE;
        TelegramBottomPanel.this.mEmojiKeyboard.setVisibility(LinearLayout.GONE);
    }

    private void initEmojiKeyboardViewPager() {
        EmojiTabAdapter adapter = new EmojiTabAdapter(this.mActivity.getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) this.mActivity.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        final SmartTabLayout viewPagerTab = (SmartTabLayout) this.mActivity.findViewById(R.id.tabs);

        final LayoutInflater inf = LayoutInflater.from(this.mActivity);
        viewPagerTab.setCustomTabView(new SmartTabLayout.TabProvider() {
            @Override
            public View createTabView(ViewGroup container, int position, PagerAdapter adapter) {
                ImageView icon = (ImageView) inf.inflate(R.layout.rsc_emoji_tab_icon_view, container, false);
                switch (position) {
                    case 0:
                        mTabIcons[0] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        break;
                    case 1:
                        mTabIcons[1] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_people_light_normal);
                        break;
                    case 2:
                        mTabIcons[2] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        break;
                    case 3:
                        mTabIcons[3] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        break;
                    case 4:
                        mTabIcons[4] = icon;
                        icon.setImageResource(R.drawable.ic_emoji_places_light_normal);
                        break;
                    case 5:
                        mTabIcons[5] = icon;
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
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_activated);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 1:
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_activated);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 2:
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_activated);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 3:
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_activated);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 4:
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_activated);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_normal);
                        break;
                    case 5:
                        mTabIcons[0].setImageResource(R.drawable.ic_emoji_recent_light_normal);
                        mTabIcons[1].setImageResource(R.drawable.ic_emoji_people_light_normal);
                        mTabIcons[2].setImageResource(R.drawable.ic_emoji_nature_light_normal);
                        mTabIcons[3].setImageResource(R.drawable.ic_emoji_objects_light_normal);
                        mTabIcons[4].setImageResource(R.drawable.ic_emoji_places_light_normal);
                        mTabIcons[5].setImageResource(R.drawable.ic_emoji_symbols_light_activated);
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

    private void setInputConfig() {
        this.mInput = (EmojiEditText) this.mBottomPanel.findViewById(R.id.input);
        this.mInput.addOnSoftKeyboardListener(new EmojiEditText.OnSoftKeyboardListener() {
            @Override
            public void onSoftKeyboardDisplay() {
                if (!TelegramBottomPanel.this.isEmojiKeyboardVisible) {
                    TelegramBottomPanel.this.showEmojiKeyboard(0);
                }
            }

            @Override
            public void onSoftKeyboardHidden() {
                if (TelegramBottomPanel.this.isEmojiKeyboardVisible) {
                    TelegramBottomPanel.this.hideEmojiKeyboard();
                }
            }
        });
    }

    private void setOnBackPressed() {
        this.mActivity.setOnBackPressed(new EmojiCompatActivity.OnBackPressed() {
            @Override
            public void onBackPressed() {
                if (TelegramBottomPanel.this.isEmojiKeyboardVisible) {
                    TelegramBottomPanel.this.hideEmojiKeyboard();
                } else {
                    TelegramBottomPanel.this.mActivity.onBackPressed();
                }
            }
        });
    }
}
