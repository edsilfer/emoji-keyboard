package br.com.instachat.emojilibrary.model;

import android.util.SparseIntArray;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class Places {
    public static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoint(0x1f3e0),
            Emoji.fromCodePoint(0x1f3e1),
            Emoji.fromCodePoint(0x1f3eb),
            Emoji.fromCodePoint(0x1f3e2),
            Emoji.fromCodePoint(0x1f3e3),
            Emoji.fromCodePoint(0x1f3e5),
            Emoji.fromCodePoint(0x1f3e6),
            Emoji.fromCodePoint(0x1f3ea),
            Emoji.fromCodePoint(0x1f3e9),
            Emoji.fromCodePoint(0x1f3e8),
            Emoji.fromCodePoint(0x1f492),
            Emoji.fromChar((char) 0x26ea),
            Emoji.fromCodePoint(0x1f3ec),
            Emoji.fromCodePoint(0x1f3e4),
            Emoji.fromCodePoint(0x1f307),
            Emoji.fromCodePoint(0x1f306),
            Emoji.fromCodePoint(0x1f3ef),
            Emoji.fromCodePoint(0x1f3f0),
            Emoji.fromChar((char) 0x26fa),
            Emoji.fromCodePoint(0x1f3ed),
            Emoji.fromCodePoint(0x1f5fc),
            Emoji.fromCodePoint(0x1f5fe),
            Emoji.fromCodePoint(0x1f5fb),
            Emoji.fromCodePoint(0x1f304),
            Emoji.fromCodePoint(0x1f305),
            Emoji.fromCodePoint(0x1f303),
            Emoji.fromCodePoint(0x1f5fd),
            Emoji.fromCodePoint(0x1f309),
            Emoji.fromCodePoint(0x1f3a0),
            Emoji.fromCodePoint(0x1f3a1),
            Emoji.fromChar((char) 0x26f2),
            Emoji.fromCodePoint(0x1f3a2),
            Emoji.fromCodePoint(0x1f6a2),
            Emoji.fromChar((char) 0x26f5),
            Emoji.fromCodePoint(0x1f6a4),
            Emoji.fromCodePoint(0x1f6a3),
            Emoji.fromChar((char) 0x2693),
            Emoji.fromCodePoint(0x1f680),
            Emoji.fromChar((char) 0x2708),
            Emoji.fromCodePoint(0x1f4ba),
            Emoji.fromCodePoint(0x1f681),
            Emoji.fromCodePoint(0x1f682),
            Emoji.fromCodePoint(0x1f68a),
            Emoji.fromCodePoint(0x1f689),
            Emoji.fromCodePoint(0x1f69e),
            Emoji.fromCodePoint(0x1f686),
            Emoji.fromCodePoint(0x1f684),
            Emoji.fromCodePoint(0x1f685),
            Emoji.fromCodePoint(0x1f688),
            Emoji.fromCodePoint(0x1f687),
            Emoji.fromCodePoint(0x1f69d),
            Emoji.fromCodePoint(0x1f68b),
            Emoji.fromCodePoint(0x1f683),
            Emoji.fromCodePoint(0x1f68e),
            Emoji.fromCodePoint(0x1f68c),
            Emoji.fromCodePoint(0x1f68d),
            Emoji.fromCodePoint(0x1f699),
            Emoji.fromCodePoint(0x1f698),
            Emoji.fromCodePoint(0x1f697),
            Emoji.fromCodePoint(0x1f695),
            Emoji.fromCodePoint(0x1f696),
            Emoji.fromCodePoint(0x1f69b),
            Emoji.fromCodePoint(0x1f69a),
            Emoji.fromCodePoint(0x1f6a8),
            Emoji.fromCodePoint(0x1f693),
            Emoji.fromCodePoint(0x1f694),
            Emoji.fromCodePoint(0x1f692),
            Emoji.fromCodePoint(0x1f691),
            Emoji.fromCodePoint(0x1f690),
            Emoji.fromCodePoint(0x1f6b2),
            Emoji.fromCodePoint(0x1f6a1),
            Emoji.fromCodePoint(0x1f69f),
            Emoji.fromCodePoint(0x1f6a0),
            Emoji.fromCodePoint(0x1f69c),
            Emoji.fromCodePoint(0x1f488),
            Emoji.fromCodePoint(0x1f68f),
            Emoji.fromCodePoint(0x1f3ab),
            Emoji.fromCodePoint(0x1f6a6),
            Emoji.fromCodePoint(0x1f6a5),
            Emoji.fromChar((char) 0x26a0),
            Emoji.fromCodePoint(0x1f6a7),
            Emoji.fromCodePoint(0x1f530),
            Emoji.fromChar((char) 0x26fd),
            Emoji.fromCodePoint(0x1f3ee),
            Emoji.fromCodePoint(0x1f3b0),
            Emoji.fromChar((char) 0x2668),
            Emoji.fromCodePoint(0x1f5ff),
            Emoji.fromCodePoint(0x1f3aa),
            Emoji.fromCodePoint(0x1f3ad),
            Emoji.fromCodePoint(0x1f4cd),
            Emoji.fromCodePoint(0x1f6a9),
            Emoji.fromString("\ud83c\uddef\ud83c\uddf5"),
            Emoji.fromString("\ud83c\uddf0\ud83c\uddf7"),
            Emoji.fromString("\ud83c\udde9\ud83c\uddea"),
            Emoji.fromString("\ud83c\udde8\ud83c\uddf3"),
            Emoji.fromString("\ud83c\uddfa\ud83c\uddf8"),
            Emoji.fromString("\ud83c\uddeb\ud83c\uddf7"),
            Emoji.fromString("\ud83c\uddea\ud83c\uddf8"),
            Emoji.fromString("\ud83c\uddee\ud83c\uddf9"),
            Emoji.fromString("\ud83c\uddf7\ud83c\uddfa"),
            Emoji.fromString("\ud83c\uddec\ud83c\udde7"),
    };

    public static void bindEmojis(SparseIntArray map) {
        map.put(0x1f3e0, R.drawable.emoji_1f3e0);
        map.put(0x1f3e1, R.drawable.emoji_1f3e1);
        map.put(0x1f3eb, R.drawable.emoji_1f3eb);
        map.put(0x1f3e2, R.drawable.emoji_1f3e2);
        map.put(0x1f3e3, R.drawable.emoji_1f3e3);
        map.put(0x1f3e5, R.drawable.emoji_1f3e5);
        map.put(0x1f3e6, R.drawable.emoji_1f3e6);
        map.put(0x1f3ea, R.drawable.emoji_1f3ea);
        map.put(0x1f3e9, R.drawable.emoji_1f3e9);
        map.put(0x1f3e8, R.drawable.emoji_1f3e8);
        map.put(0x1f492, R.drawable.emoji_1f492);
        map.put(0x26ea, R.drawable.emoji_26ea);
        map.put(0x1f3ec, R.drawable.emoji_1f3ec);
        map.put(0x1f3e4, R.drawable.emoji_1f3e4);
        map.put(0x1f307, R.drawable.emoji_1f307);
        map.put(0x1f306, R.drawable.emoji_1f306);
        map.put(0x1f3ef, R.drawable.emoji_1f3ef);
        map.put(0x1f3f0, R.drawable.emoji_1f3f0);
        map.put(0x26fa, R.drawable.emoji_26fa);
        map.put(0x1f3ed, R.drawable.emoji_1f3ed);
        map.put(0x1f5fc, R.drawable.emoji_1f5fc);
        map.put(0x1f5fe, R.drawable.emoji_1f5fe);
        map.put(0x1f5fb, R.drawable.emoji_1f5fb);
        map.put(0x1f304, R.drawable.emoji_1f304);
        map.put(0x1f305, R.drawable.emoji_1f305);
        map.put(0x1f303, R.drawable.emoji_1f303);
        map.put(0x1f5fd, R.drawable.emoji_1f5fd);
        map.put(0x1f309, R.drawable.emoji_1f309);
        map.put(0x1f3a0, R.drawable.emoji_1f3a0);
        map.put(0x1f3a1, R.drawable.emoji_1f3a1);
        map.put(0x26f2, R.drawable.emoji_26f2);
        map.put(0x1f3a2, R.drawable.emoji_1f3a2);
        map.put(0x1f6a2, R.drawable.emoji_1f6a2);
        map.put(0x26f5, R.drawable.emoji_26f5);
        map.put(0x1f6a4, R.drawable.emoji_1f6a4);
        map.put(0x1f6a3, R.drawable.emoji_1f6a3);
        map.put(0x2693, R.drawable.emoji_2693);
        map.put(0x1f680, R.drawable.emoji_1f680);
        map.put(0x2708, R.drawable.emoji_2708);
        map.put(0x1f4ba, R.drawable.emoji_1f4ba);
        map.put(0x1f681, R.drawable.emoji_1f681);
        map.put(0x1f682, R.drawable.emoji_1f682);
        map.put(0x1f68a, R.drawable.emoji_1f68a);
        map.put(0x1f689, R.drawable.emoji_1f689);
        map.put(0x1f69e, R.drawable.emoji_1f69e);
        map.put(0x1f686, R.drawable.emoji_1f686);
        map.put(0x1f684, R.drawable.emoji_1f684);
        map.put(0x1f685, R.drawable.emoji_1f685);
        map.put(0x1f688, R.drawable.emoji_1f688);
        map.put(0x1f687, R.drawable.emoji_1f687);
        map.put(0x1f69d, R.drawable.emoji_1f69d);
        map.put(0x1f68b, R.drawable.emoji_1f68b);
        // TODO: duplicated emoji
        map.put(0x1f683, R.drawable.emoji_1f683);
        map.put(0x1f68e, R.drawable.emoji_1f68e);
        map.put(0x1f68c, R.drawable.emoji_1f68c);
        map.put(0x1f68d, R.drawable.emoji_1f68d);
        map.put(0x1f699, R.drawable.emoji_1f699);
        map.put(0x1f698, R.drawable.emoji_1f698);
        map.put(0x1f697, R.drawable.emoji_1f697);
        map.put(0x1f695, R.drawable.emoji_1f695);
        map.put(0x1f696, R.drawable.emoji_1f696);
        map.put(0x1f69b, R.drawable.emoji_1f69b);
        map.put(0x1f69a, R.drawable.emoji_1f69a);
        map.put(0x1f6a8, R.drawable.emoji_1f6a8);
        map.put(0x1f693, R.drawable.emoji_1f693);
        map.put(0x1f694, R.drawable.emoji_1f694);
        map.put(0x1f692, R.drawable.emoji_1f692);
        map.put(0x1f691, R.drawable.emoji_1f691);
        map.put(0x1f690, R.drawable.emoji_1f690);
        map.put(0x1f6b2, R.drawable.emoji_1f6b2);
        map.put(0x1f6a1, R.drawable.emoji_1f6a1);
        map.put(0x1f69f, R.drawable.emoji_1f69f);
        map.put(0x1f6a0, R.drawable.emoji_1f6a0);
        map.put(0x1f69c, R.drawable.emoji_1f69c);
        map.put(0x1f488, R.drawable.emoji_1f488);
        map.put(0x1f68f, R.drawable.emoji_1f68f);
        map.put(0x1f3ab, R.drawable.emoji_1f3ab);
        map.put(0x1f6a6, R.drawable.emoji_1f6a6);
        map.put(0x1f6a5, R.drawable.emoji_1f6a5);
        map.put(0x26a0, R.drawable.emoji_26a0);
        map.put(0x1f6a7, R.drawable.emoji_1f6a7);
        map.put(0x1f530, R.drawable.emoji_1f530);
        map.put(0x26fd, R.drawable.emoji_26fd);
        map.put(0x1f3ee, R.drawable.emoji_1f3ee);
        map.put(0x1f3b0, R.drawable.emoji_1f3b0);
        map.put(0x2668, R.drawable.emoji_2668);
        map.put(0x1f5ff, R.drawable.emoji_1f5ff);
        map.put(0x1f3aa, R.drawable.emoji_1f3aa);
        map.put(0x1f3ad, R.drawable.emoji_1f3ad);
        map.put(0x1f4cd, R.drawable.emoji_1f4cd);
        map.put(0x1f6a9, R.drawable.emoji_1f6a9);
        map.put(0x1f5fa, R.drawable.emoji_1f5fa);
        map.put(0x1f3d4, R.drawable.emoji_1f3d4);
        map.put(0x26f0, R.drawable.emoji_26f0);
        map.put(0x1f3d5, R.drawable.emoji_1f3d5);
        map.put(0x1f3d6, R.drawable.emoji_1f3d6);
        map.put(0x1f3dc, R.drawable.emoji_1f3dc);
        map.put(0x1f3dd, R.drawable.emoji_1f3dd);
        map.put(0x1f3de, R.drawable.emoji_1f3de);
        map.put(0x1f3df, R.drawable.emoji_1f3df);
        map.put(0x1f3db, R.drawable.emoji_1f3db);
        map.put(0x1f3d7, R.drawable.emoji_1f3d7);
        map.put(0x1f3d8, R.drawable.emoji_1f3d8);
        map.put(0x1f3d9, R.drawable.emoji_1f3d9);
        map.put(0x1f3da, R.drawable.emoji_1f3da);
        map.put(0x1f6d0, R.drawable.emoji_1f6d0);
        map.put(0x1f54b, R.drawable.emoji_1f54b);
        map.put(0x1f54c, R.drawable.emoji_1f54c);
        map.put(0x1f54d, R.drawable.emoji_1f54d);

    }

    public static void bindSoftBankEmojis(SparseIntArray map) {
        map.put(0xe448, R.drawable.emoji_1f385);
        map.put(0xe449, R.drawable.emoji_1f305);
        map.put(0xe44a, R.drawable.emoji_1f307);
        map.put(0xe44b, R.drawable.emoji_1f303);
        map.put(0xe44b, R.drawable.emoji_1f30c);
        map.put(0xe44c, R.drawable.emoji_1f308);
        map.put(0xe501, R.drawable.emoji_1f3e9);
        map.put(0xe502, R.drawable.emoji_1f3a8);
        map.put(0xe503, R.drawable.emoji_1f3a9);
        map.put(0xe504, R.drawable.emoji_1f3ec);
        map.put(0xe505, R.drawable.emoji_1f3ef);
        map.put(0xe506, R.drawable.emoji_1f3f0);
        map.put(0xe507, R.drawable.emoji_1f3a6);
        map.put(0xe508, R.drawable.emoji_1f3ed);
        map.put(0xe509, R.drawable.emoji_1f5fc);
        map.put(0xe50b, R.drawable.emoji_1f1ef_1f1f5);
        map.put(0xe50c, R.drawable.emoji_1f1fa_1f1f8);
        map.put(0xe50d, R.drawable.emoji_1f1eb_1f1f7);
        map.put(0xe50e, R.drawable.emoji_1f1e9_1f1ea);
        map.put(0xe50f, R.drawable.emoji_1f1ee_1f1f9);
        map.put(0xe510, R.drawable.emoji_1f1ec_1f1e7);
        map.put(0xe511, R.drawable.emoji_1f1ea_1f1f8);
        map.put(0xe512, R.drawable.emoji_1f1f7_1f1fa);
        map.put(0xe513, R.drawable.emoji_1f1e8_1f1f3);
        map.put(0xe514, R.drawable.emoji_1f1f0_1f1f7);
        map.put(0xe42d, R.drawable.emoji_1f3ca);
        map.put(0xe42e, R.drawable.emoji_1f699);
        map.put(0xe42f, R.drawable.emoji_1f69a);
        map.put(0xe430, R.drawable.emoji_1f692);
        map.put(0xe431, R.drawable.emoji_1f691);
        map.put(0xe432, R.drawable.emoji_1f693);
        map.put(0xe433, R.drawable.emoji_1f3a2);
        map.put(0xe434, R.drawable.emoji_1f687);
        map.put(0xe435, R.drawable.emoji_1f684);
        map.put(0xe43d, R.drawable.emoji_1f492);
        map.put(0xe036, R.drawable.emoji_1f3e0);
        map.put(0xe037, R.drawable.emoji_26ea);
        map.put(0xe038, R.drawable.emoji_1f3e2);
        map.put(0xe01b, R.drawable.emoji_1f697);
        map.put(0xe01c, R.drawable.emoji_26f5);
        map.put(0xe01d, R.drawable.emoji_2708);
        map.put(0xe01e, R.drawable.emoji_1f683);
        map.put(0xe01f, R.drawable.emoji_1f685);
        map.put(0xe013, R.drawable.emoji_1f3bf);
        map.put(0xe014, R.drawable.emoji_26f3);
        map.put(0xe005, R.drawable.emoji_1f469);
        map.put(0xe14d, R.drawable.emoji_1f3e6);
        map.put(0xe153, R.drawable.emoji_1f3e3);
        map.put(0xe155, R.drawable.emoji_1f3e5);
        map.put(0xe156, R.drawable.emoji_1f3ea);
        map.put(0xe157, R.drawable.emoji_1f3eb);
        map.put(0xe158, R.drawable.emoji_1f3e8);
        map.put(0xe159, R.drawable.emoji_1f68c);
        map.put(0xe15a, R.drawable.emoji_1f695);
        map.put(0xe201, R.drawable.emoji_1f6b6);
        map.put(0xe202, R.drawable.emoji_1f6a2);
    }
}

