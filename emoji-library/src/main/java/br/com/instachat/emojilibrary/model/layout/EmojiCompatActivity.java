package br.com.instachat.emojilibrary.model.layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by edgar on 18/02/2016.
 */
public class EmojiCompatActivity extends AppCompatActivity {

    private OnBackPressedListener mOnBackPressedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        if (this.mOnBackPressedListener != null) {
            if (!this.mOnBackPressedListener.onBackPressed()) {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
    }

    public void setOnBackPressed(OnBackPressedListener backListener) {
        this.mOnBackPressedListener = backListener;
    }

    public interface OnBackPressedListener {
        Boolean onBackPressed();
    }
}
