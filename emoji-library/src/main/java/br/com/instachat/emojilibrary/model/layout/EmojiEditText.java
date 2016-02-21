package br.com.instachat.emojilibrary.model.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import br.com.instachat.emojilibrary.util.SoftKeyboardUtil;

public class EmojiEditText extends EditText {

    public static final String TAG = "EmojiEditText";

    private Context mContext;
    private OnSoftKeyboardListener mOnSoftKeyboardListener;
    private Boolean isSoftKeyboardVisible = Boolean.FALSE;

    public EmojiEditText(Context context) {
        super(context);
        this.initFocusListener();
    }

    public EmojiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        this.initFocusListener();
    }

    public EmojiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.initFocusListener();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmojiEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.initFocusListener();
    }

    private void initFocusListener() {
        this.setOnFocusChangeListener(new OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    if (EmojiEditText.this.mOnSoftKeyboardListener != null) {
                        EmojiEditText.this.isSoftKeyboardVisible = Boolean.TRUE;
                        EmojiEditText.this.mOnSoftKeyboardListener.onSoftKeyboardDisplay();
                    }
                }
            }
        });
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            InputMethodManager mgr = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
            mgr.hideSoftInputFromWindow(this.getWindowToken(), 0);
            if (this.mOnSoftKeyboardListener != null) {
                this.clearFocus();
                EmojiEditText.this.isSoftKeyboardVisible = Boolean.FALSE;
                this.mOnSoftKeyboardListener.onSoftKeyboardHidden();
            }
        }
        return true;
    }

    public void addOnSoftKeyboardListener(OnSoftKeyboardListener mOnSoftKeyboardListener) {
        this.mOnSoftKeyboardListener = mOnSoftKeyboardListener;
    }

    public Boolean isSoftKeyboardVisible() {
        return isSoftKeyboardVisible;
    }

    public void showSoftKeyboard() {
        this.isSoftKeyboardVisible = Boolean.TRUE;
        SoftKeyboardUtil.showSoftKeyboard(this);
    }

    public void hideSoftKeyboard() {
        this.isSoftKeyboardVisible = Boolean.FALSE;
        this.clearFocus();
        SoftKeyboardUtil.dismissSoftKeyboard(this);
    }

    public interface OnSoftKeyboardListener {
        public void onSoftKeyboardDisplay();

        public void onSoftKeyboardHidden();
    }
}
