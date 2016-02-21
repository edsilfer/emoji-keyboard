package br.com.instachat.emojilibrary.model;

import android.util.SparseIntArray;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class Symbols {
    public static final Emoji[] DATA = new Emoji[]{
            Emoji.fromString("\u0031\u20e3"),
            Emoji.fromString("\u0032\u20e3"),
            Emoji.fromString("\u0033\u20e3"),
            Emoji.fromString("\u0034\u20e3"),
            Emoji.fromString("\u0035\u20e3"),
            Emoji.fromString("\u0036\u20e3"),
            Emoji.fromString("\u0037\u20e3"),
            Emoji.fromString("\u0038\u20e3"),
            Emoji.fromString("\u0039\u20e3"),
            Emoji.fromString("\u0030\u20e3"),
            Emoji.fromCodePoint(0x1f51f),
            Emoji.fromCodePoint(0x1f522),
            Emoji.fromString("\u0023\u20e3"),
            Emoji.fromCodePoint(0x1f523),
            Emoji.fromChar((char) 0x2b06),
            Emoji.fromChar((char) 0x2b07),
            Emoji.fromChar((char) 0x2b05),
            Emoji.fromChar((char) 0x27a1),
            Emoji.fromCodePoint(0x1f520),
            Emoji.fromCodePoint(0x1f521),
            Emoji.fromCodePoint(0x1f524),
            Emoji.fromChar((char) 0x2197),
            Emoji.fromChar((char) 0x2196),
            Emoji.fromChar((char) 0x2198),
            Emoji.fromChar((char) 0x2199),
            Emoji.fromChar((char) 0x2194),
            Emoji.fromChar((char) 0x2195),
            Emoji.fromCodePoint(0x1f504),
            Emoji.fromChar((char) 0x25c0),
            Emoji.fromChar((char) 0x25b6),
            Emoji.fromCodePoint(0x1f53c),
            Emoji.fromCodePoint(0x1f53d),
            Emoji.fromChar((char) 0x21a9),
            Emoji.fromChar((char) 0x21aa),
            Emoji.fromChar((char) 0x2139),
            Emoji.fromChar((char) 0x23ea),
            Emoji.fromChar((char) 0x23e9),
            Emoji.fromChar((char) 0x23eb),
            Emoji.fromChar((char) 0x23ec),
            Emoji.fromChar((char) 0x2935),
            Emoji.fromChar((char) 0x2934),
            Emoji.fromCodePoint(0x1f197),
            Emoji.fromCodePoint(0x1f500),
            Emoji.fromCodePoint(0x1f501),
            Emoji.fromCodePoint(0x1f502),
            Emoji.fromCodePoint(0x1f195),
            Emoji.fromCodePoint(0x1f199),
            Emoji.fromCodePoint(0x1f192),
            Emoji.fromCodePoint(0x1f193),
            Emoji.fromCodePoint(0x1f196),
            Emoji.fromCodePoint(0x1f4f6),
            Emoji.fromCodePoint(0x1f3a6),
            Emoji.fromCodePoint(0x1f201),
            Emoji.fromCodePoint(0x1f22f),
            Emoji.fromCodePoint(0x1f233),
            Emoji.fromCodePoint(0x1f235),
            Emoji.fromCodePoint(0x1f234),
            Emoji.fromCodePoint(0x1f232),
            Emoji.fromCodePoint(0x1f250),
            Emoji.fromCodePoint(0x1f239),
            Emoji.fromCodePoint(0x1f23a),
            Emoji.fromCodePoint(0x1f236),
            Emoji.fromCodePoint(0x1f21a),
            Emoji.fromCodePoint(0x1f6bb),
            Emoji.fromCodePoint(0x1f6b9),
            Emoji.fromCodePoint(0x1f6ba),
            Emoji.fromCodePoint(0x1f6bc),
            Emoji.fromCodePoint(0x1f6be),
            Emoji.fromCodePoint(0x1f6b0),
            Emoji.fromCodePoint(0x1f6ae),
            Emoji.fromCodePoint(0x1f17f),
            Emoji.fromChar((char) 0x267f),
            Emoji.fromCodePoint(0x1f6ad),
            Emoji.fromCodePoint(0x1f237),
            Emoji.fromCodePoint(0x1f238),
            Emoji.fromCodePoint(0x1f202),
            Emoji.fromChar((char) 0x24c2),
            Emoji.fromCodePoint(0x1f6c2),
            Emoji.fromCodePoint(0x1f6c4),
            Emoji.fromCodePoint(0x1f6c5),
            Emoji.fromCodePoint(0x1f6c3),
            Emoji.fromCodePoint(0x1f251),
            Emoji.fromChar((char) 0x3299),
            Emoji.fromChar((char) 0x3297),
            Emoji.fromCodePoint(0x1f191),
            Emoji.fromCodePoint(0x1f198),
            Emoji.fromCodePoint(0x1f194),
            Emoji.fromCodePoint(0x1f6ab),
            Emoji.fromCodePoint(0x1f51e),
            Emoji.fromCodePoint(0x1f4f5),
            Emoji.fromCodePoint(0x1f6af),
            Emoji.fromCodePoint(0x1f6b1),
            Emoji.fromCodePoint(0x1f6b3),
            Emoji.fromCodePoint(0x1f6b7),
            Emoji.fromCodePoint(0x1f6b8),
            Emoji.fromChar((char) 0x26d4),
            Emoji.fromChar((char) 0x2733),
            Emoji.fromChar((char) 0x2747),
            Emoji.fromChar((char) 0x274e),
            Emoji.fromChar((char) 0x2705),
            Emoji.fromChar((char) 0x2734),
            Emoji.fromCodePoint(0x1f49f),
            Emoji.fromCodePoint(0x1f19a),
            Emoji.fromCodePoint(0x1f4f3),
            Emoji.fromCodePoint(0x1f4f4),
            Emoji.fromCodePoint(0x1f170),
            Emoji.fromCodePoint(0x1f171),
            Emoji.fromCodePoint(0x1f18e),
            Emoji.fromCodePoint(0x1f17e),
            Emoji.fromCodePoint(0x1f4a0),
            Emoji.fromChar((char) 0x27bf),
            Emoji.fromChar((char) 0x267b),
            Emoji.fromChar((char) 0x2648),
            Emoji.fromChar((char) 0x2649),
            Emoji.fromChar((char) 0x264a),
            Emoji.fromChar((char) 0x264b),
            Emoji.fromChar((char) 0x264c),
            Emoji.fromChar((char) 0x264d),
            Emoji.fromChar((char) 0x264e),
            Emoji.fromChar((char) 0x264f),
            Emoji.fromChar((char) 0x2650),
            Emoji.fromChar((char) 0x2651),
            Emoji.fromChar((char) 0x2652),
            Emoji.fromChar((char) 0x2653),
            Emoji.fromChar((char) 0x26ce),
            Emoji.fromCodePoint(0x1f52f),
            Emoji.fromCodePoint(0x1f3e7),
            Emoji.fromCodePoint(0x1f4b9),
            Emoji.fromCodePoint(0x1f4b2),
            Emoji.fromCodePoint(0x1f4b1),
            Emoji.fromChar((char) 0xe24e),
            Emoji.fromChar((char) 0xe24f),
            Emoji.fromChar((char) 0x2122),
            Emoji.fromChar((char) 0x274c),
            Emoji.fromChar((char) 0x203c),
            Emoji.fromChar((char) 0x2049),
            Emoji.fromChar((char) 0x2757),
            Emoji.fromChar((char) 0x2753),
            Emoji.fromChar((char) 0x2755),
            Emoji.fromChar((char) 0x2754),
            Emoji.fromChar((char) 0x2b55),
            Emoji.fromCodePoint(0x1f51d),
            Emoji.fromCodePoint(0x1f51a),
            Emoji.fromCodePoint(0x1f519),
            Emoji.fromCodePoint(0x1f51b),
            Emoji.fromCodePoint(0x1f51c),
            Emoji.fromCodePoint(0x1f503),
            Emoji.fromCodePoint(0x1f55b),
            Emoji.fromCodePoint(0x1f567),
            Emoji.fromCodePoint(0x1f550),
            Emoji.fromCodePoint(0x1f55c),
            Emoji.fromCodePoint(0x1f551),
            Emoji.fromCodePoint(0x1f55d),
            Emoji.fromCodePoint(0x1f552),
            Emoji.fromCodePoint(0x1f55e),
            Emoji.fromCodePoint(0x1f553),
            Emoji.fromCodePoint(0x1f55f),
            Emoji.fromCodePoint(0x1f554),
            Emoji.fromCodePoint(0x1f560),
            Emoji.fromCodePoint(0x1f555),
            Emoji.fromCodePoint(0x1f556),
            Emoji.fromCodePoint(0x1f557),
            Emoji.fromCodePoint(0x1f558),
            Emoji.fromCodePoint(0x1f559),
            Emoji.fromCodePoint(0x1f55a),
            Emoji.fromCodePoint(0x1f561),
            Emoji.fromCodePoint(0x1f562),
            Emoji.fromCodePoint(0x1f563),
            Emoji.fromCodePoint(0x1f564),
            Emoji.fromCodePoint(0x1f565),
            Emoji.fromCodePoint(0x1f566),
            Emoji.fromChar((char) 0x2716),
            Emoji.fromChar((char) 0x2795),
            Emoji.fromChar((char) 0x2796),
            Emoji.fromChar((char) 0x2797),
            Emoji.fromChar((char) 0x2660),
            Emoji.fromChar((char) 0x2665),
            Emoji.fromChar((char) 0x2663),
            Emoji.fromChar((char) 0x2666),
            Emoji.fromCodePoint(0x1f4ae),
            Emoji.fromCodePoint(0x1f4af),
            Emoji.fromChar((char) 0x2714),
            Emoji.fromChar((char) 0x2611),
            Emoji.fromCodePoint(0x1f518),
            Emoji.fromCodePoint(0x1f517),
            Emoji.fromChar((char) 0x27b0),
            Emoji.fromChar((char) 0x3030),
            Emoji.fromChar((char) 0x303d),
            Emoji.fromCodePoint(0x1f531),
            Emoji.fromChar((char) 0x25fc),
            Emoji.fromChar((char) 0x25fb),
            Emoji.fromChar((char) 0x25fe),
            Emoji.fromChar((char) 0x25fd),
            Emoji.fromChar((char) 0x25aa),
            Emoji.fromChar((char) 0x25ab),
            Emoji.fromCodePoint(0x1f53a),
            Emoji.fromCodePoint(0x1f532),
            Emoji.fromCodePoint(0x1f533),
            Emoji.fromChar((char) 0x26ab),
            Emoji.fromChar((char) 0x26aa),
            Emoji.fromCodePoint(0x1f534),
            Emoji.fromCodePoint(0x1f535),
            Emoji.fromCodePoint(0x1f53b),
            Emoji.fromChar((char) 0x2b1c),
            Emoji.fromChar((char) 0x2b1b),
            Emoji.fromCodePoint(0x1f536),
            Emoji.fromCodePoint(0x1f537),
            Emoji.fromCodePoint(0x1f538),
            Emoji.fromCodePoint(0x1f539),
    };

    public static void bindEmojis(SparseIntArray map) {
        map.put(0x1f51f, R.drawable.emoji_1f51f);
        map.put(0x1f522, R.drawable.emoji_1f522);
        map.put(0x1f523, R.drawable.emoji_1f523);
        map.put(0x2b06, R.drawable.emoji_2b06);
        map.put(0x2b07, R.drawable.emoji_2b07);
        map.put(0x2b05, R.drawable.emoji_2b05);
        map.put(0x27a1, R.drawable.emoji_27a1);
        map.put(0x1f520, R.drawable.emoji_1f520);
        map.put(0x1f521, R.drawable.emoji_1f521);
        map.put(0x1f524, R.drawable.emoji_1f524);
        map.put(0x2197, R.drawable.emoji_2197);
        map.put(0x2196, R.drawable.emoji_2196);
        map.put(0x2198, R.drawable.emoji_2198);
        map.put(0x2199, R.drawable.emoji_2199);
        map.put(0x2194, R.drawable.emoji_2194);
        map.put(0x2195, R.drawable.emoji_2195);
        map.put(0x1f504, R.drawable.emoji_1f504);
        map.put(0x25c0, R.drawable.emoji_25c0);
        map.put(0x25b6, R.drawable.emoji_25b6);
        map.put(0x1f53c, R.drawable.emoji_1f53c);
        map.put(0x1f53d, R.drawable.emoji_1f53d);
        map.put(0x21a9, R.drawable.emoji_21a9);
        map.put(0x21aa, R.drawable.emoji_21aa);
        map.put(0x2139, R.drawable.emoji_2139);
        map.put(0x23ea, R.drawable.emoji_23ea);
        map.put(0x23e9, R.drawable.emoji_23e9);
        map.put(0x23eb, R.drawable.emoji_23eb);
        map.put(0x23ec, R.drawable.emoji_23ec);
        map.put(0x2935, R.drawable.emoji_2935);
        map.put(0x2934, R.drawable.emoji_2934);
        map.put(0x1f197, R.drawable.emoji_1f197);
        map.put(0x1f500, R.drawable.emoji_1f500);
        map.put(0x1f501, R.drawable.emoji_1f501);
        map.put(0x1f502, R.drawable.emoji_1f502);
        map.put(0x1f195, R.drawable.emoji_1f195);
        map.put(0x1f199, R.drawable.emoji_1f199);
        map.put(0x1f192, R.drawable.emoji_1f192);
        map.put(0x1f193, R.drawable.emoji_1f193);
        map.put(0x1f196, R.drawable.emoji_1f196);
        map.put(0x1f4f6, R.drawable.emoji_1f4f6);
        map.put(0x1f3a6, R.drawable.emoji_1f3a6);
        map.put(0x1f201, R.drawable.emoji_1f201);
        map.put(0x1f22f, R.drawable.emoji_1f22f);
        map.put(0x1f233, R.drawable.emoji_1f233);
        map.put(0x1f235, R.drawable.emoji_1f235);
        map.put(0x1f234, R.drawable.emoji_1f234);
        map.put(0x1f232, R.drawable.emoji_1f232);
        map.put(0x1f250, R.drawable.emoji_1f250);
        map.put(0x1f239, R.drawable.emoji_1f239);
        map.put(0x1f23a, R.drawable.emoji_1f23a);
        map.put(0x1f236, R.drawable.emoji_1f236);
        map.put(0x1f21a, R.drawable.emoji_1f21a);
        map.put(0x1f6bb, R.drawable.emoji_1f6bb);
        map.put(0x1f6b9, R.drawable.emoji_1f6b9);
        map.put(0x1f6ba, R.drawable.emoji_1f6ba);
        map.put(0x1f6bc, R.drawable.emoji_1f6bc);
        map.put(0x1f6be, R.drawable.emoji_1f6be);
        map.put(0x1f6b0, R.drawable.emoji_1f6b0);
        map.put(0x1f6ae, R.drawable.emoji_1f6ae);
        map.put(0x1f17f, R.drawable.emoji_1f17f);
        map.put(0x267f, R.drawable.emoji_267f);
        map.put(0x1f6ad, R.drawable.emoji_1f6ad);
        map.put(0x1f237, R.drawable.emoji_1f237);
        map.put(0x1f238, R.drawable.emoji_1f238);
        map.put(0x1f202, R.drawable.emoji_1f202);
        map.put(0x24c2, R.drawable.emoji_24c2);
        map.put(0x1f6c2, R.drawable.emoji_1f6c2);
        map.put(0x1f6c4, R.drawable.emoji_1f6c4);
        map.put(0x1f6c5, R.drawable.emoji_1f6c5);
        map.put(0x1f6c3, R.drawable.emoji_1f6c3);
        map.put(0x1f251, R.drawable.emoji_1f251);
        map.put(0x3299, R.drawable.emoji_3299);
        map.put(0x3297, R.drawable.emoji_3297);
        map.put(0x1f191, R.drawable.emoji_1f191);
        map.put(0x1f198, R.drawable.emoji_1f198);
        map.put(0x1f194, R.drawable.emoji_1f194);
        map.put(0x1f6ab, R.drawable.emoji_1f6ab);
        map.put(0x1f51e, R.drawable.emoji_1f51e);
        map.put(0x1f4f5, R.drawable.emoji_1f4f5);
        map.put(0x1f6af, R.drawable.emoji_1f6af);
        map.put(0x1f6b1, R.drawable.emoji_1f6b1);
        map.put(0x1f6b3, R.drawable.emoji_1f6b3);
        map.put(0x1f6b7, R.drawable.emoji_1f6b7);
        map.put(0x1f6b8, R.drawable.emoji_1f6b8);
        map.put(0x26d4, R.drawable.emoji_26d4);
        map.put(0x2733, R.drawable.emoji_2733);
        map.put(0x2747, R.drawable.emoji_2747);
        map.put(0x274e, R.drawable.emoji_274e);
        map.put(0x2705, R.drawable.emoji_2705);
        map.put(0x2734, R.drawable.emoji_2734);
        map.put(0x1f49f, R.drawable.emoji_1f49f);
        map.put(0x1f19a, R.drawable.emoji_1f19a);
        map.put(0x1f4f3, R.drawable.emoji_1f4f3);
        map.put(0x1f4f4, R.drawable.emoji_1f4f4);
        map.put(0x1f170, R.drawable.emoji_1f170);
        map.put(0x1f171, R.drawable.emoji_1f171);
        map.put(0x1f18e, R.drawable.emoji_1f18e);
        map.put(0x1f17e, R.drawable.emoji_1f17e);
        map.put(0x1f4a0, R.drawable.emoji_1f4a0);
        map.put(0x27bf, R.drawable.emoji_27bf);
        map.put(0x267b, R.drawable.emoji_267b);
        map.put(0x2648, R.drawable.emoji_2648);
        map.put(0x2649, R.drawable.emoji_2649);
        map.put(0x264a, R.drawable.emoji_264a);
        map.put(0x264b, R.drawable.emoji_264b);
        map.put(0x264c, R.drawable.emoji_264c);
        map.put(0x264d, R.drawable.emoji_264d);
        map.put(0x264e, R.drawable.emoji_264e);
        map.put(0x264f, R.drawable.emoji_264f);
        map.put(0x2650, R.drawable.emoji_2650);
        map.put(0x2651, R.drawable.emoji_2651);
        map.put(0x2652, R.drawable.emoji_2652);
        map.put(0x2653, R.drawable.emoji_2653);
        map.put(0x26ce, R.drawable.emoji_26ce);
        map.put(0x1f52f, R.drawable.emoji_1f52f);
        map.put(0x1f3e7, R.drawable.emoji_1f3e7);
        map.put(0x1f4b9, R.drawable.emoji_1f4b9);
        map.put(0x1f4b2, R.drawable.emoji_1f4b2);
        map.put(0x1f4b1, R.drawable.emoji_1f4b1);
        map.put(0x00a9, R.drawable.emoji_00a9);
        map.put(0x00ae, R.drawable.emoji_00ae);
        map.put(0x2122, R.drawable.emoji_2122);
        map.put(0x274c, R.drawable.emoji_274c);
        map.put(0x203c, R.drawable.emoji_203c);
        map.put(0x2049, R.drawable.emoji_2049);
        map.put(0x2757, R.drawable.emoji_2757);
        map.put(0x2753, R.drawable.emoji_2753);
        map.put(0x2755, R.drawable.emoji_2755);
        map.put(0x2754, R.drawable.emoji_2754);
        map.put(0x2b55, R.drawable.emoji_2b55);
        map.put(0x1f51d, R.drawable.emoji_1f51d);
        map.put(0x1f51a, R.drawable.emoji_1f51a);
        map.put(0x1f519, R.drawable.emoji_1f519);
        map.put(0x1f51b, R.drawable.emoji_1f51b);
        map.put(0x1f51c, R.drawable.emoji_1f51c);
        map.put(0x1f503, R.drawable.emoji_1f503);
        map.put(0x1f55b, R.drawable.emoji_1f55b);
        map.put(0x1f567, R.drawable.emoji_1f567);
        map.put(0x1f550, R.drawable.emoji_1f550);
        map.put(0x1f55c, R.drawable.emoji_1f55c);
        map.put(0x1f551, R.drawable.emoji_1f551);
        map.put(0x1f55d, R.drawable.emoji_1f55d);
        map.put(0x1f552, R.drawable.emoji_1f552);
        map.put(0x1f55e, R.drawable.emoji_1f55e);
        map.put(0x1f553, R.drawable.emoji_1f553);
        map.put(0x1f55f, R.drawable.emoji_1f55f);
        map.put(0x1f554, R.drawable.emoji_1f554);
        map.put(0x1f560, R.drawable.emoji_1f560);
        map.put(0x1f555, R.drawable.emoji_1f555);
        map.put(0x1f556, R.drawable.emoji_1f556);
        map.put(0x1f557, R.drawable.emoji_1f557);
        map.put(0x1f558, R.drawable.emoji_1f558);
        map.put(0x1f559, R.drawable.emoji_1f559);
        map.put(0x1f55a, R.drawable.emoji_1f55a);
        map.put(0x1f561, R.drawable.emoji_1f561);
        map.put(0x1f562, R.drawable.emoji_1f562);
        map.put(0x1f563, R.drawable.emoji_1f563);
        map.put(0x1f564, R.drawable.emoji_1f564);
        map.put(0x1f565, R.drawable.emoji_1f565);
        map.put(0x1f566, R.drawable.emoji_1f566);
        map.put(0x269b, R.drawable.emoji_269b);
        map.put(0x1f549, R.drawable.emoji_1f549);
        map.put(0x2721, R.drawable.emoji_2721);
        map.put(0x2638, R.drawable.emoji_2638);
        map.put(0x262f, R.drawable.emoji_262f);
        map.put(0x271d, R.drawable.emoji_271d);
        map.put(0x2626, R.drawable.emoji_2626);
        map.put(0x26e9, R.drawable.emoji_26e9);
        map.put(0x262a, R.drawable.emoji_262a);
        map.put(0x262e, R.drawable.emoji_262e);
        map.put(0x2622, R.drawable.emoji_2622);
        map.put(0x2623, R.drawable.emoji_2623);
        map.put(0x1f5e8, R.drawable.emoji_1f5e8);
        map.put(0x23ed, R.drawable.emoji_23ed);
        map.put(0x23ef, R.drawable.emoji_23ef);
        map.put(0x23ee, R.drawable.emoji_23ee);
        map.put(0x23f8, R.drawable.emoji_23f8);
        map.put(0x23f9, R.drawable.emoji_23f9);
        map.put(0x23fa, R.drawable.emoji_23fa);
        map.put(0x2716, R.drawable.emoji_2716);
        map.put(0x2795, R.drawable.emoji_2795);
        map.put(0x2796, R.drawable.emoji_2796);
        map.put(0x2797, R.drawable.emoji_2797);
        map.put(0x2660, R.drawable.emoji_2660);
        map.put(0x2665, R.drawable.emoji_2665);
        map.put(0x2663, R.drawable.emoji_2663);
        map.put(0x2666, R.drawable.emoji_2666);
        map.put(0x1f4ae, R.drawable.emoji_1f4ae);
        map.put(0x1f4af, R.drawable.emoji_1f4af);
        map.put(0x2714, R.drawable.emoji_2714);
        map.put(0x2611, R.drawable.emoji_2611);
        map.put(0x1f518, R.drawable.emoji_1f518);
        map.put(0x1f517, R.drawable.emoji_1f517);
        map.put(0x27b0, R.drawable.emoji_27b0);
        map.put(0x3030, R.drawable.emoji_3030);
        map.put(0x303d, R.drawable.emoji_303d);
        map.put(0x1f531, R.drawable.emoji_1f531);
        map.put(0x25fc, R.drawable.emoji_25fc);
        map.put(0x25fb, R.drawable.emoji_25fb);
        map.put(0x25fe, R.drawable.emoji_25fe);
        map.put(0x25fd, R.drawable.emoji_25fd);
        map.put(0x25aa, R.drawable.emoji_25aa);
        map.put(0x25ab, R.drawable.emoji_25ab);
        map.put(0x1f53a, R.drawable.emoji_1f53a);
        map.put(0x1f532, R.drawable.emoji_1f532);
        map.put(0x1f533, R.drawable.emoji_1f533);
        map.put(0x26ab, R.drawable.emoji_26ab);
        map.put(0x26aa, R.drawable.emoji_26aa);
        map.put(0x1f534, R.drawable.emoji_1f534);
        map.put(0x1f535, R.drawable.emoji_1f535);
        map.put(0x1f53b, R.drawable.emoji_1f53b);
        map.put(0x2b1c, R.drawable.emoji_2b1c);
        map.put(0x2b1b, R.drawable.emoji_2b1b);
        map.put(0x1f536, R.drawable.emoji_1f536);
        map.put(0x1f537, R.drawable.emoji_1f537);
        map.put(0x1f538, R.drawable.emoji_1f538);
        map.put(0x1f539, R.drawable.emoji_1f539);
    }

    public static void bindSoftBankEmojis(SparseIntArray map) {
        map.put(0xe024, R.drawable.emoji_1f550);
        map.put(0xe025, R.drawable.emoji_1f551);
        map.put(0xe026, R.drawable.emoji_1f552);
        map.put(0xe027, R.drawable.emoji_1f553);
        map.put(0xe028, R.drawable.emoji_1f554);
        map.put(0xe029, R.drawable.emoji_1f555);
        map.put(0xe02a, R.drawable.emoji_1f556);
        map.put(0xe02b, R.drawable.emoji_1f557);
        map.put(0xe02c, R.drawable.emoji_1f558);
        map.put(0xe02d, R.drawable.emoji_1f559);
        map.put(0xe02e, R.drawable.emoji_1f55a);
        map.put(0xe02f, R.drawable.emoji_1f55b);
        map.put(0xe020, R.drawable.emoji_2753);
        map.put(0xe021, R.drawable.emoji_2757);
        map.put(0xe12e, R.drawable.emoji_1f19a);
        map.put(0xe138, R.drawable.emoji_1f6b9);
        map.put(0xe139, R.drawable.emoji_1f6ba);
        map.put(0xe13a, R.drawable.emoji_1f6bc);
        map.put(0xe149, R.drawable.emoji_1f4b1);
        map.put(0xe14a, R.drawable.emoji_1f4b9);
        map.put(0xe14f, R.drawable.emoji_1f17f);
        map.put(0xe151, R.drawable.emoji_1f6bb);
        map.put(0xe152, R.drawable.emoji_1f46e);
        map.put(0xe154, R.drawable.emoji_1f3e7);
        map.put(0xe203, R.drawable.emoji_1f201);
        map.put(0xe204, R.drawable.emoji_1f49f);
        map.put(0xe205, R.drawable.emoji_2734);
        map.put(0xe206, R.drawable.emoji_2733);
        map.put(0xe207, R.drawable.emoji_1f51e);
        map.put(0xe208, R.drawable.emoji_1f6ad);
        map.put(0xe209, R.drawable.emoji_1f530);
        map.put(0xe20a, R.drawable.emoji_267f);
        map.put(0xe20b, R.drawable.emoji_1f4f6);
        map.put(0xe20c, R.drawable.emoji_2665);
        map.put(0xe20d, R.drawable.emoji_2666);
        map.put(0xe20e, R.drawable.emoji_2660);
        map.put(0xe20f, R.drawable.emoji_2663);
        map.put(0xe210, R.drawable.emoji_0023);
        map.put(0xe211, R.drawable.emoji_27bf);
        map.put(0xe212, R.drawable.emoji_1f195);
        map.put(0xe213, R.drawable.emoji_1f199);
        map.put(0xe214, R.drawable.emoji_1f192);
        map.put(0xe215, R.drawable.emoji_1f236);
        map.put(0xe216, R.drawable.emoji_1f21a);
        map.put(0xe217, R.drawable.emoji_1f237);
        map.put(0xe218, R.drawable.emoji_1f238);
        map.put(0xe219, R.drawable.emoji_1f534);
        map.put(0xe21a, R.drawable.emoji_1f532);
        map.put(0xe21b, R.drawable.emoji_1f533);
        map.put(0xe21c, R.drawable.emoji_0031);
        map.put(0xe21d, R.drawable.emoji_0032);
        map.put(0xe21e, R.drawable.emoji_0033);
        map.put(0xe21f, R.drawable.emoji_0034);
        map.put(0xe220, R.drawable.emoji_0035);
        map.put(0xe221, R.drawable.emoji_0036);
        map.put(0xe222, R.drawable.emoji_0037);
        map.put(0xe223, R.drawable.emoji_0038);
        map.put(0xe224, R.drawable.emoji_0039);
        map.put(0xe225, R.drawable.emoji_0030);
        map.put(0xe226, R.drawable.emoji_1f250);
        map.put(0xe227, R.drawable.emoji_1f239);
        map.put(0xe228, R.drawable.emoji_1f202);
        map.put(0xe229, R.drawable.emoji_1f194);
        map.put(0xe22a, R.drawable.emoji_1f235);
        map.put(0xe22b, R.drawable.emoji_1f233);
        map.put(0xe22c, R.drawable.emoji_1f22f);
        map.put(0xe22d, R.drawable.emoji_1f23a);
        map.put(0xe232, R.drawable.emoji_2b06);
        map.put(0xe233, R.drawable.emoji_2b07);
        map.put(0xe234, R.drawable.emoji_27a1);
        map.put(0xe235, R.drawable.emoji_1f519);
        map.put(0xe236, R.drawable.emoji_2197);
        map.put(0xe237, R.drawable.emoji_2196);
        map.put(0xe238, R.drawable.emoji_2198);
        map.put(0xe239, R.drawable.emoji_2199);
        map.put(0xe23a, R.drawable.emoji_25b6);
        map.put(0xe23b, R.drawable.emoji_25c0);
        map.put(0xe23c, R.drawable.emoji_23e9);
        map.put(0xe23d, R.drawable.emoji_23ea);
        map.put(0xe23e, R.drawable.emoji_1f52e);
        map.put(0xe23f, R.drawable.emoji_2648);
        map.put(0xe240, R.drawable.emoji_2649);
        map.put(0xe241, R.drawable.emoji_264a);
        map.put(0xe242, R.drawable.emoji_264b);
        map.put(0xe243, R.drawable.emoji_264c);
        map.put(0xe244, R.drawable.emoji_264d);
        map.put(0xe245, R.drawable.emoji_264e);
        map.put(0xe246, R.drawable.emoji_264f);
        map.put(0xe247, R.drawable.emoji_2650);
        map.put(0xe248, R.drawable.emoji_2651);
        map.put(0xe249, R.drawable.emoji_2652);
        map.put(0xe24a, R.drawable.emoji_2653);
        map.put(0xe24b, R.drawable.emoji_26ce);
        map.put(0xe24c, R.drawable.emoji_1f51d);
        map.put(0xe24d, R.drawable.emoji_1f197);
        map.put(0xe24e, R.drawable.emoji_00a9);
        map.put(0xe24f, R.drawable.emoji_00ae);
        map.put(0xe250, R.drawable.emoji_1f4f3);
        map.put(0xe251, R.drawable.emoji_1f4f4);
        map.put(0xe252, R.drawable.emoji_26a0);
        map.put(0xe253, R.drawable.emoji_1f481);
        map.put(0xe309, R.drawable.emoji_1f6be);
        map.put(0xe30d, R.drawable.emoji_3297);
        map.put(0xe332, R.drawable.emoji_2b55);
        map.put(0xe333, R.drawable.emoji_2716);
        map.put(0xe334, R.drawable.emoji_1f4a2);
        map.put(0xe335, R.drawable.emoji_1f31f);
        map.put(0xe336, R.drawable.emoji_2754);
        map.put(0xe337, R.drawable.emoji_2755);
        map.put(0xe532, R.drawable.emoji_1f170);
        map.put(0xe533, R.drawable.emoji_1f171);
        map.put(0xe534, R.drawable.emoji_1f18e);
        map.put(0xe535, R.drawable.emoji_1f17e);
        map.put(0xe536, R.drawable.emoji_1f43e);
        map.put(0xe537, R.drawable.emoji_2122);
    }

}
