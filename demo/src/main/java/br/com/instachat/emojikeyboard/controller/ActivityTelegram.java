package br.com.instachat.emojikeyboard.controller;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojikeyboard.adapter.MessageAdapter;
import br.com.instachat.emojikeyboard.model.Message;
import br.com.instachat.emojikeyboard.model.MessageType;
import br.com.instachat.emojikeyboard.util.TimestampUtil;
import br.com.instachat.emojilibrary.controller.TelegramPanel;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.layout.TelegramPanelEventListener;
import br.com.instachat.emojilibrary.util.App;


/**
 * Created by edgar on 17/02/2016.
 */
public class ActivityTelegram extends EmojiCompatActivity implements TelegramPanelEventListener {

    public static final String TAG = "ActivityTelegram";

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;

    private TelegramPanel mBottomPanel;
    private RecyclerView mMessages;
    private MessageAdapter mAdapter;

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_telegram);
        this.initToolbar();
        this.initDrawerMenu();
        this.setTelegramTheme();
        this.initMessageList();
        this.mBottomPanel = new TelegramPanel(this, this);
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
                Intent intent = new Intent(ActivityTelegram.this, ActivityWhatsApp.class);
                ActivityTelegram.this.startActivity(intent);
                ActivityTelegram.this.finish();
                break;
            case android.R.id.home:
                if (this.mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    this.mDrawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    this.mDrawerLayout.openDrawer(GravityCompat.START);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // INITIALIZATIONS
    private void initDrawerMenu() {
        this.mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.findViewById(R.id.github_thumbnail);

        CircularImageView thumbnail = (CircularImageView) this.findViewById(R.id.github_thumbnail);

        Picasso.with(App.context())
                .load(R.drawable.github)
                .resize(60, 60)
                .centerCrop()
                .into(thumbnail);

        thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/instachat/emoji-library"));
                startActivity(browserIntent);
            }
        });

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                this.mDrawerLayout,
                ActivityTelegram.this.mToolbar,
                R.string.drawer_open,
                R.string.drawer_close
        )

        {
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                invalidateOptionsMenu();
                syncState();
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
                syncState();
            }
        };

        this.mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    private void initMessageList() {
        this.mMessages = (RecyclerView) this.findViewById(R.id.messages);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(Boolean.TRUE);
        this.mMessages.setLayoutManager(linearLayoutManager);
        this.mAdapter = new MessageAdapter(new ArrayList<Message>());
        this.mMessages.setAdapter(mAdapter);
    }

    private void initToolbar() {
        this.mToolbar = (Toolbar) this.findViewById(R.id.toolbar);
        this.mToolbar.setTitleTextColor(0xFFFFFFFF);
        this.mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
        this.getWindow().setBackgroundDrawable(this.getResources().getDrawable(R.drawable.telegram_bkg));
        this.setSupportActionBar(this.mToolbar);
        this.getSupportActionBar().setTitle("Telegram");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
    }

    private void setTelegramTheme() {
        ActivityTelegram.this.mToolbar.setTitle("Telegram");
        ActivityTelegram.this.getWindow().setBackgroundDrawable(ActivityTelegram.this.getResources().getDrawable(R.drawable.telegram_bkg));
        this.mToolbar.setBackgroundColor(this.getResources().getColor(R.color.colorPrimaryTelegram));
        if (Build.VERSION.SDK_INT >= 21) {
            this.getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryTelegram));
        }
    }

    // TELEGRAM PANEL INTERFACE
    @Override
    public void onAttachClicked() {
        Toast.makeText(ActivityTelegram.this, "Attach was clicked!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onMicClicked() {
        Log.i(TAG, "Mic was clicked");
        Toast.makeText(ActivityTelegram.this, "Mic was clicked!", Toast.LENGTH_SHORT).show();
    }

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
                ActivityTelegram.this.updateMessageList(message);
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
