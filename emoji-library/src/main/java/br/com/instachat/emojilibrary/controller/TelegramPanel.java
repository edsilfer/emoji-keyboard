package br.com.instachat.emojilibrary.controller;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;
import br.com.instachat.emojilibrary.model.layout.EmojiEditText;
import br.com.instachat.emojilibrary.model.layout.TelegramPanelEventListener;

/**
 * Created by edgar on 18/02/2016.
 */
public class TelegramPanel {

    private static final String TAG = "TelegramPanel";

    private EmojiCompatActivity mActivity;
    private Toolbar mBottomPanel;
    private EmojiEditText mInput;
    private EmojiKeyboard mEmojiKeyboard;
    private TelegramPanelEventListener mListener;
    private LinearLayout mCurtain;
    private Boolean mToogleIcon = Boolean.TRUE;

    private Boolean isEmojiKeyboardVisible = Boolean.FALSE;

    // CONSTRUCTOR
    public TelegramPanel(EmojiCompatActivity activity, TelegramPanelEventListener listener) {
        this.mActivity = activity;
        this.initBottomPanel();
        this.setInputConfig();
        this.setOnBackPressed();
        this.mEmojiKeyboard = new EmojiKeyboard(this.mActivity, this.mInput);
        this.mListener = listener;
    }

    // INITIALIZATION
    private void initBottomPanel() {
        this.mBottomPanel = (Toolbar) this.mActivity.findViewById(R.id.panel);
        this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        this.mBottomPanel.setTitleTextColor(0xFFFFFFFF);
        this.mBottomPanel.inflateMenu(R.menu.telegram_menu);

        this.mBottomPanel.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TelegramPanel.this.isEmojiKeyboardVisible) {
                    TelegramPanel.this.closeCurtain();
                    if (TelegramPanel.this.mInput.isSoftKeyboardVisible()) {
                        TelegramPanel.this.mBottomPanel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp);
                        TelegramPanel.this.mInput.hideSoftKeyboard();
                    } else {
                        TelegramPanel.this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
                        TelegramPanel.this.mInput.showSoftKeyboard();
                    }
                } else {
                    TelegramPanel.this.mBottomPanel.setNavigationIcon(R.drawable.ic_keyboard_grey600_24dp);
                    TelegramPanel.this.closeCurtain();
                    TelegramPanel.this.showEmojiKeyboard(0);
                }
            }
        });

        this.mBottomPanel.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (TelegramPanel.this.mListener != null) {
                    if (item.getItemId() == R.id.action_attach) {
                        TelegramPanel.this.mListener.onAttachClicked();
                    } else if (item.getItemId() == R.id.action_mic) {
                        if (TelegramPanel.this.mInput.getText().toString().equals("")) {
                            TelegramPanel.this.mListener.onMicClicked();
                        } else {
                            TelegramPanel.this.mListener.onSendClicked();
                        }
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });

        this.mCurtain = (LinearLayout) this.mActivity.findViewById(R.id.curtain);
    }

    private void setInputConfig() {
        this.mInput = (EmojiEditText) this.mBottomPanel.findViewById(R.id.input);
        mInput.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        this.mInput.addOnSoftKeyboardListener(new EmojiEditText.OnSoftKeyboardListener() {
            @Override
            public void onSoftKeyboardDisplay() {
                if (!TelegramPanel.this.isEmojiKeyboardVisible) {
                    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                    scheduler.schedule(new Runnable() {
                        @Override
                        public void run() {
                            Handler mainHandler = new Handler(TelegramPanel.this.mActivity.getMainLooper());
                            Runnable myRunnable = new Runnable() {
                                @Override
                                public void run() {
                                    TelegramPanel.this.openCurtain();
                                    TelegramPanel.this.showEmojiKeyboard(0);
                                }
                            };
                            mainHandler.post(myRunnable);
                        }
                    }, 150, TimeUnit.MILLISECONDS);
                }
            }

            @Override
            public void onSoftKeyboardHidden() {
                if (TelegramPanel.this.isEmojiKeyboardVisible) {
                    TelegramPanel.this.closeCurtain();
                    TelegramPanel.this.hideEmojiKeyboard(200);
                }
            }
        });

        this.mInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                final MenuItem micButton = TelegramPanel.this.mBottomPanel.getMenu().findItem(R.id.action_mic);
                if (!TelegramPanel.this.mInput.getText().toString().equals("") && TelegramPanel.this.mToogleIcon) {
                    TelegramPanel.this.mToogleIcon = Boolean.FALSE;
                    TelegramPanel.this.mBottomPanel.findViewById(R.id.action_attach).animate().scaleX(0).scaleY(0).setDuration(150).start();
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        TelegramPanel.this.mBottomPanel.findViewById(R.id.action_mic).animate().scaleX(0).scaleY(0).setDuration(75).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                micButton.setIcon(R.drawable.ic_send_telegram);
                                TelegramPanel.this.mBottomPanel.findViewById(R.id.action_mic).animate().scaleX(1).scaleY(1).setDuration(75).start();
                            }
                        }).start();
                    }
                } else if (TelegramPanel.this.mInput.getText().toString().equals("")) {
                    TelegramPanel.this.mToogleIcon = Boolean.TRUE;
                    TelegramPanel.this.mBottomPanel.findViewById(R.id.action_attach).animate().scaleX(1).scaleY(1).setDuration(150).start();
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        TelegramPanel.this.mBottomPanel.findViewById(R.id.action_mic).animate().scaleX(0).scaleY(0).setDuration(75).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                micButton.setIcon(R.drawable.ic_microphone_grey600_24dp);
                                TelegramPanel.this.mBottomPanel.findViewById(R.id.action_mic).animate().scaleX(1).scaleY(1).setDuration(75).start();
                            }
                        }).start();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void setOnBackPressed() {
        this.mActivity.setOnBackPressed(new EmojiCompatActivity.OnBackPressedListener() {
            @Override
            public Boolean onBackPressed() {
                if (TelegramPanel.this.isEmojiKeyboardVisible) {
                    TelegramPanel.this.isEmojiKeyboardVisible = Boolean.FALSE;
                    TelegramPanel.this.hideEmojiKeyboard(0);
                    return Boolean.TRUE;
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
        TelegramPanel.this.isEmojiKeyboardVisible = Boolean.TRUE;
        TelegramPanel.this.mEmojiKeyboard.getEmojiKeyboardLayout().setVisibility(LinearLayout.VISIBLE);
    }

    private void hideEmojiKeyboard(int delay) {
        if (delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        TelegramPanel.this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        TelegramPanel.this.isEmojiKeyboardVisible = Boolean.FALSE;
        TelegramPanel.this.mEmojiKeyboard.getEmojiKeyboardLayout().setVisibility(LinearLayout.GONE);
    }

    private void openCurtain() {
        this.mCurtain.setVisibility(LinearLayout.VISIBLE);
    }

    private void closeCurtain() {
        this.mCurtain.setVisibility(LinearLayout.INVISIBLE);
    }

    //GETTER AND SETTERS
    public void setListener(TelegramPanelEventListener mListener) {
        this.mListener = mListener;
    }

    public String getText() {
        return this.mInput.getText().toString();
    }

    public void setText(String text) {
        this.mInput.setText(text);
    }
}
