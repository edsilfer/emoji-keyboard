package br.com.instachat.emojilibrary.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.instachat.emojilibrary.R;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmojiPlaces extends Fragment {

    public static final String TAG = "FragmentEmojiPlaces";

    private View mRootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_places, container, false);
        return this.mRootView;
    }
}
