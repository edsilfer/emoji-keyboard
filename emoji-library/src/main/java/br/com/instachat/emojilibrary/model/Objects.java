package br.com.instachat.emojilibrary.model;

import android.util.SparseIntArray;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class Objects {
    public static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoint(0x1f38d),
            Emoji.fromCodePoint(0x1f49d),
            Emoji.fromCodePoint(0x1f38e),
            Emoji.fromCodePoint(0x1f392),
            Emoji.fromCodePoint(0x1f393),
            Emoji.fromCodePoint(0x1f38f),
            Emoji.fromCodePoint(0x1f386),
            Emoji.fromCodePoint(0x1f387),
            Emoji.fromCodePoint(0x1f390),
            Emoji.fromCodePoint(0x1f391),
            Emoji.fromCodePoint(0x1f383),
            Emoji.fromCodePoint(0x1f47b),
            Emoji.fromCodePoint(0x1f385),
            Emoji.fromCodePoint(0x1f384),
            Emoji.fromCodePoint(0x1f381),
            Emoji.fromCodePoint(0x1f38b),
            Emoji.fromCodePoint(0x1f389),
            Emoji.fromCodePoint(0x1f38a),
            Emoji.fromCodePoint(0x1f388),
            Emoji.fromCodePoint(0x1f38c),
            Emoji.fromCodePoint(0x1f52e),
            Emoji.fromCodePoint(0x1f3a5),
            Emoji.fromCodePoint(0x1f4f7),
            Emoji.fromCodePoint(0x1f4f9),
            Emoji.fromCodePoint(0x1f4fc),
            Emoji.fromCodePoint(0x1f4bf),
            Emoji.fromCodePoint(0x1f4c0),
            Emoji.fromCodePoint(0x1f4bd),
            Emoji.fromCodePoint(0x1f4be),
            Emoji.fromCodePoint(0x1f4bb),
            Emoji.fromCodePoint(0x1f4f1),
            Emoji.fromChar((char) 0x260e),
            Emoji.fromCodePoint(0x1f4de),
            Emoji.fromCodePoint(0x1f4df),
            Emoji.fromCodePoint(0x1f4e0),
            Emoji.fromCodePoint(0x1f4e1),
            Emoji.fromCodePoint(0x1f4fa),
            Emoji.fromCodePoint(0x1f4fb),
            Emoji.fromCodePoint(0x1f508),
            Emoji.fromCodePoint(0x1f509),
            Emoji.fromCodePoint(0x1f50a),
            Emoji.fromCodePoint(0x1f507),
            Emoji.fromCodePoint(0x1f514),
            Emoji.fromCodePoint(0x1f515),
            Emoji.fromCodePoint(0x1f4e2),
            Emoji.fromCodePoint(0x1f4e3),
            Emoji.fromChar((char) 0x23f3),
            Emoji.fromChar((char) 0x231b),
            Emoji.fromChar((char) 0x23f0),
            Emoji.fromChar((char) 0x231a),
            Emoji.fromCodePoint(0x1f513),
            Emoji.fromCodePoint(0x1f512),
            Emoji.fromCodePoint(0x1f50f),
            Emoji.fromCodePoint(0x1f510),
            Emoji.fromCodePoint(0x1f511),
            Emoji.fromCodePoint(0x1f50e),
            Emoji.fromCodePoint(0x1f4a1),
            Emoji.fromCodePoint(0x1f526),
            Emoji.fromCodePoint(0x1f506),
            Emoji.fromCodePoint(0x1f505),
            Emoji.fromCodePoint(0x1f50c),
            Emoji.fromCodePoint(0x1f50b),
            Emoji.fromCodePoint(0x1f50d),
            Emoji.fromCodePoint(0x1f6c1),
            Emoji.fromCodePoint(0x1f6c0),
            Emoji.fromCodePoint(0x1f6bf),
            Emoji.fromCodePoint(0x1f6bd),
            Emoji.fromCodePoint(0x1f527),
            Emoji.fromCodePoint(0x1f529),
            Emoji.fromCodePoint(0x1f528),
            Emoji.fromCodePoint(0x1f6aa),
            Emoji.fromCodePoint(0x1f6ac),
            Emoji.fromCodePoint(0x1f4a3),
            Emoji.fromCodePoint(0x1f52b),
            Emoji.fromCodePoint(0x1f52a),
            Emoji.fromCodePoint(0x1f48a),
            Emoji.fromCodePoint(0x1f489),
            Emoji.fromCodePoint(0x1f4b0),
            Emoji.fromCodePoint(0x1f4b4),
            Emoji.fromCodePoint(0x1f4b5),
            Emoji.fromCodePoint(0x1f4b7),
            Emoji.fromCodePoint(0x1f4b6),
            Emoji.fromCodePoint(0x1f4b3),
            Emoji.fromCodePoint(0x1f4b8),
            Emoji.fromCodePoint(0x1f4f2),
            Emoji.fromCodePoint(0x1f4e7),
            Emoji.fromCodePoint(0x1f4e5),
            Emoji.fromCodePoint(0x1f4e4),
            Emoji.fromChar((char) 0x2709),
            Emoji.fromCodePoint(0x1f4e9),
            Emoji.fromCodePoint(0x1f4e8),
            Emoji.fromCodePoint(0x1f4ef),
            Emoji.fromCodePoint(0x1f4eb),
            Emoji.fromCodePoint(0x1f4ea),
            Emoji.fromCodePoint(0x1f4ec),
            Emoji.fromCodePoint(0x1f4ed),
            Emoji.fromCodePoint(0x1f4ee),
            Emoji.fromCodePoint(0x1f4e6),
            Emoji.fromCodePoint(0x1f4dd),
            Emoji.fromCodePoint(0x1f4c4),
            Emoji.fromCodePoint(0x1f4c3),
            Emoji.fromCodePoint(0x1f4d1),
            Emoji.fromCodePoint(0x1f4ca),
            Emoji.fromCodePoint(0x1f4c8),
            Emoji.fromCodePoint(0x1f4c9),
            Emoji.fromCodePoint(0x1f4dc),
            Emoji.fromCodePoint(0x1f4cb),
            Emoji.fromCodePoint(0x1f4c5),
            Emoji.fromCodePoint(0x1f4c6),
            Emoji.fromCodePoint(0x1f4c7),
            Emoji.fromCodePoint(0x1f4c1),
            Emoji.fromCodePoint(0x1f4c2),
            Emoji.fromChar((char) 0x2702),
            Emoji.fromCodePoint(0x1f4cc),
            Emoji.fromCodePoint(0x1f4ce),
            Emoji.fromChar((char) 0x2712),
            Emoji.fromChar((char) 0x270f),
            Emoji.fromCodePoint(0x1f4cf),
            Emoji.fromCodePoint(0x1f4d0),
            Emoji.fromCodePoint(0x1f4d5),
            Emoji.fromCodePoint(0x1f4d7),
            Emoji.fromCodePoint(0x1f4d8),
            Emoji.fromCodePoint(0x1f4d9),
            Emoji.fromCodePoint(0x1f4d3),
            Emoji.fromCodePoint(0x1f4d4),
            Emoji.fromCodePoint(0x1f4d2),
            Emoji.fromCodePoint(0x1f4da),
            Emoji.fromCodePoint(0x1f4d6),
            Emoji.fromCodePoint(0x1f516),
            Emoji.fromCodePoint(0x1f4db),
            Emoji.fromCodePoint(0x1f52c),
            Emoji.fromCodePoint(0x1f52d),
            Emoji.fromCodePoint(0x1f4f0),
            Emoji.fromCodePoint(0x1f3a8),
            Emoji.fromCodePoint(0x1f3ac),
            Emoji.fromCodePoint(0x1f3a4),
            Emoji.fromCodePoint(0x1f3a7),
            Emoji.fromCodePoint(0x1f3bc),
            Emoji.fromCodePoint(0x1f3b5),
            Emoji.fromCodePoint(0x1f3b6),
            Emoji.fromCodePoint(0x1f3b9),
            Emoji.fromCodePoint(0x1f3bb),
            Emoji.fromCodePoint(0x1f3ba),
            Emoji.fromCodePoint(0x1f3b7),
            Emoji.fromCodePoint(0x1f3b8),
            Emoji.fromCodePoint(0x1f47e),
            Emoji.fromCodePoint(0x1f3ae),
            Emoji.fromCodePoint(0x1f0cf),
            Emoji.fromCodePoint(0x1f3b4),
            Emoji.fromCodePoint(0x1f004),
            Emoji.fromCodePoint(0x1f3b2),
            Emoji.fromCodePoint(0x1f3af),
            Emoji.fromCodePoint(0x1f3c8),
            Emoji.fromCodePoint(0x1f3c0),
            Emoji.fromChar((char) 0x26bd),
            Emoji.fromChar((char) 0x26be),
            Emoji.fromCodePoint(0x1f3be),
            Emoji.fromCodePoint(0x1f3b1),
            Emoji.fromCodePoint(0x1f3c9),
            Emoji.fromCodePoint(0x1f3b3),
            Emoji.fromChar((char) 0x26f3),
            Emoji.fromCodePoint(0x1f6b5),
            Emoji.fromCodePoint(0x1f6b4),
            Emoji.fromCodePoint(0x1f3c1),
            Emoji.fromCodePoint(0x1f3c7),
            Emoji.fromCodePoint(0x1f3c6),
            Emoji.fromCodePoint(0x1f3bf),
            Emoji.fromCodePoint(0x1f3c2),
            Emoji.fromCodePoint(0x1f3ca),
            Emoji.fromCodePoint(0x1f3c4),
            Emoji.fromCodePoint(0x1f3a3),
            Emoji.fromChar((char) 0x2615),
            Emoji.fromCodePoint(0x1f375),
            Emoji.fromCodePoint(0x1f376),
            Emoji.fromCodePoint(0x1f37c),
            Emoji.fromCodePoint(0x1f37a),
            Emoji.fromCodePoint(0x1f37b),
            Emoji.fromCodePoint(0x1f378),
            Emoji.fromCodePoint(0x1f379),
            Emoji.fromCodePoint(0x1f377),
            Emoji.fromCodePoint(0x1f374),
            Emoji.fromCodePoint(0x1f355),
            Emoji.fromCodePoint(0x1f354),
            Emoji.fromCodePoint(0x1f35f),
            Emoji.fromCodePoint(0x1f357),
            Emoji.fromCodePoint(0x1f356),
            Emoji.fromCodePoint(0x1f35d),
            Emoji.fromCodePoint(0x1f35b),
            Emoji.fromCodePoint(0x1f364),
            Emoji.fromCodePoint(0x1f371),
            Emoji.fromCodePoint(0x1f363),
            Emoji.fromCodePoint(0x1f365),
            Emoji.fromCodePoint(0x1f359),
            Emoji.fromCodePoint(0x1f358),
            Emoji.fromCodePoint(0x1f35a),
            Emoji.fromCodePoint(0x1f35c),
            Emoji.fromCodePoint(0x1f372),
            Emoji.fromCodePoint(0x1f362),
            Emoji.fromCodePoint(0x1f361),
            Emoji.fromCodePoint(0x1f373),
            Emoji.fromCodePoint(0x1f35e),
            Emoji.fromCodePoint(0x1f369),
            Emoji.fromCodePoint(0x1f36e),
            Emoji.fromCodePoint(0x1f366),
            Emoji.fromCodePoint(0x1f368),
            Emoji.fromCodePoint(0x1f367),
            Emoji.fromCodePoint(0x1f382),
            Emoji.fromCodePoint(0x1f370),
            Emoji.fromCodePoint(0x1f36a),
            Emoji.fromCodePoint(0x1f36b),
            Emoji.fromCodePoint(0x1f36c),
            Emoji.fromCodePoint(0x1f36d),
            Emoji.fromCodePoint(0x1f36f),
            Emoji.fromCodePoint(0x1f34e),
            Emoji.fromCodePoint(0x1f34f),
            Emoji.fromCodePoint(0x1f34a),
            Emoji.fromCodePoint(0x1f34b),
            Emoji.fromCodePoint(0x1f352),
            Emoji.fromCodePoint(0x1f347),
            Emoji.fromCodePoint(0x1f349),
            Emoji.fromCodePoint(0x1f353),
            Emoji.fromCodePoint(0x1f351),
            Emoji.fromCodePoint(0x1f348),
            Emoji.fromCodePoint(0x1f34c),
            Emoji.fromCodePoint(0x1f350),
            Emoji.fromCodePoint(0x1f34d),
            Emoji.fromCodePoint(0x1f360),
            Emoji.fromCodePoint(0x1f346),
            Emoji.fromCodePoint(0x1f345),
            Emoji.fromCodePoint(0x1f33d),
    };

    public static void bindEmojis(SparseIntArray map) {
        map.put(0x1f38d, R.drawable.emoji_1f38d);
        map.put(0x1f49d, R.drawable.emoji_1f49d);
        map.put(0x1f38e, R.drawable.emoji_1f38e);
        map.put(0x1f392, R.drawable.emoji_1f392);
        map.put(0x1f393, R.drawable.emoji_1f393);
        map.put(0x1f38f, R.drawable.emoji_1f38f);
        map.put(0x1f386, R.drawable.emoji_1f386);
        map.put(0x1f387, R.drawable.emoji_1f387);
        map.put(0x1f390, R.drawable.emoji_1f390);
        map.put(0x1f391, R.drawable.emoji_1f391);
        map.put(0x1f383, R.drawable.emoji_1f383);
        map.put(0x1f47b, R.drawable.emoji_1f47b);
        map.put(0x1f385, R.drawable.emoji_1f385);
        map.put(0x1f384, R.drawable.emoji_1f384);
        map.put(0x1f381, R.drawable.emoji_1f381);
        map.put(0x1f38b, R.drawable.emoji_1f38b);
        map.put(0x1f389, R.drawable.emoji_1f389);
        map.put(0x1f38a, R.drawable.emoji_1f38a);
        map.put(0x1f388, R.drawable.emoji_1f388);
        map.put(0x1f38c, R.drawable.emoji_1f38c);
        map.put(0x1f52e, R.drawable.emoji_1f52e);
        map.put(0x1f3a5, R.drawable.emoji_1f3a5);
        map.put(0x1f4f7, R.drawable.emoji_1f4f7);
        map.put(0x1f4f9, R.drawable.emoji_1f4f9);
        map.put(0x1f4fc, R.drawable.emoji_1f4fc);
        map.put(0x1f4bf, R.drawable.emoji_1f4bf);
        map.put(0x1f4c0, R.drawable.emoji_1f4c0);
        map.put(0x1f4bd, R.drawable.emoji_1f4bd);
        map.put(0x1f4be, R.drawable.emoji_1f4be);
        map.put(0x1f4bb, R.drawable.emoji_1f4bb);
        map.put(0x1f4f1, R.drawable.emoji_1f4f1);
        map.put(0x260e, R.drawable.emoji_260e);
        map.put(0x1f4de, R.drawable.emoji_1f4de);
        map.put(0x1f4df, R.drawable.emoji_1f4df);
        map.put(0x1f4e0, R.drawable.emoji_1f4e0);
        map.put(0x1f4e1, R.drawable.emoji_1f4e1);
        map.put(0x1f4fa, R.drawable.emoji_1f4fa);
        map.put(0x1f4fb, R.drawable.emoji_1f4fb);
        map.put(0x1f50a, R.drawable.emoji_1f50a);
        map.put(0x1f509, R.drawable.emoji_1f509);
        map.put(0x1f508, R.drawable.emoji_1f508);
        map.put(0x1f507, R.drawable.emoji_1f507);
        map.put(0x1f514, R.drawable.emoji_1f514);
        map.put(0x1f515, R.drawable.emoji_1f515);
        map.put(0x1f4e2, R.drawable.emoji_1f4e2);
        map.put(0x1f4e3, R.drawable.emoji_1f4e3);
        map.put(0x23f3, R.drawable.emoji_23f3);
        map.put(0x231b, R.drawable.emoji_231b);
        map.put(0x23f0, R.drawable.emoji_23f0);
        map.put(0x231a, R.drawable.emoji_231a);
        map.put(0x1f513, R.drawable.emoji_1f513);
        map.put(0x1f512, R.drawable.emoji_1f512);
        map.put(0x1f50f, R.drawable.emoji_1f50f);
        map.put(0x1f510, R.drawable.emoji_1f510);
        map.put(0x1f511, R.drawable.emoji_1f511);
        map.put(0x1f50e, R.drawable.emoji_1f50e);
        map.put(0x1f4a1, R.drawable.emoji_1f4a1);
        map.put(0x1f526, R.drawable.emoji_1f526);
        map.put(0x1f506, R.drawable.emoji_1f506);
        map.put(0x1f505, R.drawable.emoji_1f505);
        map.put(0x1f50c, R.drawable.emoji_1f50c);
        map.put(0x1f50b, R.drawable.emoji_1f50b);
        map.put(0x1f50d, R.drawable.emoji_1f50d);
        map.put(0x1f6c1, R.drawable.emoji_1f6c1);
        map.put(0x1f6c0, R.drawable.emoji_1f6c0);
        map.put(0x1f6bf, R.drawable.emoji_1f6bf);
        map.put(0x1f6bd, R.drawable.emoji_1f6bd);
        map.put(0x1f527, R.drawable.emoji_1f527);
        map.put(0x1f529, R.drawable.emoji_1f529);
        map.put(0x1f528, R.drawable.emoji_1f528);
        map.put(0x1f6aa, R.drawable.emoji_1f6aa);
        map.put(0x1f6ac, R.drawable.emoji_1f6ac);
        map.put(0x1f4a3, R.drawable.emoji_1f4a3);
        map.put(0x1f52b, R.drawable.emoji_1f52b);
        map.put(0x1f52a, R.drawable.emoji_1f52a);
        map.put(0x1f48a, R.drawable.emoji_1f48a);
        map.put(0x1f489, R.drawable.emoji_1f489);
        map.put(0x1f4b0, R.drawable.emoji_1f4b0);
        map.put(0x1f4b4, R.drawable.emoji_1f4b4);
        map.put(0x1f4b5, R.drawable.emoji_1f4b5);
        map.put(0x1f4b7, R.drawable.emoji_1f4b7);
        map.put(0x1f4b6, R.drawable.emoji_1f4b6);
        map.put(0x1f4b3, R.drawable.emoji_1f4b3);
        map.put(0x1f4b8, R.drawable.emoji_1f4b8);
        map.put(0x1f4f2, R.drawable.emoji_1f4f2);
        map.put(0x1f4e7, R.drawable.emoji_1f4e7);
        map.put(0x1f4e5, R.drawable.emoji_1f4e5);
        map.put(0x1f4e4, R.drawable.emoji_1f4e4);
        map.put(0x2709, R.drawable.emoji_2709);
        map.put(0x1f4e9, R.drawable.emoji_1f4e9);
        map.put(0x1f4e8, R.drawable.emoji_1f4e8);
        map.put(0x1f4ef, R.drawable.emoji_1f4ef);
        map.put(0x1f4eb, R.drawable.emoji_1f4eb);
        map.put(0x1f4ea, R.drawable.emoji_1f4ea);
        map.put(0x1f4ec, R.drawable.emoji_1f4ec);
        map.put(0x1f4ed, R.drawable.emoji_1f4ed);
        map.put(0x1f4ee, R.drawable.emoji_1f4ee);
        map.put(0x1f4e6, R.drawable.emoji_1f4e6);
        map.put(0x1f4dd, R.drawable.emoji_1f4dd);
        map.put(0x1f4c4, R.drawable.emoji_1f4c4);
        map.put(0x1f4c3, R.drawable.emoji_1f4c3);
        map.put(0x1f4d1, R.drawable.emoji_1f4d1);
        map.put(0x1f4ca, R.drawable.emoji_1f4ca);
        map.put(0x1f4c8, R.drawable.emoji_1f4c8);
        map.put(0x1f4c9, R.drawable.emoji_1f4c9);
        map.put(0x1f4dc, R.drawable.emoji_1f4dc);
        map.put(0x1f4cb, R.drawable.emoji_1f4cb);
        map.put(0x1f4c5, R.drawable.emoji_1f4c5);
        map.put(0x1f4c6, R.drawable.emoji_1f4c6);
        map.put(0x1f4c7, R.drawable.emoji_1f4c7);
        map.put(0x1f4c1, R.drawable.emoji_1f4c1);
        map.put(0x1f4c2, R.drawable.emoji_1f4c2);
        map.put(0x2702, R.drawable.emoji_2702);
        map.put(0x1f4cc, R.drawable.emoji_1f4cc);
        map.put(0x1f4ce, R.drawable.emoji_1f4ce);
        map.put(0x2712, R.drawable.emoji_2712);
        map.put(0x270f, R.drawable.emoji_270f);
        map.put(0x1f4cf, R.drawable.emoji_1f4cf);
        map.put(0x1f4d0, R.drawable.emoji_1f4d0);
        map.put(0x1f4d5, R.drawable.emoji_1f4d5);
        map.put(0x1f4d7, R.drawable.emoji_1f4d7);
        map.put(0x1f4d8, R.drawable.emoji_1f4d8);
        map.put(0x1f4d9, R.drawable.emoji_1f4d9);
        map.put(0x1f4d3, R.drawable.emoji_1f4d3);
        map.put(0x1f4d4, R.drawable.emoji_1f4d4);
        map.put(0x1f4d2, R.drawable.emoji_1f4d2);
        map.put(0x1f4da, R.drawable.emoji_1f4da);
        map.put(0x1f4d6, R.drawable.emoji_1f4d6);
        map.put(0x1f516, R.drawable.emoji_1f516);
        map.put(0x1f4db, R.drawable.emoji_1f4db);
        map.put(0x1f52c, R.drawable.emoji_1f52c);
        map.put(0x1f52d, R.drawable.emoji_1f52d);
        map.put(0x1f4f0, R.drawable.emoji_1f4f0);
        map.put(0x1f3a8, R.drawable.emoji_1f3a8);
        map.put(0x1f3ac, R.drawable.emoji_1f3ac);
        map.put(0x1f3a4, R.drawable.emoji_1f3a4);
        map.put(0x1f3a7, R.drawable.emoji_1f3a7);
        map.put(0x1f3bc, R.drawable.emoji_1f3bc);
        map.put(0x1f3b5, R.drawable.emoji_1f3b5);
        map.put(0x1f3b6, R.drawable.emoji_1f3b6);
        map.put(0x1f3b9, R.drawable.emoji_1f3b9);
        map.put(0x1f3bb, R.drawable.emoji_1f3bb);
        map.put(0x1f3ba, R.drawable.emoji_1f3ba);
        map.put(0x1f3b7, R.drawable.emoji_1f3b7);
        map.put(0x1f3b8, R.drawable.emoji_1f3b8);
        map.put(0x1f47e, R.drawable.emoji_1f47e);
        map.put(0x1f3ae, R.drawable.emoji_1f3ae);
        map.put(0x1f0cf, R.drawable.emoji_1f0cf);
        map.put(0x1f3b4, R.drawable.emoji_1f3b4);
        map.put(0x1f004, R.drawable.emoji_1f004);
        map.put(0x1f3b2, R.drawable.emoji_1f3b2);
        map.put(0x1f3af, R.drawable.emoji_1f3af);
        map.put(0x1f3c8, R.drawable.emoji_1f3c8);
        map.put(0x1f3c0, R.drawable.emoji_1f3c0);
        map.put(0x26bd, R.drawable.emoji_26bd);
        map.put(0x26be, R.drawable.emoji_26be);
        map.put(0x1f3be, R.drawable.emoji_1f3be);
        map.put(0x1f3b1, R.drawable.emoji_1f3b1);
        map.put(0x1f3c9, R.drawable.emoji_1f3c9);
        map.put(0x1f3b3, R.drawable.emoji_1f3b3);
        map.put(0x26f3, R.drawable.emoji_26f3);
        map.put(0x1f6b5, R.drawable.emoji_1f6b5);
        map.put(0x1f6b4, R.drawable.emoji_1f6b4);
        map.put(0x1f3c1, R.drawable.emoji_1f3c1);
        map.put(0x1f3c7, R.drawable.emoji_1f3c7);
        map.put(0x1f3c6, R.drawable.emoji_1f3c6);
        map.put(0x1f3bf, R.drawable.emoji_1f3bf);
        map.put(0x1f3c2, R.drawable.emoji_1f3c2);
        map.put(0x1f3ca, R.drawable.emoji_1f3ca);
        map.put(0x1f3c4, R.drawable.emoji_1f3c4);
        map.put(0x1f3a3, R.drawable.emoji_1f3a3);
        map.put(0x2615, R.drawable.emoji_2615);
        map.put(0x1f375, R.drawable.emoji_1f375);
        map.put(0x1f376, R.drawable.emoji_1f376);
        map.put(0x1f37c, R.drawable.emoji_1f37c);
        map.put(0x1f37a, R.drawable.emoji_1f37a);
        map.put(0x1f37b, R.drawable.emoji_1f37b);
        map.put(0x1f378, R.drawable.emoji_1f378);
        map.put(0x1f379, R.drawable.emoji_1f379);
        map.put(0x1f377, R.drawable.emoji_1f377);
        map.put(0x1f374, R.drawable.emoji_1f374);
        map.put(0x1f355, R.drawable.emoji_1f355);
        map.put(0x1f354, R.drawable.emoji_1f354);
        map.put(0x1f35f, R.drawable.emoji_1f35f);
        map.put(0x1f357, R.drawable.emoji_1f357);
        map.put(0x1f356, R.drawable.emoji_1f356);
        map.put(0x1f35d, R.drawable.emoji_1f35d);
        map.put(0x1f35b, R.drawable.emoji_1f35b);
        map.put(0x1f364, R.drawable.emoji_1f364);
        map.put(0x1f371, R.drawable.emoji_1f371);
        map.put(0x1f363, R.drawable.emoji_1f363);
        map.put(0x1f365, R.drawable.emoji_1f365);
        map.put(0x1f359, R.drawable.emoji_1f359);
        map.put(0x1f358, R.drawable.emoji_1f358);
        map.put(0x1f35a, R.drawable.emoji_1f35a);
        map.put(0x1f35c, R.drawable.emoji_1f35c);
        map.put(0x1f372, R.drawable.emoji_1f372);
        map.put(0x1f362, R.drawable.emoji_1f362);
        map.put(0x1f361, R.drawable.emoji_1f361);
        map.put(0x1f373, R.drawable.emoji_1f373);
        map.put(0x1f35e, R.drawable.emoji_1f35e);
        map.put(0x1f369, R.drawable.emoji_1f369);
        map.put(0x1f36e, R.drawable.emoji_1f36e);
        map.put(0x1f366, R.drawable.emoji_1f366);
        map.put(0x1f368, R.drawable.emoji_1f368);
        map.put(0x1f367, R.drawable.emoji_1f367);
        map.put(0x1f382, R.drawable.emoji_1f382);
        map.put(0x1f370, R.drawable.emoji_1f370);
        map.put(0x1f36a, R.drawable.emoji_1f36a);
        map.put(0x1f36b, R.drawable.emoji_1f36b);
        map.put(0x1f36c, R.drawable.emoji_1f36c);
        map.put(0x1f36d, R.drawable.emoji_1f36d);
        map.put(0x1f36f, R.drawable.emoji_1f36f);
        map.put(0x1f34e, R.drawable.emoji_1f34e);
        map.put(0x1f34f, R.drawable.emoji_1f34f);
        map.put(0x1f34a, R.drawable.emoji_1f34a);
        map.put(0x1f34b, R.drawable.emoji_1f34b);
        map.put(0x1f352, R.drawable.emoji_1f352);
        map.put(0x1f347, R.drawable.emoji_1f347);
        map.put(0x1f349, R.drawable.emoji_1f349);
        map.put(0x1f353, R.drawable.emoji_1f353);
        map.put(0x1f351, R.drawable.emoji_1f351);
        map.put(0x1f348, R.drawable.emoji_1f348);
        map.put(0x1f34c, R.drawable.emoji_1f34c);
        map.put(0x1f350, R.drawable.emoji_1f350);
        map.put(0x1f34d, R.drawable.emoji_1f34d);
        map.put(0x1f360, R.drawable.emoji_1f360);
        map.put(0x1f346, R.drawable.emoji_1f346);
        map.put(0x1f345, R.drawable.emoji_1f345);
        map.put(0x1f33d, R.drawable.emoji_1f33d);
        map.put(0x1f399, R.drawable.emoji_1f399);
        map.put(0x1f39a, R.drawable.emoji_1f39a);
        map.put(0x1f39b, R.drawable.emoji_1f39b);
        map.put(0x1f5a5, R.drawable.emoji_1f5a5);
        map.put(0x1f5a8, R.drawable.emoji_1f5a8);
        map.put(0x2328, R.drawable.emoji_2328);
        map.put(0x1f5b1, R.drawable.emoji_1f5b1);
        map.put(0x1f5b2, R.drawable.emoji_1f5b2);
        map.put(0x1f4fd, R.drawable.emoji_1f4fd);
        map.put(0x1f4f8, R.drawable.emoji_1f4f8);
        map.put(0x1f56f, R.drawable.emoji_1f56f);
        map.put(0x1f5de, R.drawable.emoji_1f5de);
        map.put(0x1f5f3, R.drawable.emoji_1f5f3);
        map.put(0x1f58b, R.drawable.emoji_1f58b);
        map.put(0x1f58a, R.drawable.emoji_1f58a);
        map.put(0x1f58c, R.drawable.emoji_1f58c);
        map.put(0x1f58d, R.drawable.emoji_1f58d);
        map.put(0x1f5c2, R.drawable.emoji_1f5c2);
        map.put(0x1f5d2, R.drawable.emoji_1f5d2);
        map.put(0x1f5d3, R.drawable.emoji_1f5d3);
        map.put(0x1f587, R.drawable.emoji_1f587);
        map.put(0x1f5c3, R.drawable.emoji_1f5c3);
        map.put(0x1f5c4, R.drawable.emoji_1f5c4);
        map.put(0x1f5d1, R.drawable.emoji_1f5d1);
        map.put(0x1f5dd, R.drawable.emoji_1f5dd);
        map.put(0x26cf, R.drawable.emoji_26cf);
        map.put(0x2692, R.drawable.emoji_2692);
        map.put(0x1f6e0, R.drawable.emoji_1f6e0);
        map.put(0x2699, R.drawable.emoji_2699);
        map.put(0x1f5dc, R.drawable.emoji_1f5dc);
        map.put(0x2697, R.drawable.emoji_2697);
        map.put(0x2696, R.drawable.emoji_2696);
        map.put(0x26d3, R.drawable.emoji_26d3);
        map.put(0x1f5e1, R.drawable.emoji_1f5e1);
        map.put(0x2694, R.drawable.emoji_2694);
        map.put(0x1f6e1, R.drawable.emoji_1f6e1);
        map.put(0x1f3f9, R.drawable.emoji_1f3f9);
        map.put(0x26b0, R.drawable.emoji_26b0);
        map.put(0x26b1, R.drawable.emoji_26b1);
        map.put(0x1f3f3, R.drawable.emoji_1f3f3);
        map.put(0x1f3f4, R.drawable.emoji_1f3f4);
        map.put(0x269c, R.drawable.emoji_269c);
        map.put(0x2603, R.drawable.emoji_2603);
        map.put(0x2604, R.drawable.emoji_2604);
        map.put(0x1f54e, R.drawable.emoji_1f54e);
        map.put(0x1f396, R.drawable.emoji_1f396);
        map.put(0x1f397, R.drawable.emoji_1f397);
        map.put(0x1f39e, R.drawable.emoji_1f39e);
        map.put(0x1f39f, R.drawable.emoji_1f39f);
        map.put(0x1f3f7, R.drawable.emoji_1f3f7);
        map.put(0x1f3cc, R.drawable.emoji_1f3cc);
        map.put(0x26f8, R.drawable.emoji_26f8);
        map.put(0x26f7, R.drawable.emoji_26f7);
        map.put(0x26f9, R.drawable.emoji_26f9);
        map.put(0x1f3cb, R.drawable.emoji_1f3cb);
        map.put(0x1f3ce, R.drawable.emoji_1f3ce);
        map.put(0x1f3cd, R.drawable.emoji_1f3cd);
        map.put(0x1f3c5, R.drawable.emoji_1f3c5);
        map.put(0x1f3cf, R.drawable.emoji_1f3cf);
        map.put(0x1f3d0, R.drawable.emoji_1f3d0);
        map.put(0x1f3d1, R.drawable.emoji_1f3d1);
        map.put(0x1f3d2, R.drawable.emoji_1f3d2);
        map.put(0x1f3d3, R.drawable.emoji_1f3d3);
        map.put(0x1f3f8, R.drawable.emoji_1f3f8);
        map.put(0x1f579, R.drawable.emoji_1f579);
        map.put(0x1f5bc, R.drawable.emoji_1f5bc);
        map.put(0x1f6e2, R.drawable.emoji_1f6e2);
        map.put(0x1f6e3, R.drawable.emoji_1f6e3);
        map.put(0x1f6e4, R.drawable.emoji_1f6e4);
        map.put(0x1f6f3, R.drawable.emoji_1f6f3);
        map.put(0x26f4, R.drawable.emoji_26f4);
        map.put(0x1f6e5, R.drawable.emoji_1f6e5);
        map.put(0x1f6e9, R.drawable.emoji_1f6e9);
        map.put(0x1f6eb, R.drawable.emoji_1f6eb);
        map.put(0x1f6ec, R.drawable.emoji_1f6ec);
        map.put(0x1f6f0, R.drawable.emoji_1f6f0);
        map.put(0x1f6ce, R.drawable.emoji_1f6ce);
        map.put(0x1f6cc, R.drawable.emoji_1f6cc);
        map.put(0x1f6cf, R.drawable.emoji_1f6cf);
        map.put(0x1f6cb, R.drawable.emoji_1f6cb);
        map.put(0x23f1, R.drawable.emoji_23f1);
        map.put(0x23f2, R.drawable.emoji_23f2);
        map.put(0x1f570, R.drawable.emoji_1f570);
        map.put(0x1f321, R.drawable.emoji_1f321);
        map.put(0x1f336, R.drawable.emoji_1f336);
        map.put(0x1f9c0, R.drawable.emoji_1f9c0);
        map.put(0x1f32d, R.drawable.emoji_1f32d);
        map.put(0x1f32e, R.drawable.emoji_1f32e);
        map.put(0x1f32f, R.drawable.emoji_1f32f);
        map.put(0x1f37f, R.drawable.emoji_1f37f);
        map.put(0x1f37e, R.drawable.emoji_1f37e);
        map.put(0x1f37d, R.drawable.emoji_1f37d);
        map.put(0x1f3fa, R.drawable.emoji_1f3fa);
        map.put(0x26d1, R.drawable.emoji_26d1);
        map.put(0x1f575, R.drawable.emoji_1f575);
        map.put(0x1f5e3, R.drawable.emoji_1f5e3);
        map.put(0x1f574, R.drawable.emoji_1f574);
        map.put(0x2763, R.drawable.emoji_2763);
        map.put(0x1f573, R.drawable.emoji_1f573);
        map.put(0x1f5ef, R.drawable.emoji_1f5ef);
        map.put(0x1f576, R.drawable.emoji_1f576);
        map.put(0x1f6cd, R.drawable.emoji_1f6cd);
        map.put(0x1f4ff, R.drawable.emoji_1f4ff);
        map.put(0x2620, R.drawable.emoji_2620);
        map.put(0x1f916, R.drawable.emoji_1f916);

    }

    public static void bindSoftBankEmojis(SparseIntArray map) {
        map.put(0xe034, R.drawable.emoji_1f48d);
        map.put(0xe035, R.drawable.emoji_1f48e);
        map.put(0xe015, R.drawable.emoji_1f3be);
        map.put(0xe016, R.drawable.emoji_26be);
        map.put(0xe017, R.drawable.emoji_1f3c4);
        map.put(0xe018, R.drawable.emoji_26bd);
        map.put(0xe006, R.drawable.emoji_1f455);
        map.put(0xe007, R.drawable.emoji_1f45e);
        map.put(0xe008, R.drawable.emoji_1f4f7);
        map.put(0xe009, R.drawable.emoji_1f4de);
        map.put(0xe00a, R.drawable.emoji_1f4f1);
        map.put(0xe00b, R.drawable.emoji_1f4e0);
        map.put(0xe00c, R.drawable.emoji_1f4bb);
        map.put(0xe039, R.drawable.emoji_1f689);
        map.put(0xe03a, R.drawable.emoji_26fd);
        map.put(0xe03b, R.drawable.emoji_1f5fb);
        map.put(0xe03c, R.drawable.emoji_1f3a4);
        map.put(0xe03d, R.drawable.emoji_1f3a5);
        map.put(0xe03e, R.drawable.emoji_1f3b5);
        map.put(0xe03f, R.drawable.emoji_1f511);
        map.put(0xe040, R.drawable.emoji_1f3b7);
        map.put(0xe041, R.drawable.emoji_1f3b8);
        map.put(0xe042, R.drawable.emoji_1f3ba);
        map.put(0xe043, R.drawable.emoji_1f374);
        map.put(0xe044, R.drawable.emoji_1f377);
        map.put(0xe045, R.drawable.emoji_2615);
        map.put(0xe046, R.drawable.emoji_1f370);
        map.put(0xe047, R.drawable.emoji_1f37a);
        map.put(0xe101, R.drawable.emoji_1f4ea);
        map.put(0xe102, R.drawable.emoji_1f4ee);
        map.put(0xe103, R.drawable.emoji_1f4e7);
        map.put(0xe104, R.drawable.emoji_1f4f2);
        map.put(0xe10d, R.drawable.emoji_1f680);
        map.put(0xe10e, R.drawable.emoji_1f451);
        map.put(0xe10f, R.drawable.emoji_1f4a1);
        map.put(0xe112, R.drawable.emoji_1f381);
        map.put(0xe113, R.drawable.emoji_1f52b);
        map.put(0xe114, R.drawable.emoji_1f50d);
        map.put(0xe115, R.drawable.emoji_1f3c3);
        map.put(0xe116, R.drawable.emoji_1f528);
        map.put(0xe11d, R.drawable.emoji_1f525);
        map.put(0xe11e, R.drawable.emoji_1f4bc);
        map.put(0xe11f, R.drawable.emoji_1f4ba);
        map.put(0xe120, R.drawable.emoji_1f354);
        map.put(0xe121, R.drawable.emoji_26f2);
        map.put(0xe122, R.drawable.emoji_26fa);
        map.put(0xe123, R.drawable.emoji_2668);
        map.put(0xe124, R.drawable.emoji_1f3a1);
        map.put(0xe125, R.drawable.emoji_1f3ab);
        map.put(0xe126, R.drawable.emoji_1f4bf);
        map.put(0xe127, R.drawable.emoji_1f4c0);
        map.put(0xe128, R.drawable.emoji_1f4fb);
        map.put(0xe129, R.drawable.emoji_1f4fc);
        map.put(0xe12a, R.drawable.emoji_1f4fa);
        map.put(0xe12b, R.drawable.emoji_1f47e);
        map.put(0xe12c, R.drawable.emoji_303d);
        map.put(0xe12d, R.drawable.emoji_1f004);
        map.put(0xe12f, R.drawable.emoji_1f4b0);
        map.put(0xe130, R.drawable.emoji_1f3af);
        map.put(0xe131, R.drawable.emoji_1f3c6);
        map.put(0xe132, R.drawable.emoji_1f3c1);
        map.put(0xe133, R.drawable.emoji_1f3b0);
        map.put(0xe134, R.drawable.emoji_1f40e);
        map.put(0xe135, R.drawable.emoji_1f6a4);
        map.put(0xe136, R.drawable.emoji_1f6b2);
        map.put(0xe137, R.drawable.emoji_1f6a7);
        map.put(0xe13b, R.drawable.emoji_1f489);
        map.put(0xe13c, R.drawable.emoji_1f4a4);
        map.put(0xe13d, R.drawable.emoji_26a1);
        map.put(0xe13e, R.drawable.emoji_1f460);
        map.put(0xe13f, R.drawable.emoji_1f6c0);
        map.put(0xe140, R.drawable.emoji_1f6bd);
        map.put(0xe141, R.drawable.emoji_1f50a);
        map.put(0xe142, R.drawable.emoji_1f4e2);
        map.put(0xe143, R.drawable.emoji_1f38c);
        map.put(0xe144, R.drawable.emoji_1f50f);
        map.put(0xe145, R.drawable.emoji_1f513);
        map.put(0xe146, R.drawable.emoji_1f306);
        map.put(0xe147, R.drawable.emoji_1f373);
        map.put(0xe148, R.drawable.emoji_1f4c7);
        map.put(0xe14b, R.drawable.emoji_1f4e1);
        map.put(0xe14e, R.drawable.emoji_1f6a5);
        map.put(0xe150, R.drawable.emoji_1f68f);
        map.put(0xe301, R.drawable.emoji_1f4c3);
        map.put(0xe302, R.drawable.emoji_1f454);
        map.put(0xe303, R.drawable.emoji_1f33a);
        map.put(0xe30a, R.drawable.emoji_1f3a7);
        map.put(0xe30b, R.drawable.emoji_1f376);
        map.put(0xe30c, R.drawable.emoji_1f37b);
        map.put(0xe30e, R.drawable.emoji_1f6ac);
        map.put(0xe30f, R.drawable.emoji_1f48a);
        map.put(0xe310, R.drawable.emoji_1f388);
        map.put(0xe311, R.drawable.emoji_1f4a3);
        map.put(0xe312, R.drawable.emoji_1f389);
        map.put(0xe313, R.drawable.emoji_2702);
        map.put(0xe314, R.drawable.emoji_1f380);
        map.put(0xe315, R.drawable.emoji_3299);
        map.put(0xe316, R.drawable.emoji_1f4bd);
        map.put(0xe317, R.drawable.emoji_1f4e3);
        map.put(0xe318, R.drawable.emoji_1f452);
        map.put(0xe319, R.drawable.emoji_1f457);
        map.put(0xe31a, R.drawable.emoji_1f461);
        map.put(0xe31b, R.drawable.emoji_1f462);
        map.put(0xe31c, R.drawable.emoji_1f484);
        map.put(0xe31d, R.drawable.emoji_1f485);
        map.put(0xe31e, R.drawable.emoji_1f486);
        map.put(0xe31f, R.drawable.emoji_1f487);
        map.put(0xe320, R.drawable.emoji_1f488);
        map.put(0xe321, R.drawable.emoji_1f458);
        map.put(0xe322, R.drawable.emoji_1f459);
        map.put(0xe323, R.drawable.emoji_1f45c);
        map.put(0xe324, R.drawable.emoji_1f3ac);
        map.put(0xe325, R.drawable.emoji_1f514);
        map.put(0xe326, R.drawable.emoji_1f3b6);
        map.put(0xe338, R.drawable.emoji_1f375);
        map.put(0xe339, R.drawable.emoji_1f35e);
        map.put(0xe33a, R.drawable.emoji_1f366);
        map.put(0xe33b, R.drawable.emoji_1f35f);
        map.put(0xe33c, R.drawable.emoji_1f361);
        map.put(0xe33d, R.drawable.emoji_1f358);
        map.put(0xe33e, R.drawable.emoji_1f35a);
        map.put(0xe33f, R.drawable.emoji_1f35d);
        map.put(0xe340, R.drawable.emoji_1f35c);
        map.put(0xe341, R.drawable.emoji_1f35b);
        map.put(0xe342, R.drawable.emoji_1f359);
        map.put(0xe343, R.drawable.emoji_1f362);
        map.put(0xe344, R.drawable.emoji_1f363);
        map.put(0xe345, R.drawable.emoji_1f34e);
        map.put(0xe346, R.drawable.emoji_1f34a);
        map.put(0xe347, R.drawable.emoji_1f353);
        map.put(0xe348, R.drawable.emoji_1f349);
        map.put(0xe349, R.drawable.emoji_1f345);
        map.put(0xe34a, R.drawable.emoji_1f346);
        map.put(0xe34b, R.drawable.emoji_1f382);
        map.put(0xe34c, R.drawable.emoji_1f371);
        map.put(0xe34d, R.drawable.emoji_1f372);
        map.put(0xe42a, R.drawable.emoji_1f3c0);
        map.put(0xe42b, R.drawable.emoji_1f3c8);
        map.put(0xe42c, R.drawable.emoji_1f3b1);
        map.put(0xe436, R.drawable.emoji_1f38d);
        map.put(0xe43a, R.drawable.emoji_1f392);
        map.put(0xe43b, R.drawable.emoji_1f38f);
        map.put(0xe43c, R.drawable.emoji_1f302);
        map.put(0xe43e, R.drawable.emoji_1f30a);
        map.put(0xe43f, R.drawable.emoji_1f367);
    }

}
