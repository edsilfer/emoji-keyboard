package br.com.instachat.emojikeyboard.Controller;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojikeyboard.adapter.EmojiTabAdapter;

/**
 * Created by edgar on 17/02/2016.
 */
public class AcitivityHomepage extends AppCompatActivity {

    private Toolbar mBottomPanel;
    private EditText mInput;
    private ImageView[] mTabIcons = new ImageView[6];
    private LinearLayout mEmojiKeyboard;
    private Boolean isKeyboardVisible = Boolean.FALSE;

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_homepage);
        this.getWindow().setBackgroundDrawable(this.getResources().getDrawable(R.drawable.background));

        this.initToolbar();
        this.initBottomPanel();
        this.initEmojiKeyboardViewPager();
    }

    // INITIALIZATIONS
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("Emoji Keyboard Sample");
    }

    private void initBottomPanel() {
        this.mBottomPanel = (Toolbar) this.findViewById(R.id.panel);
        this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        this.mBottomPanel.setTitleTextColor(0xFFFFFFFF);

        this.mInput = (EditText) this.mBottomPanel.findViewById(R.id.input);
        this.mEmojiKeyboard = (LinearLayout) this.findViewById(R.id.emoji_keyboard);

        this.mBottomPanel.inflateMenu(R.menu.rsc_bottom_panel_menu);
        this.mBottomPanel.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AcitivityHomepage.this.isKeyboardVisible) {
                    AcitivityHomepage.this.isKeyboardVisible = Boolean.FALSE;
                    AcitivityHomepage.this.mEmojiKeyboard.setVisibility(LinearLayout.GONE);
                } else {
                    AcitivityHomepage.this.isKeyboardVisible = Boolean.TRUE;
                    AcitivityHomepage.this.mEmojiKeyboard.setVisibility(LinearLayout.VISIBLE);
                }
            }
        });

        this.mBottomPanel.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_attach:
                        break;
                    case R.id.action_mic:
                        break;
                }
                return Boolean.TRUE;
            }
        });

    }

    private void initEmojiKeyboardViewPager() {
        EmojiTabAdapter adapter = new EmojiTabAdapter(this.getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) this.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        final SmartTabLayout viewPagerTab = (SmartTabLayout) this.findViewById(R.id.tabs);

        final LayoutInflater inf = LayoutInflater.from(this);
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

}
