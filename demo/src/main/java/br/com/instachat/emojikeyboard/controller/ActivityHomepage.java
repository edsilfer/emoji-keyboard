package br.com.instachat.emojikeyboard.controller;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojilibrary.controller.TelegramPanel;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.model.OnEmojiconClickedListener;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;


/**
 * Created by edgar on 17/02/2016.
 */
public class ActivityHomepage extends EmojiCompatActivity implements OnEmojiconClickedListener {

    private TelegramPanel mPanel;

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
        this.mPanel = new TelegramPanel(this);
    }

    @Override
    public void onEmojiconClicked(Emoji emojicon) {
        int start = this.mPanel.getInput().getSelectionStart();
        int end = this.mPanel.getInput().getSelectionEnd();

        if (start < 0) {
            this.mPanel.getInput().append(emojicon.getEmoji());
        } else {
            this.mPanel.getInput().getText().replace(Math.min(start, end), Math.max(start, end), emojicon.getEmoji(), 0, emojicon.getEmoji().length());
        }
    }
}
