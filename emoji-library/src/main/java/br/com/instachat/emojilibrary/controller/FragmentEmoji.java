package br.com.instachat.emojilibrary.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.model.Emoji;
import br.com.instachat.emojilibrary.model.OnEmojiClickListener;
import br.com.instachat.emojilibrary.util.TimestampUtil;

/**
 * Created by edgar on 18/02/2016.
 */
public class FragmentEmoji extends Fragment implements AdapterView.OnItemClickListener {

    public static final String TAG = "FragmentEmoji";

    private OnEmojiClickListener mOnEmojiconClickedListener;
    private View mRootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_emoji_people, container, false);
        return this.mRootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (this.mOnEmojiconClickedListener != null) {
            final Emoji clickedEmoji = (Emoji) parent.getItemAtPosition(position);
            clickedEmoji.setTimestamp(TimestampUtil.getCurrentTimestamp());

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    List<Emoji> aux = Emoji.find(Emoji.class, " emoji = ? ", clickedEmoji.getEmoji());
                    if (aux != null && aux.size() == 1) {
                        aux.get(0).setTimestamp(TimestampUtil.getCurrentTimestamp());
                        Emoji.save(aux.get(0));
                    } else if (aux == null || aux.size() == 0) {
                        Emoji.save(clickedEmoji);
                    }
                }
            };
            new Thread(r).start();

            this.mOnEmojiconClickedListener.onEmojiClicked(clickedEmoji);
        }
    }

    public void addEmojiconClickListener(OnEmojiClickListener listener) {
        this.mOnEmojiconClickedListener = listener;
    }
}
