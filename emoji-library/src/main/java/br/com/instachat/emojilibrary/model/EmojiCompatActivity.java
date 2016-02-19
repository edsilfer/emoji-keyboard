package br.com.instachat.emojilibrary.model;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by edgar on 18/02/2016.
 */
public class EmojiCompatActivity extends AppCompatActivity {

    private OnBackPressed mOnBackPressed;

    @Override
    public void onBackPressed() {
        if (this.mOnBackPressed != null) {
            this.mOnBackPressed.onBackPressed();
        }
    }

    public void setOnBackPressed(OnBackPressed backListener) {
        this.mOnBackPressed = backListener;
    }

    public interface OnBackPressed {
        public void onBackPressed();
    }
}
