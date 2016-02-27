package br.com.instachat.emojilibrary.controller.emoji_pages;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.adapter.EmojiAdapter;
import br.com.instachat.emojilibrary.controller.FragmentEmoji;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.util.Constants;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmojiRecents extends FragmentEmoji implements FragmentEmoji.RecentListener {

    public static final String TAG = "FragmentEmojiRecents";

    private View mRootView;
    private GridView mGridView;
    private Emoji[] mData;
    private boolean mUseSystemDefault = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_recents, container, false);
        return this.mRootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        this.mGridView = (GridView) view.findViewById(R.id.Emoji_GridView);
        Bundle bundle = getArguments();

        if (bundle == null) {
            this.mData = this.getRecentsEmojis();
            this.mUseSystemDefault = false;
        } else {
            Parcelable[] parcels = bundle.getParcelableArray(Constants.EMOJI_KEY);
            this.mData = new Emoji[parcels.length];

            for (int i = 0; i < parcels.length; i++) {
                this.mData[i] = (Emoji) parcels[i];
            }

            this.mUseSystemDefault = bundle.getBoolean(Constants.USE_SYSTEM_DEFAULT_KEY);
        }
        this.mGridView.setAdapter(new EmojiAdapter(view.getContext(), this.mData, this.mUseSystemDefault));
        this.mGridView.setOnItemClickListener(this);
    }

    private Emoji[] getRecentsEmojis() {
        List<Emoji> aux = Emoji.findWithQuery(Emoji.class, "SELECT * FROM Emoji ORDER BY timestamp DESC LIMIT 24");
        Emoji[] result = new Emoji[aux.size()];
        int count = 0;
        for (Emoji curr : aux) {
            result[count] = curr;
            count++;
        }
        return result;
    }

    @Override
    public void notifyEmojiAdded() {
        new AsyncTask<Void, Void, Emoji[]>() {
            @Override
            protected void onPostExecute(Emoji[] emojis) {
                FragmentEmojiRecents.this.mGridView.setAdapter(new EmojiAdapter(FragmentEmojiRecents.this.mRootView.getContext(), emojis, FragmentEmojiRecents.this.mUseSystemDefault));
            }

            @Override
            protected Emoji[] doInBackground(Void... params) {
                return FragmentEmojiRecents.this.getRecentsEmojis();
            }
        }.execute();
    }
}
