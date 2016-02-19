package br.com.instachat.emojilibrary.controller;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
 import android.content.Context;
        import android.content.res.TypedArray;
        import android.text.SpannableStringBuilder;
        import android.text.TextUtils;
        import android.text.style.DynamicDrawableSpan;
        import android.util.AttributeSet;
        import android.widget.TextView;


 import br.com.instachat.emojilibrary.R;
 import br.com.instachat.emojilibrary.adapter.EmojiHandler;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com).
 */
public class EmojiTextView extends TextView {
    private int mEmojiSize;
    private int mEmojiAlignment;
    private int mEmojiTextSize;
    private int mTextStart = 0;
    private int mTextLength = -1;
    private boolean mUseSystemDefault = false;

    public EmojiTextView(Context context) {
        super(context);
        init(null);
    }

    public EmojiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public EmojiTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        mEmojiTextSize = (int) getTextSize();
        if (attrs == null) {
            mEmojiSize = (int) getTextSize();
        } else {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Emoji);
            mEmojiSize = (int) a.getDimension(R.styleable.Emoji_emojiSize, getTextSize());
            mEmojiAlignment = a.getInt(R.styleable.Emoji_emojiAlignment, DynamicDrawableSpan.ALIGN_BASELINE);
            mTextStart = a.getInteger(R.styleable.Emoji_emojiTextStart, 0);
            mTextLength = a.getInteger(R.styleable.Emoji_emojiTextLength, -1);
            mUseSystemDefault = a.getBoolean(R.styleable.Emoji_emojiUseSystemDefault, false);
            a.recycle();
        }
        setText(getText());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (!TextUtils.isEmpty(text)) {
            SpannableStringBuilder builder = new SpannableStringBuilder(text);
            EmojiHandler.addEmojis(getContext(), builder, mEmojiSize, mEmojiAlignment, mEmojiTextSize, mTextStart, mTextLength, mUseSystemDefault);
            text = builder;
        }
        super.setText(text, type);
    }

    /**
     * Set the size of emojicon in pixels.
     */
    public void setEmojiconSize(int pixels) {
        mEmojiSize = pixels;
        super.setText(getText());
    }

    /**
     * Set whether to use system default emojicon
     */
    public void setUseSystemDefault(boolean useSystemDefault) {
        mUseSystemDefault = useSystemDefault;
    }
}
