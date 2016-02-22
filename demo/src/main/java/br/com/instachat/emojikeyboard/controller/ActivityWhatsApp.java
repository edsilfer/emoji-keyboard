package br.com.instachat.emojikeyboard.controller;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojikeyboard.adapter.MessageAdapter;
import br.com.instachat.emojikeyboard.model.Message;
import br.com.instachat.emojikeyboard.model.MessageType;
import br.com.instachat.emojikeyboard.util.TimestampUtil;
import br.com.instachat.emojilibrary.controller.WhatsAppPanel;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.layout.WhatsAppPanelEventListener;


/**
 * Created by edgar on 17/02/2016.
 */
public class ActivityWhatsApp extends EmojiCompatActivity implements WhatsAppPanelEventListener {

    public static final String TAG = "ActivityWhatsApp";

    private Toolbar mToolbar;
    private WhatsAppPanel mBottomPanel;
    private RecyclerView mMessages;
    private MessageAdapter mAdapter;

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_whatsapp);
        this.initToolbar();
        this.initMessageList();
        this.setWhatsAppTheme();
        this.mBottomPanel = new WhatsAppPanel(this, this);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_toogle:
                ActivityWhatsApp.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // INITIALIZATIONS
    private void initMessageList() {
        this.mMessages = (RecyclerView) this.findViewById(R.id.messages);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(Boolean.TRUE);
        this.mMessages.setLayoutManager(linearLayoutManager);
        this.mAdapter = new MessageAdapter(new ArrayList<Message>());
        this.mMessages.setAdapter(mAdapter);
    }

    private void setWhatsAppTheme() {
        this.getWindow().setBackgroundDrawable(ActivityWhatsApp.this.getResources().getDrawable(R.drawable.whatsapp_bkg));
        this.mToolbar.setBackgroundColor(this.getResources().getColor(R.color.colorPrimaryWhatsApp));
        if (Build.VERSION.SDK_INT >= 21) {
            this.getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDarkWhatsApp));
        }
    }

    private void initToolbar() {
        this.mToolbar = (Toolbar) this.findViewById(R.id.toolbar);
        this.mToolbar.setTitleTextColor(0xFFFFFFFF);
        this.mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        this.getWindow().setBackgroundDrawable(this.getResources().getDrawable(R.drawable.telegram_bkg));
        this.setSupportActionBar(this.mToolbar);
        this.getSupportActionBar().setTitle("Whats App");
    }

    // WHATS APP TOOLBAR INTERFACE
    @Override
    public void onSendClicked() {
        Message message = new Message();
        message.setType(MessageType.OUTGOING);
        message.setTimestamp(TimestampUtil.getCurrentTimestamp());
        message.setContent(this.mBottomPanel.getText());
        this.mBottomPanel.setText("");
        this.updateMessageList(message);
        this.echoMessage(message);
    }

    private void echoMessage(final Message income) {
        new AsyncTask<Void, Void, Message>() {
            @Override
            protected void onPostExecute(Message message) {
                ActivityWhatsApp.this.updateMessageList(message);
            }

            @Override
            protected Message doInBackground(Void... params) {
                try {
                    Thread.sleep(1200);
                    Message outgoing = new Message();
                    outgoing.setType(MessageType.INCOME);
                    outgoing.setTimestamp(TimestampUtil.getCurrentTimestamp());
                    outgoing.setContent(income.getContent());
                    return outgoing;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();
    }

    private void updateMessageList(Message message) {
        this.mAdapter.getDataset().add(message);
        this.mAdapter.notifyDataSetChanged();
        this.mMessages.scrollToPosition(this.mAdapter.getItemCount() - 1);
    }
}
