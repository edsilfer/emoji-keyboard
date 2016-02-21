package br.com.instachat.emojikeyboard.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.instachat.emojikeyboard.R;
import br.com.instachat.emojilibrary.controller.TelegramPanel;
import br.com.instachat.emojilibrary.model.layout.EmojiCompatActivity;

/**
 * Created by edgar on 21/02/2016.
 */
public class FragmentTelegram extends Fragment {

    public static final String TAG = "FragmentTelegram";

    private View mRootView;
    private TelegramPanel mBottomPanel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_telegram, container, false);
        return this.mRootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mBottomPanel = new TelegramPanel((EmojiCompatActivity) this.getActivity());
    }
}
