package br.com.edsilfer.emojilibrary.data

import android.content.Context
import android.content.SharedPreferences
import br.com.edsilfer.emojilibrary.model.Emoji
import br.com.edsilfer.emojilibrary.util.Constants
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class EmojiStore private constructor(context: Context) {

    companion object {
        private var instance: EmojiStore? = null

        fun instance(context: Context): EmojiStore {
            if (instance == null) {
                instance = EmojiStore(context)
            }
            return instance!!
        }
    }

    private val gson = Gson()
    private var recentUsedEmojis: MutableList<Emoji> = mutableListOf()
    private val writer: SharedPreferences.Editor = context.getSharedPreferences(Constants.PREFERENCES_FILE, Context.MODE_PRIVATE).edit()
    private val reader: SharedPreferences = context.getSharedPreferences(Constants.PREFERENCES_FILE, Context.MODE_PRIVATE)


    fun save(emoji: Emoji) {
        recentUsedEmojis.remove(emoji)
        recentUsedEmojis.add(0, emoji)
        writer.putString(Constants.RECENT_EMOJIS, gson.toJson(recentUsedEmojis))
        writer.commit()
    }

    fun list(): MutableList<Emoji> {
        if (recentUsedEmojis.isNotEmpty()) {
            return recentUsedEmojis
        }
        val type = object : TypeToken<ArrayList<Emoji?>?>() {}.type
        val json = reader.getString(Constants.RECENT_EMOJIS, "")
        recentUsedEmojis = if (json == null || json.isEmpty())  mutableListOf() else  gson.fromJson(json, type)
        return recentUsedEmojis
    }
}
