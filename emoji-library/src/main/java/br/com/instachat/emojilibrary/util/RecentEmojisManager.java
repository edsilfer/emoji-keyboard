package br.com.instachat.emojilibrary.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Stack;

import br.com.instachat.emojilibrary.adapter.EmojiAdapter;
import br.com.instachat.emojilibrary.model.Emoji;

/**
 * Created by edgar on 13-May-16.
 */
public class RecentEmojisManager {

    private static RecentEmojisManager ourInstance;

    private static final String PREFERENCES_FILE = "EmojiProperties";
    private static final String RECENT_EMOJIS = "RECENTS";
    private static final String DELIMETER = "213488984564321";

    static private SharedPreferences.Editor mWriter;
    static private SharedPreferences mReader;

    private Stack<Emoji> recentEmojis;

    private static Context context;

    public static void initContext(Context pContext){
        if(context==null)
            context = pContext;
    }

    private RecentEmojisManager(Context context) {
        mWriter = context.getSharedPreferences(PREFERENCES_FILE, context.MODE_PRIVATE).edit();
        mReader = context.getSharedPreferences(PREFERENCES_FILE, context.MODE_PRIVATE);
        recentEmojis = getSavedRecentEmojis();
        if (recentEmojis == null){
            recentEmojis = new Stack<>();
        }
    }

    public static RecentEmojisManager getInstance(){
        if(ourInstance==null){
            ourInstance = new RecentEmojisManager(context);
        }
        return ourInstance;
    }

    public void saveRecentEmojis(List<Emoji> emojiStack){
        Gson gson = new Gson();
        mWriter.putString(RECENT_EMOJIS, gson.toJson(emojiStack));
        mWriter.commit();
    }

    public Stack<Emoji> getSavedRecentEmojis() {
        Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy HH:MM:ss").create();
        Type type = new TypeToken<Stack<Emoji>>() {
        }.getType();
        return gson.fromJson(mReader.getString(RECENT_EMOJIS, ""), type);
    }

    public Stack<Emoji> getRecentEmojis() {
        Stack<Emoji> reverseOrderStack = new Stack<>();
        for(Emoji emoji : recentEmojis){
            reverseOrderStack.push(emoji);
        }
        return reverseOrderStack;
    }

    public void addRecentEmoji(Emoji emoji){
        int emojiPosition = recentEmojis.search(emoji);
        if(emojiPosition != -1){
            recentEmojis.remove(emojiPosition);
        }
        recentEmojis.push(emoji);

        //save new recent stack async
        new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... params) {
                saveRecentEmojis(recentEmojis);
                return true;
            }
        }.execute();

    }

}
