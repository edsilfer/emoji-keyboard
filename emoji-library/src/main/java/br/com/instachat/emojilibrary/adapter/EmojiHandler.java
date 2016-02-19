package br.com.instachat.emojilibrary.adapter;

import android.content.Context;
import android.text.Spannable;
import android.util.SparseIntArray;

import java.util.HashMap;
import java.util.Map;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public final class EmojiHandler {
    private EmojiHandler() {
    }

    private static final SparseIntArray sEmojisMap = new SparseIntArray(1029);
    private static final SparseIntArray sSoftbanksMap = new SparseIntArray(471);
    private static Map<String, Integer> sEmojisModifiedMap = new HashMap<>();

    static {
        // People
        sEmojisMap.put(0x1f604, R.drawable.emoji_1f306);
        sEmojisMap.put(0x1f603, R.drawable.emoji_1f30d);
    }

    private static boolean isSoftBankEmoji(char c) {
        return ((c >> 12) == 0xe);
    }

    private static int getEmojiResource(Context context, int codePoint) {
        return sEmojisMap.get(codePoint);
    }

    private static int getSoftbankEmojiResource(char c) {
        return sSoftbanksMap.get(c);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, index, length, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, boolean useSystemDefault) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, useSystemDefault);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length, boolean useSystemDefault) {
        if (useSystemDefault) {
            return;
        }

        int textLength = text.length();
        int textLengthToProcessMax = textLength - index;
        int textLengthToProcess = length < 0 || length >= textLengthToProcessMax ? textLength : (length + index);

        int skip;
        for (int i = index; i < textLengthToProcess; i += skip) {
            skip = 0;
            int icon = 0;
            char c = text.charAt(i);
            if (isSoftBankEmoji(c)) {
                icon = getSoftbankEmojiResource(c);
                skip = icon == 0 ? 0 : 1;
            }

            if (icon == 0) {
                int unicode = Character.codePointAt(text, i);
                skip = Character.charCount(unicode);

                if (unicode > 0xff) {
                    icon = getEmojiResource(context, unicode);
                }

                if (i + skip < textLengthToProcess) {
                    int followUnicode = Character.codePointAt(text, i + skip);
                    //Non-spacing mark (Combining mark)
                    if (followUnicode == 0xfe0f) {
                        int followSkip = Character.charCount(followUnicode);
                        if (i + skip + followSkip < textLengthToProcess) {

                            int nextFollowUnicode = Character.codePointAt(text, i + skip + followSkip);
                            if (nextFollowUnicode == 0x20e3) {
                                int nextFollowSkip = Character.charCount(nextFollowUnicode);

                            }
                        }
                    }
                }
            }
        }
    }
}