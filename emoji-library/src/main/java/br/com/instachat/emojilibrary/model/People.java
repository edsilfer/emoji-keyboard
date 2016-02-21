package br.com.instachat.emojilibrary.model;

import android.util.SparseIntArray;

import br.com.instachat.emojilibrary.R;

/**
 * Created by Leonardo Assunção on 18/02/2016.
 */
public class People {
    public static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoint(0x1f604),
            Emoji.fromCodePoint(0x1f603),
            Emoji.fromCodePoint(0x1f600),
            Emoji.fromCodePoint(0x1f60a),
            Emoji.fromChar((char) 0x263a),
            Emoji.fromCodePoint(0x1f609),
            Emoji.fromCodePoint(0x1f60d),
            Emoji.fromCodePoint(0x1f618),
            Emoji.fromCodePoint(0x1f61a),
            Emoji.fromCodePoint(0x1f617),
            Emoji.fromCodePoint(0x1f619),
            Emoji.fromCodePoint(0x1f61c),
            Emoji.fromCodePoint(0x1f61d),
            Emoji.fromCodePoint(0x1f61b),
            Emoji.fromCodePoint(0x1f633),
            Emoji.fromCodePoint(0x1f601),
            Emoji.fromCodePoint(0x1f614),
            Emoji.fromCodePoint(0x1f60c),
            Emoji.fromCodePoint(0x1f612),
            Emoji.fromCodePoint(0x1f61e),
            Emoji.fromCodePoint(0x1f623),
            Emoji.fromCodePoint(0x1f622),
            Emoji.fromCodePoint(0x1f602),
            Emoji.fromCodePoint(0x1f62d),
            Emoji.fromCodePoint(0x1f62a),
            Emoji.fromCodePoint(0x1f625),
            Emoji.fromCodePoint(0x1f630),
            Emoji.fromCodePoint(0x1f605),
            Emoji.fromCodePoint(0x1f613),
            Emoji.fromCodePoint(0x1f629),
            Emoji.fromCodePoint(0x1f62b),
            Emoji.fromCodePoint(0x1f628),
            Emoji.fromCodePoint(0x1f631),
            Emoji.fromCodePoint(0x1f620),
            Emoji.fromCodePoint(0x1f621),
            Emoji.fromCodePoint(0x1f624),
            Emoji.fromCodePoint(0x1f616),
            Emoji.fromCodePoint(0x1f606),
            Emoji.fromCodePoint(0x1f60b),
            Emoji.fromCodePoint(0x1f637),
            Emoji.fromCodePoint(0x1f60e),
            Emoji.fromCodePoint(0x1f634),
            Emoji.fromCodePoint(0x1f635),
            Emoji.fromCodePoint(0x1f632),
            Emoji.fromCodePoint(0x1f61f),
            Emoji.fromCodePoint(0x1f626),
            Emoji.fromCodePoint(0x1f627),
            Emoji.fromCodePoint(0x1f608),
            Emoji.fromCodePoint(0x1f47f),
            Emoji.fromCodePoint(0x1f62e),
            Emoji.fromCodePoint(0x1f62c),
            Emoji.fromCodePoint(0x1f610),
            Emoji.fromCodePoint(0x1f615),
            Emoji.fromCodePoint(0x1f62f),
            Emoji.fromCodePoint(0x1f636),
            Emoji.fromCodePoint(0x1f607),
            Emoji.fromCodePoint(0x1f60f),
            Emoji.fromCodePoint(0x1f611),
            Emoji.fromCodePoint(0x1f472),
            Emoji.fromCodePoint(0x1f473),
            Emoji.fromCodePoint(0x1f46e),
            Emoji.fromCodePoint(0x1f477),
            Emoji.fromCodePoint(0x1f482),
            Emoji.fromCodePoint(0x1f476),
            Emoji.fromCodePoint(0x1f466),
            Emoji.fromCodePoint(0x1f467),
            Emoji.fromCodePoint(0x1f468),
            Emoji.fromCodePoint(0x1f469),
            Emoji.fromCodePoint(0x1f474),
            Emoji.fromCodePoint(0x1f475),
            Emoji.fromCodePoint(0x1f471),
            Emoji.fromCodePoint(0x1f47c),
            Emoji.fromCodePoint(0x1f478),
            Emoji.fromCodePoint(0x1f63a),
            Emoji.fromCodePoint(0x1f638),
            Emoji.fromCodePoint(0x1f63b),
            Emoji.fromCodePoint(0x1f63d),
            Emoji.fromCodePoint(0x1f63c),
            Emoji.fromCodePoint(0x1f640),
            Emoji.fromCodePoint(0x1f63f),
            Emoji.fromCodePoint(0x1f639),
            Emoji.fromCodePoint(0x1f63e),
            Emoji.fromCodePoint(0x1f479),
            Emoji.fromCodePoint(0x1f47a),
            Emoji.fromCodePoint(0x1f648),
            Emoji.fromCodePoint(0x1f649),
            Emoji.fromCodePoint(0x1f64a),
            Emoji.fromCodePoint(0x1f480),
            Emoji.fromCodePoint(0x1f47d),
            Emoji.fromCodePoint(0x1f4a9),
            Emoji.fromCodePoint(0x1f525),
            Emoji.fromChar((char) 0x2728),
            Emoji.fromCodePoint(0x1f31f),
            Emoji.fromCodePoint(0x1f4ab),
            Emoji.fromCodePoint(0x1f4a5),
            Emoji.fromCodePoint(0x1f4a2),
            Emoji.fromCodePoint(0x1f4a6),
            Emoji.fromCodePoint(0x1f4a7),
            Emoji.fromCodePoint(0x1f4a4),
            Emoji.fromCodePoint(0x1f4a8),
            Emoji.fromCodePoint(0x1f442),
            Emoji.fromCodePoint(0x1f440),
            Emoji.fromCodePoint(0x1f443),
            Emoji.fromCodePoint(0x1f445),
            Emoji.fromCodePoint(0x1f444),
            Emoji.fromCodePoint(0x1f44d),
            Emoji.fromCodePoint(0x1f44e),
            Emoji.fromCodePoint(0x1f44c),
            Emoji.fromCodePoint(0x1f44a),
            Emoji.fromChar((char) 0x270a),
            Emoji.fromChar((char) 0x270c),
            Emoji.fromCodePoint(0x1f44b),
            Emoji.fromChar((char) 0x270b),
            Emoji.fromCodePoint(0x1f450),
            Emoji.fromCodePoint(0x1f446),
            Emoji.fromCodePoint(0x1f447),
            Emoji.fromCodePoint(0x1f449),
            Emoji.fromCodePoint(0x1f448),
            Emoji.fromCodePoint(0x1f64c),
            Emoji.fromCodePoint(0x1f64f),
            Emoji.fromChar((char) 0x261d),
            Emoji.fromCodePoint(0x1f44f),
            Emoji.fromCodePoint(0x1f4aa),
            Emoji.fromCodePoint(0x1f6b6),
            Emoji.fromCodePoint(0x1f3c3),
            Emoji.fromCodePoint(0x1f483),
            Emoji.fromCodePoint(0x1f46b),
            Emoji.fromCodePoint(0x1f46a),
            Emoji.fromCodePoint(0x1f46c),
            Emoji.fromCodePoint(0x1f46d),
            Emoji.fromCodePoint(0x1f48f),
            Emoji.fromCodePoint(0x1f491),
            Emoji.fromCodePoint(0x1f46f),
            Emoji.fromCodePoint(0x1f646),
            Emoji.fromCodePoint(0x1f645),
            Emoji.fromCodePoint(0x1f481),
            Emoji.fromCodePoint(0x1f64b),
            Emoji.fromCodePoint(0x1f486),
            Emoji.fromCodePoint(0x1f487),
            Emoji.fromCodePoint(0x1f485),
            Emoji.fromCodePoint(0x1f470),
            Emoji.fromCodePoint(0x1f64e),
            Emoji.fromCodePoint(0x1f64d),
            Emoji.fromCodePoint(0x1f647),
            Emoji.fromCodePoint(0x1f3a9),
            Emoji.fromCodePoint(0x1f451),
            Emoji.fromCodePoint(0x1f452),
            Emoji.fromCodePoint(0x1f45f),
            Emoji.fromCodePoint(0x1f45e),
            Emoji.fromCodePoint(0x1f461),
            Emoji.fromCodePoint(0x1f460),
            Emoji.fromCodePoint(0x1f462),
            Emoji.fromCodePoint(0x1f455),
            Emoji.fromCodePoint(0x1f454),
            Emoji.fromCodePoint(0x1f45a),
            Emoji.fromCodePoint(0x1f457),
            Emoji.fromCodePoint(0x1f3bd),
            Emoji.fromCodePoint(0x1f456),
            Emoji.fromCodePoint(0x1f458),
            Emoji.fromCodePoint(0x1f459),
            Emoji.fromCodePoint(0x1f4bc),
            Emoji.fromCodePoint(0x1f45c),
            Emoji.fromCodePoint(0x1f45d),
            Emoji.fromCodePoint(0x1f45b),
            Emoji.fromCodePoint(0x1f453),
            Emoji.fromCodePoint(0x1f380),
            Emoji.fromCodePoint(0x1f302),
            Emoji.fromCodePoint(0x1f484),
            Emoji.fromCodePoint(0x1f49b),
            Emoji.fromCodePoint(0x1f499),
            Emoji.fromCodePoint(0x1f49c),
            Emoji.fromCodePoint(0x1f49a),
            Emoji.fromChar((char) 0x2764),
            Emoji.fromCodePoint(0x1f494),
            Emoji.fromCodePoint(0x1f497),
            Emoji.fromCodePoint(0x1f493),
            Emoji.fromCodePoint(0x1f495),
            Emoji.fromCodePoint(0x1f496),
            Emoji.fromCodePoint(0x1f49e),
            Emoji.fromCodePoint(0x1f498),
            Emoji.fromCodePoint(0x1f48c),
            Emoji.fromCodePoint(0x1f48b),
            Emoji.fromCodePoint(0x1f48d),
            Emoji.fromCodePoint(0x1f48e),
            Emoji.fromCodePoint(0x1f464),
            Emoji.fromCodePoint(0x1f465),
            Emoji.fromCodePoint(0x1f4ac),
            Emoji.fromCodePoint(0x1f463),
            Emoji.fromCodePoint(0x1f4ad),
    };

    public static void bindEmojis(SparseIntArray map) {
        map.put(0x1f604, R.drawable.emoji_1f604);
        map.put(0x1f603, R.drawable.emoji_1f603);
        map.put(0x1f600, R.drawable.emoji_1f600);
        map.put(0x1f60a, R.drawable.emoji_1f60a);
        map.put(0x263a, R.drawable.emoji_263a);
        map.put(0x1f609, R.drawable.emoji_1f609);
        map.put(0x1f60d, R.drawable.emoji_1f60d);
        map.put(0x1f618, R.drawable.emoji_1f618);
        map.put(0x1f61a, R.drawable.emoji_1f61a);
        map.put(0x1f617, R.drawable.emoji_1f617);
        map.put(0x1f619, R.drawable.emoji_1f619);
        map.put(0x1f61c, R.drawable.emoji_1f61c);
        map.put(0x1f61d, R.drawable.emoji_1f61d);
        map.put(0x1f61b, R.drawable.emoji_1f61b);
        map.put(0x1f633, R.drawable.emoji_1f633);
        map.put(0x1f601, R.drawable.emoji_1f601);
        map.put(0x1f614, R.drawable.emoji_1f614);
        map.put(0x1f60c, R.drawable.emoji_1f60c);
        map.put(0x1f612, R.drawable.emoji_1f612);
        map.put(0x1f61e, R.drawable.emoji_1f61e);
        map.put(0x1f623, R.drawable.emoji_1f623);
        map.put(0x1f622, R.drawable.emoji_1f622);
        map.put(0x1f602, R.drawable.emoji_1f602);
        map.put(0x1f62d, R.drawable.emoji_1f62d);
        map.put(0x1f62a, R.drawable.emoji_1f62a);
        map.put(0x1f625, R.drawable.emoji_1f625);
        map.put(0x1f630, R.drawable.emoji_1f630);
        map.put(0x1f605, R.drawable.emoji_1f605);
        map.put(0x1f613, R.drawable.emoji_1f613);
        map.put(0x1f629, R.drawable.emoji_1f629);
        map.put(0x1f62b, R.drawable.emoji_1f62b);
        map.put(0x1f628, R.drawable.emoji_1f628);
        map.put(0x1f631, R.drawable.emoji_1f631);
        map.put(0x1f620, R.drawable.emoji_1f620);
        map.put(0x1f621, R.drawable.emoji_1f621);
        map.put(0x1f624, R.drawable.emoji_1f624);
        map.put(0x1f616, R.drawable.emoji_1f616);
        map.put(0x1f606, R.drawable.emoji_1f606);
        map.put(0x1f60b, R.drawable.emoji_1f60b);
        map.put(0x1f637, R.drawable.emoji_1f637);
        map.put(0x1f60e, R.drawable.emoji_1f60e);
        map.put(0x1f634, R.drawable.emoji_1f634);
        map.put(0x1f635, R.drawable.emoji_1f635);
        map.put(0x1f632, R.drawable.emoji_1f632);
        map.put(0x1f61f, R.drawable.emoji_1f61f);
        map.put(0x1f626, R.drawable.emoji_1f626);
        map.put(0x1f627, R.drawable.emoji_1f627);
        map.put(0x1f608, R.drawable.emoji_1f608);
        map.put(0x1f47f, R.drawable.emoji_1f47f);
        map.put(0x1f62e, R.drawable.emoji_1f62e);
        map.put(0x1f62c, R.drawable.emoji_1f62c);
        map.put(0x1f610, R.drawable.emoji_1f610);
        map.put(0x1f615, R.drawable.emoji_1f615);
        map.put(0x1f62f, R.drawable.emoji_1f62f);
        map.put(0x1f636, R.drawable.emoji_1f636);
        map.put(0x1f607, R.drawable.emoji_1f607);
        map.put(0x1f60f, R.drawable.emoji_1f60f);
        map.put(0x1f611, R.drawable.emoji_1f611);
        map.put(0x1f472, R.drawable.emoji_1f472);
        map.put(0x1f473, R.drawable.emoji_1f473);
        map.put(0x1f46e, R.drawable.emoji_1f46e);
        map.put(0x1f477, R.drawable.emoji_1f477);
        map.put(0x1f482, R.drawable.emoji_1f482);
        map.put(0x1f476, R.drawable.emoji_1f476);
        map.put(0x1f466, R.drawable.emoji_1f466);
        map.put(0x1f467, R.drawable.emoji_1f467);
        map.put(0x1f468, R.drawable.emoji_1f468);
        map.put(0x1f469, R.drawable.emoji_1f469);
        map.put(0x1f474, R.drawable.emoji_1f474);
        map.put(0x1f475, R.drawable.emoji_1f475);
        map.put(0x1f471, R.drawable.emoji_1f471);
        map.put(0x1f47c, R.drawable.emoji_1f47c);
        map.put(0x1f478, R.drawable.emoji_1f478);
        map.put(0x1f63a, R.drawable.emoji_1f63a);
        map.put(0x1f638, R.drawable.emoji_1f638);
        map.put(0x1f63b, R.drawable.emoji_1f63b);
        map.put(0x1f63d, R.drawable.emoji_1f63d);
        map.put(0x1f63c, R.drawable.emoji_1f63c);
        map.put(0x1f640, R.drawable.emoji_1f640);
        map.put(0x1f63f, R.drawable.emoji_1f63f);
        map.put(0x1f639, R.drawable.emoji_1f639);
        map.put(0x1f63e, R.drawable.emoji_1f63e);
        map.put(0x1f479, R.drawable.emoji_1f479);
        map.put(0x1f47a, R.drawable.emoji_1f47a);
        map.put(0x1f648, R.drawable.emoji_1f648);
        map.put(0x1f649, R.drawable.emoji_1f649);
        map.put(0x1f64a, R.drawable.emoji_1f64a);
        map.put(0x1f480, R.drawable.emoji_1f480);
        map.put(0x1f47d, R.drawable.emoji_1f47d);
        map.put(0x1f4a9, R.drawable.emoji_1f4a9);
        map.put(0x1f525, R.drawable.emoji_1f525);
        map.put(0x2728, R.drawable.emoji_2728);
        map.put(0x1f31f, R.drawable.emoji_1f31f);
        map.put(0x1f4ab, R.drawable.emoji_1f4ab);
        map.put(0x1f4a5, R.drawable.emoji_1f4a5);
        map.put(0x1f4a2, R.drawable.emoji_1f4a2);
        map.put(0x1f4a6, R.drawable.emoji_1f4a6);
        map.put(0x1f4a7, R.drawable.emoji_1f4a7);
        map.put(0x1f4a4, R.drawable.emoji_1f4a4);
        map.put(0x1f4a8, R.drawable.emoji_1f4a8);
        map.put(0x1f442, R.drawable.emoji_1f442);
        map.put(0x1f440, R.drawable.emoji_1f440);
        map.put(0x1f443, R.drawable.emoji_1f443);
        map.put(0x1f445, R.drawable.emoji_1f445);
        map.put(0x1f444, R.drawable.emoji_1f444);
        map.put(0x1f44d, R.drawable.emoji_1f44d);
        map.put(0x1f44e, R.drawable.emoji_1f44e);
        map.put(0x1f44c, R.drawable.emoji_1f44c);
        map.put(0x1f44a, R.drawable.emoji_1f44a);
        map.put(0x270a, R.drawable.emoji_270a);
        map.put(0x270c, R.drawable.emoji_270c);
        map.put(0x1f44b, R.drawable.emoji_1f44b);
        map.put(0x270b, R.drawable.emoji_270b);
        map.put(0x1f450, R.drawable.emoji_1f450);
        map.put(0x1f446, R.drawable.emoji_1f446);
        map.put(0x1f447, R.drawable.emoji_1f447);
        map.put(0x1f449, R.drawable.emoji_1f449);
        map.put(0x1f448, R.drawable.emoji_1f448);
        map.put(0x1f64c, R.drawable.emoji_1f64c);
        map.put(0x1f64f, R.drawable.emoji_1f64f);
        map.put(0x261d, R.drawable.emoji_261d);
        map.put(0x1f44f, R.drawable.emoji_1f44f);
        map.put(0x1f4aa, R.drawable.emoji_1f4aa);
        map.put(0x1f6b6, R.drawable.emoji_1f6b6);
        map.put(0x1f3c3, R.drawable.emoji_1f3c3);
        map.put(0x1f483, R.drawable.emoji_1f483);
        map.put(0x1f46b, R.drawable.emoji_1f46b);
        map.put(0x1f46a, R.drawable.emoji_1f46a);
        map.put(0x1f46c, R.drawable.emoji_1f46c);
        map.put(0x1f46d, R.drawable.emoji_1f46d);
        map.put(0x1f48f, R.drawable.emoji_1f48f);
        map.put(0x1f491, R.drawable.emoji_1f491);
        map.put(0x1f46f, R.drawable.emoji_1f46f);
        map.put(0x1f646, R.drawable.emoji_1f646);
        map.put(0x1f645, R.drawable.emoji_1f645);
        map.put(0x1f481, R.drawable.emoji_1f481);
        map.put(0x1f64b, R.drawable.emoji_1f64b);
        map.put(0x1f486, R.drawable.emoji_1f486);
        map.put(0x1f487, R.drawable.emoji_1f487);
        map.put(0x1f485, R.drawable.emoji_1f485);
        map.put(0x1f470, R.drawable.emoji_1f470);
        map.put(0x1f64e, R.drawable.emoji_1f64e);
        map.put(0x1f64d, R.drawable.emoji_1f64d);
        map.put(0x1f647, R.drawable.emoji_1f647);
        map.put(0x1f3a9, R.drawable.emoji_1f3a9);
        map.put(0x1f451, R.drawable.emoji_1f451);
        map.put(0x1f452, R.drawable.emoji_1f452);
        map.put(0x1f45f, R.drawable.emoji_1f45f);
        map.put(0x1f45e, R.drawable.emoji_1f45e);
        map.put(0x1f461, R.drawable.emoji_1f461);
        map.put(0x1f460, R.drawable.emoji_1f460);
        map.put(0x1f462, R.drawable.emoji_1f462);
        map.put(0x1f455, R.drawable.emoji_1f455);
        map.put(0x1f454, R.drawable.emoji_1f454);
        map.put(0x1f45a, R.drawable.emoji_1f45a);
        map.put(0x1f457, R.drawable.emoji_1f457);
        map.put(0x1f3bd, R.drawable.emoji_1f3bd);
        map.put(0x1f456, R.drawable.emoji_1f456);
        map.put(0x1f458, R.drawable.emoji_1f458);
        map.put(0x1f459, R.drawable.emoji_1f459);
        map.put(0x1f4bc, R.drawable.emoji_1f4bc);
        map.put(0x1f45c, R.drawable.emoji_1f45c);
        map.put(0x1f45d, R.drawable.emoji_1f45d);
        map.put(0x1f45b, R.drawable.emoji_1f45b);
        map.put(0x1f453, R.drawable.emoji_1f453);
        map.put(0x1f380, R.drawable.emoji_1f380);
        map.put(0x1f302, R.drawable.emoji_1f302);
        map.put(0x1f484, R.drawable.emoji_1f484);
        map.put(0x1f49b, R.drawable.emoji_1f49b);
        map.put(0x1f499, R.drawable.emoji_1f499);
        map.put(0x1f49c, R.drawable.emoji_1f49c);
        map.put(0x1f49a, R.drawable.emoji_1f49a);
        map.put(0x2764, R.drawable.emoji_2764);
        map.put(0x1f494, R.drawable.emoji_1f494);
        map.put(0x1f497, R.drawable.emoji_1f497);
        map.put(0x1f493, R.drawable.emoji_1f493);
        map.put(0x1f495, R.drawable.emoji_1f495);
        map.put(0x1f496, R.drawable.emoji_1f496);
        map.put(0x1f49e, R.drawable.emoji_1f49e);
        map.put(0x1f498, R.drawable.emoji_1f498);
        map.put(0x1f48c, R.drawable.emoji_1f48c);
        map.put(0x1f48b, R.drawable.emoji_1f48b);
        map.put(0x1f48d, R.drawable.emoji_1f48d);
        map.put(0x1f48e, R.drawable.emoji_1f48e);
        map.put(0x1f464, R.drawable.emoji_1f464);
        map.put(0x1f465, R.drawable.emoji_1f465);
        map.put(0x1f4ac, R.drawable.emoji_1f4ac);
        map.put(0x1f463, R.drawable.emoji_1f463);
        map.put(0x1f4ad, R.drawable.emoji_1f4ad);
        map.put(0x1f595, R.drawable.emoji_1f595);
        map.put(0x1f918, R.drawable.emoji_1f918);
        map.put(0x1f590, R.drawable.emoji_1f590);
        map.put(0x270d, R.drawable.emoji_270d);
        map.put(0x1f441, R.drawable.emoji_1f441);
        map.put(0x1f642, R.drawable.emoji_1f642);
        map.put(0x1f917, R.drawable.emoji_1f917);
        map.put(0x1f914, R.drawable.emoji_1f914);
        map.put(0x1f644, R.drawable.emoji_1f644);
        map.put(0x1f910, R.drawable.emoji_1f910);
        map.put(0x1f913, R.drawable.emoji_1f913);
        map.put(0x2639, R.drawable.emoji_2639);
        map.put(0x1f641, R.drawable.emoji_1f641);
        map.put(0x1f643, R.drawable.emoji_1f643);
        map.put(0x1f912, R.drawable.emoji_1f912);
        map.put(0x1f915, R.drawable.emoji_1f915);
        map.put(0x1f911, R.drawable.emoji_1f911);

    }

    public static void bindSoftBankEmojis(SparseIntArray map) {
        map.put(0xe001, R.drawable.emoji_1f466);
        map.put(0xe002, R.drawable.emoji_1f467);
        map.put(0xe003, R.drawable.emoji_1f48b);
        map.put(0xe004, R.drawable.emoji_1f468);
        map.put(0xe00d, R.drawable.emoji_1f44a);
        map.put(0xe00e, R.drawable.emoji_1f44d);
        map.put(0xe00f, R.drawable.emoji_261d);
        map.put(0xe010, R.drawable.emoji_270a);
        map.put(0xe011, R.drawable.emoji_270c);
        map.put(0xe012, R.drawable.emoji_1f64b);
        map.put(0xe022, R.drawable.emoji_2764);
        map.put(0xe023, R.drawable.emoji_1f494);
        map.put(0xe04e, R.drawable.emoji_1f47c);
        map.put(0xe056, R.drawable.emoji_1f60a);
        map.put(0xe057, R.drawable.emoji_1f603);
        map.put(0xe058, R.drawable.emoji_1f61e);
        map.put(0xe059, R.drawable.emoji_1f620);
        map.put(0xe05a, R.drawable.emoji_1f4a9);
        map.put(0xe105, R.drawable.emoji_1f61c);
        map.put(0xe106, R.drawable.emoji_1f60d);
        map.put(0xe107, R.drawable.emoji_1f631);
        map.put(0xe108, R.drawable.emoji_1f613);
        map.put(0xe109, R.drawable.emoji_1f435);
        map.put(0xe11a, R.drawable.emoji_1f47f);
        map.put(0xe11b, R.drawable.emoji_1f47b);
        map.put(0xe11c, R.drawable.emoji_1f480);
        map.put(0xe14c, R.drawable.emoji_1f4aa);
        map.put(0xe22e, R.drawable.emoji_1f446);
        map.put(0xe22f, R.drawable.emoji_1f447);
        map.put(0xe230, R.drawable.emoji_1f448);
        map.put(0xe231, R.drawable.emoji_1f449);
        map.put(0xe327, R.drawable.emoji_1f493);
        map.put(0xe328, R.drawable.emoji_1f48c);
        map.put(0xe329, R.drawable.emoji_1f498);
        map.put(0xe32a, R.drawable.emoji_1f499);
        map.put(0xe32b, R.drawable.emoji_1f49a);
        map.put(0xe32c, R.drawable.emoji_1f49b);
        map.put(0xe32d, R.drawable.emoji_1f49c);
        map.put(0xe32e, R.drawable.emoji_2728);
        map.put(0xe32f, R.drawable.emoji_2b50);
        map.put(0xe330, R.drawable.emoji_1f4a8);
        map.put(0xe331, R.drawable.emoji_1f4a6);
        map.put(0xe401, R.drawable.emoji_1f625);
        map.put(0xe402, R.drawable.emoji_1f60f);
        map.put(0xe403, R.drawable.emoji_1f614);
        map.put(0xe404, R.drawable.emoji_1f601);
        map.put(0xe405, R.drawable.emoji_1f609);
        map.put(0xe406, R.drawable.emoji_1f623);
        map.put(0xe407, R.drawable.emoji_1f616);
        map.put(0xe408, R.drawable.emoji_1f62a);
        map.put(0xe409, R.drawable.emoji_1f445);
        map.put(0xe40a, R.drawable.emoji_1f606);
        map.put(0xe40b, R.drawable.emoji_1f628);
        map.put(0xe40c, R.drawable.emoji_1f637);
        map.put(0xe40d, R.drawable.emoji_1f633);
        map.put(0xe40e, R.drawable.emoji_1f612);
        map.put(0xe40f, R.drawable.emoji_1f630);
        map.put(0xe410, R.drawable.emoji_1f632);
        map.put(0xe411, R.drawable.emoji_1f62d);
        map.put(0xe412, R.drawable.emoji_1f602);
        map.put(0xe413, R.drawable.emoji_1f622);
        map.put(0xe414, R.drawable.emoji_263a);
        map.put(0xe415, R.drawable.emoji_1f605);
        map.put(0xe416, R.drawable.emoji_1f621);
        map.put(0xe417, R.drawable.emoji_1f61a);
        map.put(0xe418, R.drawable.emoji_1f618);
        map.put(0xe419, R.drawable.emoji_1f440);
        map.put(0xe41a, R.drawable.emoji_1f443);
        map.put(0xe41b, R.drawable.emoji_1f442);
        map.put(0xe41c, R.drawable.emoji_1f444);
        map.put(0xe41d, R.drawable.emoji_1f64f);
        map.put(0xe41e, R.drawable.emoji_1f44b);
        map.put(0xe41f, R.drawable.emoji_1f44f);
        map.put(0xe420, R.drawable.emoji_1f44c);
        map.put(0xe421, R.drawable.emoji_1f44e);
        map.put(0xe422, R.drawable.emoji_1f450);
        map.put(0xe423, R.drawable.emoji_1f645);
        map.put(0xe424, R.drawable.emoji_1f646);
        map.put(0xe425, R.drawable.emoji_1f491);
        map.put(0xe426, R.drawable.emoji_1f647);
        map.put(0xe427, R.drawable.emoji_1f64c);
        map.put(0xe428, R.drawable.emoji_1f46b);
        map.put(0xe429, R.drawable.emoji_1f46f);
        map.put(0xe515, R.drawable.emoji_1f471);
        map.put(0xe516, R.drawable.emoji_1f472);
        map.put(0xe517, R.drawable.emoji_1f473);
        map.put(0xe518, R.drawable.emoji_1f474);
        map.put(0xe519, R.drawable.emoji_1f475);
        map.put(0xe51a, R.drawable.emoji_1f476);
        map.put(0xe51b, R.drawable.emoji_1f477);
        map.put(0xe51c, R.drawable.emoji_1f478);
        map.put(0xe51d, R.drawable.emoji_1f5fd);
        map.put(0xe51e, R.drawable.emoji_1f482);
        map.put(0xe51f, R.drawable.emoji_1f483);
        map.put(0xe437, R.drawable.emoji_1f49d);
        map.put(0xe438, R.drawable.emoji_1f38e);
        map.put(0xe439, R.drawable.emoji_1f393);
    }
}
