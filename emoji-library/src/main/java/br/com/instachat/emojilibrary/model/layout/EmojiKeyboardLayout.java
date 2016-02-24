package br.com.instachat.emojilibrary.model.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.controller.EmojiKeyboard;

/**
 * Created by edgar on 23/02/2016.
 */
public class EmojiKeyboardLayout extends LinearLayout {
    public EmojiKeyboardLayout(Context context) {
        super(context);
        this.init(context, null);
    }

    public EmojiKeyboardLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
    }

    public EmojiKeyboardLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmojiKeyboardLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.init(context, attrs);
    }

    // INITIALIZATIONS
    private void init(Context context, AttributeSet attrs) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.rsc_emoji_keyboard, this, true);
        this.findViewById(R.id.emoji_keyboard).setVisibility(RelativeLayout.VISIBLE);
        LinearLayout curtain = (LinearLayout) this.findViewById(R.id.curtain);
        curtain.setVisibility(LinearLayout.INVISIBLE);
    }

    public void prepareKeyboard (EmojiCompatActivity activity, EmojiEditText input) {
        new EmojiKeyboard(activity, input);
    }
}
