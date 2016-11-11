package br.com.instachat.emojilibrary.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.sql.Timestamp;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class Emoji implements Parcelable {

    public static final String TAG = "Emoji";

    private int icon;
    private char value;
    private String emoji;
    private Timestamp timestamp;

    // CONSTRUCTORS
    public Emoji() {
    }

    public Emoji(int icon, char value, String emoji) {
        this.icon = icon;
        this.value = value;
        this.emoji = emoji;
    }

    public Emoji(Parcel in) {
        this.icon = in.readInt();
        this.value = (char) in.readInt();
        this.emoji = in.readString();
    }


    public Emoji(String emoji) {
        this.emoji = emoji;
    }

    public static Emoji fromResource(int icon, int value) {
        Emoji emoji = new Emoji();
        emoji.icon = icon;
        emoji.value = (char) value;
        return emoji;
    }

    public static Emoji fromCodePoint(int codePoint) {
        Emoji emoji = new Emoji();
        emoji.emoji = newString(codePoint);
        return emoji;
    }

    public static Emoji fromChar(char ch) {
        Emoji emoji = new Emoji();
        emoji.emoji = Character.toString(ch);
        return emoji;
    }

    public static Emoji fromString(String chars) {
        Emoji emoji = new Emoji();
        emoji.emoji = chars;
        return emoji;
    }

    public static final String newString(int codePoint) {
        if (Character.charCount(codePoint) == 1) {
            return String.valueOf(codePoint);
        } else {
            return new String(Character.toChars(codePoint));
        }
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Emoji && emoji.equals(((Emoji) o).emoji);
    }

    @Override
    public int hashCode() {
        return emoji.hashCode();
    }

    public static final Creator<Emoji> CREATOR = new Creator<Emoji>() {
        @Override
        public Emoji createFromParcel(Parcel in) {
            return new Emoji(in);
        }

        @Override
        public Emoji[] newArray(int size) {
            return new Emoji[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(icon);
        dest.writeInt(value);
        dest.writeString(emoji);
    }

    // GETTERS AND SETERS
    public char getValue() {
        return value;
    }

    public int getIcon() {
        return icon;
    }

    public String getEmoji() {
        return emoji;
    }


}
