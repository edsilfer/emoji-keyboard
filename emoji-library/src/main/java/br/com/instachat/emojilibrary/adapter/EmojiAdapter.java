package br.com.instachat.emojilibrary.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import br.com.instachat.emojilibrary.R;
import br.com.instachat.emojilibrary.controller.Emoji;
import br.com.instachat.emojilibrary.controller.EmojiTextView;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class EmojiAdapter extends ArrayAdapter<Emoji> {
    private boolean mUseSystemDefault = false;

    public EmojiAdapter(Context context, List<Emoji> data) {
        super(context, R.layout.src_emoji_item, data);
        mUseSystemDefault = false;
    }

    public EmojiAdapter(Context context, List<Emoji> data, boolean useSystemDefault) {
        super(context, R.layout.src_emoji_item, data);
        mUseSystemDefault = useSystemDefault;
    }

    public EmojiAdapter(Context context, Emoji[] data) {
        super(context, R.layout.src_emoji_item, data);
        mUseSystemDefault = false;
    }

    public EmojiAdapter(Context context, Emoji[] data, boolean useSystemDefault) {
        super(context, R.layout.src_emoji_item, data);
        mUseSystemDefault = useSystemDefault;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = View.inflate(getContext(), R.layout.src_emoji_item, null);
            ViewHolder holder = new ViewHolder();
            holder.icon = (EmojiTextView) v.findViewById(R.id.emoji_icon);
            holder.icon.setUseSystemDefault(mUseSystemDefault);
            v.setTag(holder);
        }
        Emoji emoji = getItem(position);
        ViewHolder holder = (ViewHolder) v.getTag();
        holder.icon.setText(emoji.getEmoji());
        return v;
    }

    static class ViewHolder {
        EmojiTextView icon;
    }
}
