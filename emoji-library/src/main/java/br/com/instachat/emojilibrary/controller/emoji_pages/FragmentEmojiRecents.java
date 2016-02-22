package br.com.instachat.emojilibrary.controller.emoji_pages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.controller.FragmentEmoji;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmojiRecents extends FragmentEmoji {

    public static final String TAG = "FragmentEmojiRecents";

    private View mRootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_recents, container, false);
        return this.mRootView;
    }
}
