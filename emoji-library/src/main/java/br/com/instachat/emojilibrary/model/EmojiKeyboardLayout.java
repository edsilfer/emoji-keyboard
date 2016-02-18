package br.com.instachat.emojilibrary.model;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.controller.SoftKeyboardListener;

/**
 * Created by edgar on 18/02/2016.
 */
public class EmojiKeyboardLayout extends LinearLayout {

    private static final String TAG = "EmojiKeyboardLayout";

    private SoftKeyboardListener mListener;

    // CONSTRUCTORS
    public EmojiKeyboardLayout(Context context) {
        super(context);
        init(context);
    }

    public EmojiKeyboardLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public EmojiKeyboardLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmojiKeyboardLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int proposedheight = MeasureSpec.getSize(heightMeasureSpec);
        final int actualHeight = getHeight();

        if (this.mListener != null) {
            if (actualHeight > proposedheight) {
                this.mListener.onKeyboardUp();
            } else {
                this.mListener.onKeyboardDown();
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    // INITIALIZATIONS
    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.rsc_bottom_panel, this, true);
    }

    // GETTERS AND SETTERS
    public void setmListener(SoftKeyboardListener mListener) {
        this.mListener = mListener;
    }
}
