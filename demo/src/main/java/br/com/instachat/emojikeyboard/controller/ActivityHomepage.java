package br.com.instachat.emojikeyboard.controller;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojilibrary.controller.TelegramBottomPanel;
import br.com.instachat.emojilibrary.model.EmojiCompatActivity;


/**
 * Created by edgar on 17/02/2016.
 */
public class ActivityHomepage extends EmojiCompatActivity {

    private TelegramBottomPanel mPanel;

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_homepage);

        this.getWindow().setBackgroundDrawable(this.getResources().getDrawable(R.drawable.background));

        this.initToolbar();
        this.initBottomPanel();
    }

    // INITIALIZATIONS
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("Emoji Keyboard Sample");
    }

    private void initBottomPanel() {
        this.mPanel = new TelegramBottomPanel(this);
    }
}
