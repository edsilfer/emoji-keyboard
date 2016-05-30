package br.com.instachat.emojilibrary.model.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.style.DynamicDrawableSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.util.EmojiUtil;
import br.com.instachat.emojilibrary.util.SoftKeyboardUtil;

public class EmojiEditText extends EditText {

    public static final String TAG = "EmojiEditText";

    private Context mContext;
    private OnSoftKeyboardListener mOnSoftKeyboardListener;
    private Boolean isSoftKeyboardVisible = Boolean.FALSE;

    private int mEmojiconSize;
    private int mEmojiconAlignment;
    private int mEmojiconTextSize;
    private boolean mUseSystemDefault = Boolean.FALSE;

    // CONSTRUCTORS
    public EmojiEditText(Context context) {
        super(context);
        this.init(context, null);
    }

    public EmojiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
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

    // INITIALIZATIONS
    private void init(Context context, AttributeSet attrs) {
        this.mContext = context;
        this.initFocusListener();
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Emoji);
        this.mEmojiconSize = (int) a.getDimension(R.styleable.Emoji_emojiSize, getTextSize());
        this.mEmojiconAlignment = a.getInt(R.styleable.Emoji_emojiAlignment, DynamicDrawableSpan.ALIGN_BASELINE);
        this.mUseSystemDefault = a.getBoolean(R.styleable.Emoji_emojiUseSystemDefault, false);
        a.recycle();
        this.mEmojiconTextSize = (int) getTextSize();
        setText(getText());
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

    // CALLBACKS
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

    @Override
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        this.updateText();
    }

    // EMOJI HANDLER
    private void updateText() {
        EmojiUtil.addEmojis(
                this.getContext(),
                this.getText(),
                this.mEmojiconSize,
                this.mEmojiconAlignment,
                this.mEmojiconTextSize,
                this.mUseSystemDefault
        );
    }

    // SOFT KEYBOARD LISTENER
    public void showSoftKeyboard() {
        this.isSoftKeyboardVisible = Boolean.TRUE;
        SoftKeyboardUtil.showSoftKeyboard(this.mContext, this);
    }

    public void hideSoftKeyboard() {
        this.isSoftKeyboardVisible = Boolean.FALSE;
        this.clearFocus();
        SoftKeyboardUtil.dismissSoftKeyboard(this.mContext, this);
    }

    public interface OnSoftKeyboardListener {
        public void onSoftKeyboardDisplay();

        public void onSoftKeyboardHidden();
    }

    // GETTERS AND SETTERS
    public Boolean isSoftKeyboardVisible() {
        return isSoftKeyboardVisible;
    }

    public void addOnSoftKeyboardListener(OnSoftKeyboardListener mOnSoftKeyboardListener) {
        this.mOnSoftKeyboardListener = mOnSoftKeyboardListener;
    }

    public void setEmojiSize(int pixels) {
        this.mEmojiconSize = pixels;
        this.updateText();
    }

    public void setUseSystemDefault(boolean useSystemDefault) {
        this.mUseSystemDefault = useSystemDefault;
    }
}
