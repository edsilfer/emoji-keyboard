package br.com.instachat.emojilibrary.controller.emoji_pages;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.adapter.EmojiAdapter;
import br.com.instachat.emojilibrary.controller.FragmentEmoji;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.util.Constants;
import br.com.instachat.emojilibrary.util.SharedPreferencesManager;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmojiRecents extends FragmentEmoji implements FragmentEmoji.RecentListener {

    public static final String TAG = "FragmentEmojiRecents";

    private View mRootView;
    private GridView mGridView;
    private List<Emoji> mData;
    private EmojiAdapter mAdapter;
    private boolean mUseSystemDefault = false;
    private SharedPreferencesManager mSharedPreferencesManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_recents, container, false);
        mSharedPreferencesManager = new SharedPreferencesManager(getActivity());
        return this.mRootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        this.mGridView = (GridView) view.findViewById(R.id.Emoji_GridView);
        Bundle bundle = getArguments();

        if (bundle == null) {
            this.mData = mSharedPreferencesManager.popRecents();
            this.mUseSystemDefault = false;
        } else {
            Parcelable[] parcels = bundle.getParcelableArray(Constants.EMOJI_KEY);

            this.mData = new ArrayList<>();

            for (int i = 0; i < parcels.length; i++) {
                this.mData.add((Emoji) parcels[i]);
            }

            this.mUseSystemDefault = bundle.getBoolean(Constants.USE_SYSTEM_DEFAULT_KEY);
        }
        mAdapter = new EmojiAdapter(view.getContext(), this.mData, this.mUseSystemDefault);
        this.mGridView.setAdapter(mAdapter);
        this.mGridView.setOnItemClickListener(this);
    }

    @Override
    public void notifyEmojiAdded() {
        new AsyncTask<Void, Void, List<Emoji>>() {
            @Override
            protected void onPostExecute(List<Emoji> emojis) {
                FragmentEmojiRecents.this.mGridView.setAdapter(new EmojiAdapter(FragmentEmojiRecents.this.mRootView.getContext(), emojis, FragmentEmojiRecents.this.mUseSystemDefault));
            }

            @Override
            protected List<Emoji> doInBackground(Void... params) {
                return mSharedPreferencesManager.popRecents();
            }
        }.execute();
    }

    public void updateRecentEmojis () {
        this.mData = mSharedPreferencesManager.popRecents();
        this.mGridView.setAdapter(new EmojiAdapter(mRootView.getContext(), this.mData, this.mUseSystemDefault));
        this.mGridView.setOnItemClickListener(this);
    }
}
