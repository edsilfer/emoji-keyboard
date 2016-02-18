package br.com.instachat.emojikeyboard.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import br.com.instachat.emojikeyboard.fragments.FragmentEmojiNature;
import br.com.instachat.emojikeyboard.fragments.FragmentEmojiObjects;
import br.com.instachat.emojikeyboard.fragments.FragmentEmojiPeople;
import br.com.instachat.emojikeyboard.fragments.FragmentEmojiPlaces;
import br.com.instachat.emojikeyboard.fragments.FragmentEmojiRecents;
import br.com.instachat.emojikeyboard.fragments.FragmentEmojiSymbols;

public class EmojiTabAdapter extends FragmentPagerAdapter {

    private static FragmentEmojiRecents FRAGMENT_EMOJI_RECENTS = new FragmentEmojiRecents();
    private static FragmentEmojiPeople FRAGMENT_EMOJI_PEOPLE = new FragmentEmojiPeople();
    private static FragmentEmojiNature FRAGMENT_EMOJI_NATURE = new FragmentEmojiNature();
    private static FragmentEmojiObjects FRAGMENT_EMOJI_OBJECTS = new FragmentEmojiObjects();
    private static FragmentEmojiPlaces FRAGMENT_EMOJI_PLACES = new FragmentEmojiPlaces();
    private static FragmentEmojiSymbols FRAGMENT_EMOJI_SYMBOLS = new FragmentEmojiSymbols();


    // CONTRACT
    public EmojiTabAdapter(FragmentManager fm) {
        super(fm);
    }

    // CALLBACKS
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "RECENTS";
            case 1:
                return "PEOPLE";
            case 2:
                return "NATURE";
            case 3:
                return "OBJECTS";
            case 4:
                return "PLACES";
            case 5:
                return "SYMBOLS";
            default:
                return "UNKNOW";
        }
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FRAGMENT_EMOJI_RECENTS;
            case 1:
                return FRAGMENT_EMOJI_PEOPLE;
            case 2:
                return FRAGMENT_EMOJI_NATURE;
            case 3:
                return FRAGMENT_EMOJI_OBJECTS;
            case 4:
                return FRAGMENT_EMOJI_PLACES;
            case 5:
                return FRAGMENT_EMOJI_SYMBOLS;
            default:
                return FRAGMENT_EMOJI_RECENTS;
        }
    }
}
