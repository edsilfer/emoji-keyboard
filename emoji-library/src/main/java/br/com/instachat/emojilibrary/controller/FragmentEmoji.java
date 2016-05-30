package br.com.instachat.emojilibrary.controller;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.model.OnEmojiClickListener;
import br.com.instachat.emojilibrary.util.SharedPreferencesManager;
import br.com.instachat.emojilibrary.util.TimestampUtil;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmoji extends Fragment implements AdapterView.OnItemClickListener {

    public static final String TAG = "FragmentEmoji";

    private RecentListener mRecentListener;
    private OnEmojiClickListener mOnEmojiconClickedListener;
    private View mRootView;
    private SharedPreferencesManager mSharedPreferencesManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_people, container, false);
        return this.mRootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (this.mOnEmojiconClickedListener != null) {
            final Emoji clickedEmoji = (Emoji) parent.getItemAtPosition(position);
            this.mOnEmojiconClickedListener.onEmojiClicked(clickedEmoji);
            clickedEmoji.setTimestamp(TimestampUtil.getCurrentTimestamp());

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    mSharedPreferencesManager.pushEmoji(clickedEmoji);
                }
            };
            new Thread(r).start();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mSharedPreferencesManager = new SharedPreferencesManager(getActivity());
    }

    public void addEmojiconClickListener(OnEmojiClickListener listener) {
        this.mOnEmojiconClickedListener = listener;
    }

    public void subscribeRecentListener(RecentListener listener) {
        this.mRecentListener = listener;
    }

    public interface RecentListener {
        public void notifyEmojiAdded();
    }
}
