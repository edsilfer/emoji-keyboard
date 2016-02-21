package br.com.instachat.emojikeyboard.controller;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojikeyboard.adapter.TabAdapter;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;


/**
 * Created by edgar on 17/02/2016.
 */
public class ActivityHomepage extends EmojiCompatActivity {

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_homepage);
        this.initToolbar();
        this.initViewPager();
    }

    // INITIALIZATIONS
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        this.setWindowBackground(this.getResources().getDrawable(R.drawable.telegram_bkg));
        this.setSupportActionBar(toolbar);
        this.setToolbarText("Telegram");
    }

    private void initViewPager() {
        TabAdapter adapter = new TabAdapter(this.getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) this.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        final SmartTabLayout viewPagerTab = (SmartTabLayout) this.findViewById(R.id.tabs);
        viewPagerTab.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position) {
                    case 0:
                        ActivityHomepage.this.setToolbarText("Telegram");
                        ActivityHomepage.this.setWindowBackground(ActivityHomepage.this.getResources().getDrawable(R.drawable.telegram_bkg));
                        break;
                    case 1:
                        ActivityHomepage.this.setToolbarText("Whats App");
                        ActivityHomepage.this.setWindowBackground(ActivityHomepage.this.getResources().getDrawable(R.drawable.whatsapp_bkg));
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

    // GETTERS AND SETTERS
    public void setToolbarText(String text) {
        this.getSupportActionBar().setTitle(text);
    }

    public void setWindowBackground(Drawable bkg) {
        this.getWindow().setBackgroundDrawable(bkg);
    }

}
