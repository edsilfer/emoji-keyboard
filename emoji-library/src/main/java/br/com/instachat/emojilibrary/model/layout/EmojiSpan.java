package br.com.instachat.emojilibrary.model.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

import java.lang.ref.WeakReference;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
public class EmojiSpan extends DynamicDrawableSpan {

    public static final String TAG = "EmojiSpan";

    private final Context mContext;
    private final int mResourceId;
    private final int mSize;
    private final int mTextSize;
    private int mHeight;
    private int mWidth;
    private int mTop;
    private Drawable mDrawable;
    private WeakReference<Drawable> mDrawableRef;

    public EmojiSpan(Context context, int resourceId, int size, int alignment, int textSize) {
        super(alignment);
        this.mContext = context;
        this.mResourceId = resourceId;
        this.mWidth = mHeight = mSize = size;
        this.mTextSize = textSize;
    }

    public Drawable getDrawable() {
        if (this.mDrawable == null) {
            try {
                this.mDrawable = this.mContext.getResources().getDrawable(this.mResourceId);
                this.mHeight = this.mSize;
                this.mWidth = this.mHeight * this.mDrawable.getIntrinsicWidth() / this.mDrawable.getIntrinsicHeight();
                this.mTop = (this.mTextSize - this.mHeight) / 2;
                this.mDrawable.setBounds(0, this.mTop, this.mWidth, this.mTop + this.mHeight);
            } catch (Exception e) {
            }
        }
        return this.mDrawable;
    }

    @Override
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Drawable b = getCachedDrawable();
        canvas.save();

        int transY = bottom - b.getBounds().bottom;

        if (this.mVerticalAlignment == ALIGN_BASELINE) {
            transY = top + ((bottom - top) / 2) - ((b.getBounds().bottom - b.getBounds().top) / 2) - this.mTop;
        }

        canvas.translate(x, transY);
        b.draw(canvas);
        canvas.restore();
    }

    private Drawable getCachedDrawable() {
        if (this.mDrawableRef == null || this.mDrawableRef.get() == null) {
            this.mDrawableRef = new WeakReference<>(getDrawable());
        }
        return this.mDrawableRef.get();
    }
}