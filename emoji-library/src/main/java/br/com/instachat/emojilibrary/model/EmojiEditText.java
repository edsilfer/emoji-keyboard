package br.com.instachat.emojilibrary.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class EmojiEditText extends EditText {

    private Context context;
    private DismissSoftKeyboard mOnDismissSoftKeyboard;

    public EmojiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            InputMethodManager mgr = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            mgr.hideSoftInputFromWindow(this.getWindowToken(), 0);
            if (this.mOnDismissSoftKeyboard != null) {
                this.mOnDismissSoftKeyboard.onSoftKeyboardDismissed();
            }
        }
        return true;
    }

    public void setOnDismissSoftKeyboard(DismissSoftKeyboard mOnDismissSoftKeyboard) {
        this.mOnDismissSoftKeyboard = mOnDismissSoftKeyboard;
    }

    public interface DismissSoftKeyboard {
        public void onSoftKeyboardDismissed();
    }
}
