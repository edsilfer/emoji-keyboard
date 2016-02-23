package br.com.instachat.emojilibrary.model.layout;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by edgar on 18/02/2016.
 */
public class EmojiCompatActivity extends AppCompatActivity {

    private OnBackPressed mOnBackPressed;

    @Override
    public void onBackPressed() {
        if (this.mOnBackPressed != null) {
            if (!this.mOnBackPressed.onBackPressed()) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void setOnBackPressed(OnBackPressed backListener) {
        this.mOnBackPressed = backListener;
    }

    public interface OnBackPressed {
        Boolean onBackPressed();
    }
}
