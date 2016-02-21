package br.com.instachat.emojilibrary.model;

import android.util.SparseIntArray;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class Nature {
    public static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoint(0x1f436),
            Emoji.fromCodePoint(0x1f43a),
            Emoji.fromCodePoint(0x1f431),
            Emoji.fromCodePoint(0x1f42d),
            Emoji.fromCodePoint(0x1f439),
            Emoji.fromCodePoint(0x1f430),
            Emoji.fromCodePoint(0x1f438),
            Emoji.fromCodePoint(0x1f42f),
            Emoji.fromCodePoint(0x1f428),
            Emoji.fromCodePoint(0x1f43b),
            Emoji.fromCodePoint(0x1f437),
            Emoji.fromCodePoint(0x1f43d),
            Emoji.fromCodePoint(0x1f42e),
            Emoji.fromCodePoint(0x1f417),
            Emoji.fromCodePoint(0x1f435),
            Emoji.fromCodePoint(0x1f412),
            Emoji.fromCodePoint(0x1f434),
            Emoji.fromCodePoint(0x1f411),
            Emoji.fromCodePoint(0x1f418),
            Emoji.fromCodePoint(0x1f43c),
            Emoji.fromCodePoint(0x1f427),
            Emoji.fromCodePoint(0x1f426),
            Emoji.fromCodePoint(0x1f424),
            Emoji.fromCodePoint(0x1f425),
            Emoji.fromCodePoint(0x1f423),
            Emoji.fromCodePoint(0x1f414),
            Emoji.fromCodePoint(0x1f40d),
            Emoji.fromCodePoint(0x1f422),
            Emoji.fromCodePoint(0x1f41b),
            Emoji.fromCodePoint(0x1f41d),
            Emoji.fromCodePoint(0x1f41c),
            Emoji.fromCodePoint(0x1f41e),
            Emoji.fromCodePoint(0x1f40c),
            Emoji.fromCodePoint(0x1f419),
            Emoji.fromCodePoint(0x1f41a),
            Emoji.fromCodePoint(0x1f420),
            Emoji.fromCodePoint(0x1f41f),
            Emoji.fromCodePoint(0x1f42c),
            Emoji.fromCodePoint(0x1f433),
            Emoji.fromCodePoint(0x1f40b),
            Emoji.fromCodePoint(0x1f404),
            Emoji.fromCodePoint(0x1f40f),
            Emoji.fromCodePoint(0x1f400),
            Emoji.fromCodePoint(0x1f403),
            Emoji.fromCodePoint(0x1f405),
            Emoji.fromCodePoint(0x1f407),
            Emoji.fromCodePoint(0x1f409),
            Emoji.fromCodePoint(0x1f40e),
            Emoji.fromCodePoint(0x1f410),
            Emoji.fromCodePoint(0x1f413),
            Emoji.fromCodePoint(0x1f415),
            Emoji.fromCodePoint(0x1f416),
            Emoji.fromCodePoint(0x1f401),
            Emoji.fromCodePoint(0x1f402),
            Emoji.fromCodePoint(0x1f432),
            Emoji.fromCodePoint(0x1f421),
            Emoji.fromCodePoint(0x1f40a),
            Emoji.fromCodePoint(0x1f42b),
            Emoji.fromCodePoint(0x1f42a),
            Emoji.fromCodePoint(0x1f406),
            Emoji.fromCodePoint(0x1f408),
            Emoji.fromCodePoint(0x1f429),
            Emoji.fromCodePoint(0x1f43e),
            Emoji.fromCodePoint(0x1f490),
            Emoji.fromCodePoint(0x1f338),
            Emoji.fromCodePoint(0x1f337),
            Emoji.fromCodePoint(0x1f340),
            Emoji.fromCodePoint(0x1f339),
            Emoji.fromCodePoint(0x1f33b),
            Emoji.fromCodePoint(0x1f33a),
            Emoji.fromCodePoint(0x1f341),
            Emoji.fromCodePoint(0x1f343),
            Emoji.fromCodePoint(0x1f342),
            Emoji.fromCodePoint(0x1f33f),
            Emoji.fromCodePoint(0x1f33e),
            Emoji.fromCodePoint(0x1f344),
            Emoji.fromCodePoint(0x1f335),
            Emoji.fromCodePoint(0x1f334),
            Emoji.fromCodePoint(0x1f332),
            Emoji.fromCodePoint(0x1f333),
            Emoji.fromCodePoint(0x1f330),
            Emoji.fromCodePoint(0x1f331),
            Emoji.fromCodePoint(0x1f33c),
            Emoji.fromCodePoint(0x1f310),
            Emoji.fromCodePoint(0x1f31e),
            Emoji.fromCodePoint(0x1f31d),
            Emoji.fromCodePoint(0x1f31a),
            Emoji.fromCodePoint(0x1f311),
            Emoji.fromCodePoint(0x1f312),
            Emoji.fromCodePoint(0x1f313),
            Emoji.fromCodePoint(0x1f314),
            Emoji.fromCodePoint(0x1f315),
            Emoji.fromCodePoint(0x1f316),
            Emoji.fromCodePoint(0x1f317),
            Emoji.fromCodePoint(0x1f318),
            Emoji.fromCodePoint(0x1f31c),
            Emoji.fromCodePoint(0x1f31b),
            Emoji.fromCodePoint(0x1f319),
            Emoji.fromCodePoint(0x1f30d),
            Emoji.fromCodePoint(0x1f30e),
            Emoji.fromCodePoint(0x1f30f),
            Emoji.fromCodePoint(0x1f30b),
            Emoji.fromCodePoint(0x1f30c),
            Emoji.fromCodePoint(0x1f320),
            Emoji.fromChar((char) 0x2b50),
            Emoji.fromChar((char) 0x2600),
            Emoji.fromChar((char) 0x26c5),
            Emoji.fromChar((char) 0x2601),
            Emoji.fromChar((char) 0x26a1),
            Emoji.fromChar((char) 0x2614),
            Emoji.fromChar((char) 0x2744),
            Emoji.fromChar((char) 0x26c4),
            Emoji.fromCodePoint(0x1f300),
            Emoji.fromCodePoint(0x1f301),
            Emoji.fromCodePoint(0x1f308),
            Emoji.fromCodePoint(0x1f30a),
    };

    public static void bindEmojis(SparseIntArray map) {
        map.put(0x1f436, R.drawable.emoji_1f436);
        map.put(0x1f43a, R.drawable.emoji_1f43a);
        map.put(0x1f431, R.drawable.emoji_1f431);
        map.put(0x1f42d, R.drawable.emoji_1f42d);
        map.put(0x1f439, R.drawable.emoji_1f439);
        map.put(0x1f430, R.drawable.emoji_1f430);
        map.put(0x1f438, R.drawable.emoji_1f438);
        map.put(0x1f42f, R.drawable.emoji_1f42f);
        map.put(0x1f428, R.drawable.emoji_1f428);
        map.put(0x1f43b, R.drawable.emoji_1f43b);
        map.put(0x1f437, R.drawable.emoji_1f437);
        map.put(0x1f43d, R.drawable.emoji_1f43d);
        map.put(0x1f42e, R.drawable.emoji_1f42e);
        map.put(0x1f417, R.drawable.emoji_1f417);
        map.put(0x1f435, R.drawable.emoji_1f435);
        map.put(0x1f412, R.drawable.emoji_1f412);
        map.put(0x1f434, R.drawable.emoji_1f434);
        map.put(0x1f411, R.drawable.emoji_1f411);
        map.put(0x1f418, R.drawable.emoji_1f418);
        map.put(0x1f43c, R.drawable.emoji_1f43c);
        map.put(0x1f427, R.drawable.emoji_1f427);
        map.put(0x1f426, R.drawable.emoji_1f426);
        map.put(0x1f424, R.drawable.emoji_1f424);
        map.put(0x1f425, R.drawable.emoji_1f425);
        map.put(0x1f423, R.drawable.emoji_1f423);
        map.put(0x1f414, R.drawable.emoji_1f414);
        map.put(0x1f40d, R.drawable.emoji_1f40d);
        map.put(0x1f422, R.drawable.emoji_1f422);
        map.put(0x1f41b, R.drawable.emoji_1f41b);
        map.put(0x1f41d, R.drawable.emoji_1f41d);
        map.put(0x1f41c, R.drawable.emoji_1f41c);
        map.put(0x1f41e, R.drawable.emoji_1f41e);
        map.put(0x1f40c, R.drawable.emoji_1f40c);
        map.put(0x1f419, R.drawable.emoji_1f419);
        map.put(0x1f41a, R.drawable.emoji_1f41a);
        map.put(0x1f420, R.drawable.emoji_1f420);
        map.put(0x1f41f, R.drawable.emoji_1f41f);
        map.put(0x1f42c, R.drawable.emoji_1f42c);
        map.put(0x1f433, R.drawable.emoji_1f433);
        map.put(0x1f40b, R.drawable.emoji_1f40b);
        map.put(0x1f404, R.drawable.emoji_1f404);
        map.put(0x1f40f, R.drawable.emoji_1f40f);
        map.put(0x1f400, R.drawable.emoji_1f400);
        map.put(0x1f403, R.drawable.emoji_1f403);
        map.put(0x1f405, R.drawable.emoji_1f405);
        map.put(0x1f407, R.drawable.emoji_1f407);
        map.put(0x1f409, R.drawable.emoji_1f409);
        map.put(0x1f40e, R.drawable.emoji_1f40e);
        map.put(0x1f410, R.drawable.emoji_1f410);
        map.put(0x1f413, R.drawable.emoji_1f413);
        map.put(0x1f415, R.drawable.emoji_1f415);
        map.put(0x1f416, R.drawable.emoji_1f416);
        map.put(0x1f401, R.drawable.emoji_1f401);
        map.put(0x1f402, R.drawable.emoji_1f402);
        map.put(0x1f432, R.drawable.emoji_1f432);
        map.put(0x1f421, R.drawable.emoji_1f421);
        map.put(0x1f40a, R.drawable.emoji_1f40a);
        map.put(0x1f42b, R.drawable.emoji_1f42b);
        map.put(0x1f42a, R.drawable.emoji_1f42a);
        map.put(0x1f406, R.drawable.emoji_1f406);
        map.put(0x1f408, R.drawable.emoji_1f408);
        map.put(0x1f429, R.drawable.emoji_1f429);
        map.put(0x1f43e, R.drawable.emoji_1f43e);
        map.put(0x1f490, R.drawable.emoji_1f490);
        map.put(0x1f338, R.drawable.emoji_1f338);
        map.put(0x1f337, R.drawable.emoji_1f337);
        map.put(0x1f340, R.drawable.emoji_1f340);
        map.put(0x1f339, R.drawable.emoji_1f339);
        map.put(0x1f33b, R.drawable.emoji_1f33b);
        map.put(0x1f33a, R.drawable.emoji_1f33a);
        map.put(0x1f341, R.drawable.emoji_1f341);
        map.put(0x1f343, R.drawable.emoji_1f343);
        map.put(0x1f342, R.drawable.emoji_1f342);
        map.put(0x1f33f, R.drawable.emoji_1f33f);
        map.put(0x1f33e, R.drawable.emoji_1f33e);
        map.put(0x1f344, R.drawable.emoji_1f344);
        map.put(0x1f335, R.drawable.emoji_1f335);
        map.put(0x1f334, R.drawable.emoji_1f334);
        map.put(0x1f332, R.drawable.emoji_1f332);
        map.put(0x1f333, R.drawable.emoji_1f333);
        map.put(0x1f330, R.drawable.emoji_1f330);
        map.put(0x1f331, R.drawable.emoji_1f331);
        map.put(0x1f33c, R.drawable.emoji_1f33c);
        map.put(0x1f310, R.drawable.emoji_1f310);
        map.put(0x1f31e, R.drawable.emoji_1f31e);
        map.put(0x1f31d, R.drawable.emoji_1f31d);
        map.put(0x1f31a, R.drawable.emoji_1f31a);
        map.put(0x1f311, R.drawable.emoji_1f311);
        map.put(0x1f312, R.drawable.emoji_1f312);
        map.put(0x1f313, R.drawable.emoji_1f313);
        map.put(0x1f314, R.drawable.emoji_1f314);
        map.put(0x1f315, R.drawable.emoji_1f315);
        map.put(0x1f316, R.drawable.emoji_1f316);
        map.put(0x1f317, R.drawable.emoji_1f317);
        map.put(0x1f318, R.drawable.emoji_1f318);
        map.put(0x1f31c, R.drawable.emoji_1f31c);
        map.put(0x1f31b, R.drawable.emoji_1f31b);
        map.put(0x1f319, R.drawable.emoji_1f319);
        map.put(0x1f30d, R.drawable.emoji_1f30d);
        map.put(0x1f30e, R.drawable.emoji_1f30e);
        map.put(0x1f30f, R.drawable.emoji_1f30f);
        map.put(0x1f30b, R.drawable.emoji_1f30b);
        map.put(0x1f30c, R.drawable.emoji_1f30c);
        map.put(0x1f320, R.drawable.emoji_1f303);
        map.put(0x2b50, R.drawable.emoji_2b50);
        map.put(0x2600, R.drawable.emoji_2600);
        map.put(0x26c5, R.drawable.emoji_26c5);
        map.put(0x2601, R.drawable.emoji_2601);
        map.put(0x26a1, R.drawable.emoji_26a1);
        map.put(0x2614, R.drawable.emoji_2614);
        map.put(0x2744, R.drawable.emoji_2744);
        map.put(0x26c4, R.drawable.emoji_26c4);
        map.put(0x1f300, R.drawable.emoji_1f300);
        map.put(0x1f301, R.drawable.emoji_1f301);
        map.put(0x1f308, R.drawable.emoji_1f308);
        map.put(0x1f30a, R.drawable.emoji_1f30a);
        map.put(0x26c8, R.drawable.emoji_26c8);
        map.put(0x1f324, R.drawable.emoji_1f324);
        map.put(0x1f325, R.drawable.emoji_1f325);
        map.put(0x1f326, R.drawable.emoji_1f326);
        map.put(0x1f327, R.drawable.emoji_1f327);
        map.put(0x1f328, R.drawable.emoji_1f328);
        map.put(0x1f329, R.drawable.emoji_1f329);
        map.put(0x1f32a, R.drawable.emoji_1f32a);
        map.put(0x1f32b, R.drawable.emoji_1f32b);
        map.put(0x1f32c, R.drawable.emoji_1f32c);
        map.put(0x2602, R.drawable.emoji_2602);
        map.put(0x26f1, R.drawable.emoji_26f1);
        map.put(0x1f981, R.drawable.emoji_1f981);
        map.put(0x1f984, R.drawable.emoji_1f984);
        map.put(0x1f43f, R.drawable.emoji_1f43f);
        map.put(0x1f983, R.drawable.emoji_1f983);
        map.put(0x1f54a, R.drawable.emoji_1f54a);
        map.put(0x1f980, R.drawable.emoji_1f980);
        map.put(0x1f577, R.drawable.emoji_1f577);
        map.put(0x1f578, R.drawable.emoji_1f578);
        map.put(0x1f982, R.drawable.emoji_1f982);
        map.put(0x1f3f5, R.drawable.emoji_1f3f5);
        map.put(0x2618, R.drawable.emoji_2618);

    }

    public static void bindSoftBankEmojis(SparseIntArray map) {
        map.put(0xe030, R.drawable.emoji_1f338);
        map.put(0xe031, R.drawable.emoji_1f531);
        map.put(0xe032, R.drawable.emoji_1f339);
        map.put(0xe033, R.drawable.emoji_1f384);
        map.put(0xe019, R.drawable.emoji_1f3a3);
        map.put(0xe01a, R.drawable.emoji_1f434);
        map.put(0xe048, R.drawable.emoji_26c4);
        map.put(0xe049, R.drawable.emoji_2601);
        map.put(0xe04a, R.drawable.emoji_2600);
        map.put(0xe04b, R.drawable.emoji_2614);
        map.put(0xe04c, R.drawable.emoji_1f313);
        map.put(0xe04d, R.drawable.emoji_1f304);
        map.put(0xe04f, R.drawable.emoji_1f431);
        map.put(0xe050, R.drawable.emoji_1f42f);
        map.put(0xe051, R.drawable.emoji_1f43b);
        map.put(0xe052, R.drawable.emoji_1f429);
        map.put(0xe053, R.drawable.emoji_1f42d);
        map.put(0xe054, R.drawable.emoji_1f433);
        map.put(0xe055, R.drawable.emoji_1f427);
        map.put(0xe10a, R.drawable.emoji_1f419);
        map.put(0xe10b, R.drawable.emoji_1f437);
        map.put(0xe10c, R.drawable.emoji_1f47d);
        map.put(0xe110, R.drawable.emoji_1f331);
        map.put(0xe111, R.drawable.emoji_1f48f);
        map.put(0xe117, R.drawable.emoji_1f386);
        map.put(0xe118, R.drawable.emoji_1f341);
        map.put(0xe119, R.drawable.emoji_1f342);
        map.put(0xe304, R.drawable.emoji_1f337);
        map.put(0xe305, R.drawable.emoji_1f33b);
        map.put(0xe306, R.drawable.emoji_1f490);
        map.put(0xe307, R.drawable.emoji_1f334);
        map.put(0xe308, R.drawable.emoji_1f335);
        map.put(0xe520, R.drawable.emoji_1f42c);
        map.put(0xe521, R.drawable.emoji_1f426);
        map.put(0xe522, R.drawable.emoji_1f420);
        map.put(0xe523, R.drawable.emoji_1f423);
        map.put(0xe524, R.drawable.emoji_1f439);
        map.put(0xe525, R.drawable.emoji_1f41b);
        map.put(0xe526, R.drawable.emoji_1f418);
        map.put(0xe527, R.drawable.emoji_1f428);
        map.put(0xe528, R.drawable.emoji_1f412);
        map.put(0xe529, R.drawable.emoji_1f411);
        map.put(0xe52a, R.drawable.emoji_1f43a);
        map.put(0xe52b, R.drawable.emoji_1f42e);
        map.put(0xe52c, R.drawable.emoji_1f430);
        map.put(0xe52d, R.drawable.emoji_1f40d);
        map.put(0xe52e, R.drawable.emoji_1f414);
        map.put(0xe52f, R.drawable.emoji_1f417);
        map.put(0xe530, R.drawable.emoji_1f42b);
        map.put(0xe531, R.drawable.emoji_1f438);
        map.put(0xe440, R.drawable.emoji_1f387);
        map.put(0xe441, R.drawable.emoji_1f41a);
        map.put(0xe442, R.drawable.emoji_1f390);
        map.put(0xe443, R.drawable.emoji_1f300);
        map.put(0xe444, R.drawable.emoji_1f33e);
        map.put(0xe445, R.drawable.emoji_1f383);
        map.put(0xe446, R.drawable.emoji_1f391);
        map.put(0xe447, R.drawable.emoji_1f343);
    }

}
