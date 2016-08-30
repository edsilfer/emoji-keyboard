package br.com.instachat.emojilibrary.controller;

import android.content.res.ColorStateList;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.layout.EmojiEditText;
import br.com.instachat.emojilibrary.model.layout.WhatsAppPanelEventListener;

/**
 * Created by edgar on 18/02/2016.
 */
public class WhatsAppPanel {

    private static final String TAG = "WhatsAppPanel";

    private EmojiCompatActivity mActivity;
    private EmojiEditText mInput;
    private EmojiKeyboard mEmojiKeyboard;
    private ImageView mEmojiButton;
    private FloatingActionButton mSend;
    private LinearLayout mCurtain;
    private WhatsAppPanelEventListener mListener;
    private int mButtonColor;

    private Boolean isEmojiKeyboardVisible = Boolean.FALSE;

    // CONSTRUCTOR
    public WhatsAppPanel(EmojiCompatActivity activity, WhatsAppPanelEventListener listener, int color) {
        this.mActivity = activity;
        this.mButtonColor = color;
        this.initBottomPanel();
        this.setInputConfig();
        this.setOnBackPressed();
        this.mEmojiKeyboard = new EmojiKeyboard(this.mActivity, this.mInput);
        this.mListener = listener;
    }

    // INITIALIZATION
    private void initBottomPanel() {
        this.mEmojiButton = (ImageView) mActivity.findViewById(R.id.emojiButton);
        mActivity.findViewById(R.id.emojiButtonWrapper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (WhatsAppPanel.this.isEmojiKeyboardVisible) {
                    WhatsAppPanel.this.closeCurtain();
                    if (WhatsAppPanel.this.mInput.isSoftKeyboardVisible()) {
                        WhatsAppPanel.this.mEmojiButton.setImageResource(R.drawable.ic_keyboard_grey600_24dp);
                        WhatsAppPanel.this.mInput.hideSoftKeyboard();
                    } else {
                        WhatsAppPanel.this.mEmojiButton.setImageResource(R.drawable.input_emoji);
                        WhatsAppPanel.this.mInput.showSoftKeyboard();
                    }
                } else {
                    WhatsAppPanel.this.mEmojiButton.setImageResource(R.drawable.ic_keyboard_grey600_24dp);
                    WhatsAppPanel.this.closeCurtain();
                    WhatsAppPanel.this.showEmojiKeyboard(0);
                }
            }
        });
        this.mSend = (FloatingActionButton) mActivity.findViewById(R.id.send);
        this.mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (WhatsAppPanel.this.mListener != null) {
                    WhatsAppPanel.this.mListener.onSendClicked();
                }
            }
        });
        this.mSend.setBackgroundTintList(ColorStateList.valueOf(mActivity.getResources().getColor(mButtonColor)));
        this.mCurtain = (LinearLayout) mActivity.findViewById(R.id.curtain);
    }

    private void setInputConfig() {
        this.mInput = (EmojiEditText) mActivity.findViewById(R.id.input);
        this.mInput.addOnSoftKeyboardListener(new EmojiEditText.OnSoftKeyboardListener() {
            @Override
            public void onSoftKeyboardDisplay() {
                if (!WhatsAppPanel.this.isEmojiKeyboardVisible) {
                    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                    scheduler.schedule(new Runnable() {
                        @Override
                        public void run() {
                            Handler mainHandler = new Handler(WhatsAppPanel.this.mActivity.getMainLooper());
                            Runnable myRunnable = new Runnable() {
                                @Override
                                public void run() {
                                    WhatsAppPanel.this.openCurtain();
                                    WhatsAppPanel.this.showEmojiKeyboard(0);
                                }
                            };
                            mainHandler.post(myRunnable);
                        }
                    }, 150, TimeUnit.MILLISECONDS);
                }
            }

            @Override
            public void onSoftKeyboardHidden() {
                if (WhatsAppPanel.this.isEmojiKeyboardVisible) {
                    WhatsAppPanel.this.closeCurtain();
                    WhatsAppPanel.this.hideEmojiKeyboard(200);
                }
            }
        });
    }

    private void setOnBackPressed() {
        this.mActivity.setOnBackPressed(new EmojiCompatActivity.OnBackPressedListener() {
            @Override
            public Boolean onBackPressed() {
                if (WhatsAppPanel.this.isEmojiKeyboardVisible) {
                    WhatsAppPanel.this.isEmojiKeyboardVisible = Boolean.FALSE;
                    WhatsAppPanel.this.hideEmojiKeyboard(0);
                    return Boolean.TRUE;
                } else {

                }
                return Boolean.FALSE;
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
        WhatsAppPanel.this.isEmojiKeyboardVisible = Boolean.TRUE;
        WhatsAppPanel.this.mEmojiKeyboard.getEmojiKeyboardLayout().setVisibility(LinearLayout.VISIBLE);
    }

    private void hideEmojiKeyboard(int delay) {
        if (delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        WhatsAppPanel.this.mEmojiButton.setImageResource(R.drawable.input_emoji);
        WhatsAppPanel.this.isEmojiKeyboardVisible = Boolean.FALSE;
        WhatsAppPanel.this.mEmojiKeyboard.getEmojiKeyboardLayout().setVisibility(LinearLayout.GONE);
    }

    private void openCurtain() {
        this.mCurtain.setVisibility(LinearLayout.VISIBLE);
    }

    private void closeCurtain() {
        this.mCurtain.setVisibility(LinearLayout.INVISIBLE);
    }

    // GETTERS AND SETTERS
    public String getText() {
        return this.mInput.getText().toString();
    }

    public void setText(String text) {
        this.mInput.setText(text);
    }
}
