package br.com.instachat.emojilibrary.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import br.com.instachat.emojilibrary.model.Emoji;

/**
 * Created by edgar on 13-May-16.
 */
public class SharedPreferencesManager {

    private static final String PREFERENCES_FILE = "EmojiProperties";
    private static final String RECENT_EMOJIS = "RECENTS";
    private static final String DELIMETER = "213488984564321";

    static private SharedPreferences.Editor mWriter;
    static private SharedPreferences mReader;

    public SharedPreferencesManager(Context context) {
        mWriter = context.getSharedPreferences(PREFERENCES_FILE, context.MODE_PRIVATE).edit();
        mReader = context.getSharedPreferences(PREFERENCES_FILE, context.MODE_PRIVATE);
    }

    public void pushEmoji(Emoji emoji) {
        List<Emoji> emojis = popRecents();
        if (null == emojis || emojis.size() == 0) {
            emojis = new ArrayList<>();
        }
        Gson gson = new Gson();
        emojis.add(emoji);
        mWriter.putString(RECENT_EMOJIS, gson.toJson(emojis));
        mWriter.commit();
    }

    public List<Emoji> popRecents() {
        Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy HH:MM:ss").create();
        Type type = new TypeToken<List<Emoji>>() {
        }.getType();
        return gson.fromJson(mReader.getString(RECENT_EMOJIS, ""), type);
    }

}
