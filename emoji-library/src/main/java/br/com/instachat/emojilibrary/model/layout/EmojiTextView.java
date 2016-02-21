package br.com.instachat.emojilibrary.model.layout;

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
import br.com.instachat.emojilibrary.util.EmojiUtil;

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
        this.mEmojiTextSize = (int) this.getTextSize();
        if (attrs == null) {
            this.mEmojiSize = (int) this.getTextSize();
        } else {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Emoji);
            this.mEmojiSize = (int) a.getDimension(R.styleable.Emoji_emojiSize, getTextSize());
            this.mEmojiAlignment = a.getInt(R.styleable.Emoji_emojiAlignment, DynamicDrawableSpan.ALIGN_BASELINE);
            this.mTextStart = a.getInteger(R.styleable.Emoji_emojiTextStart, 0);
            this.mTextLength = a.getInteger(R.styleable.Emoji_emojiTextLength, -1);
            this.mUseSystemDefault = a.getBoolean(R.styleable.Emoji_emojiUseSystemDefault, false);
            a.recycle();
        }
        this.setText(getText());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (!TextUtils.isEmpty(text)) {
            SpannableStringBuilder builder = new SpannableStringBuilder(text);
            EmojiUtil.addEmojis(
                    this.getContext(),
                    builder,
                    this.mEmojiSize,
                    this.mEmojiAlignment,
                    this.mEmojiTextSize,
                    this.mTextStart,
                    mTextLength,
                    false);
            text = builder;
        }
        super.setText(text, type);
    }

    public void setEmojiconSize(Integer pixels) {
        this.mEmojiSize = pixels;
        super.setText(getText());
    }

    public void setUseSystemDefault(Boolean useSystemDefault) {
        this.mUseSystemDefault = useSystemDefault;
    }
}
