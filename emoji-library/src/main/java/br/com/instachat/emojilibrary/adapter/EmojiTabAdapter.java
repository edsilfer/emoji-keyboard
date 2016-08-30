package br.com.instachat.emojilibrary.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiNature;
import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiObjects;
import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiPeople;
import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiPlaces;
import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiRecents;
import br.com.instachat.emojilibrary.controller.emoji_pages.FragmentEmojiSymbols;
import br.com.instachat.emojilibrary.model.OnEmojiClickListener;

public class EmojiTabAdapter extends FragmentPagerAdapter {

    private FragmentEmojiRecents FRAGMENT_EMOJI_RECENTS = new FragmentEmojiRecents();
    private FragmentEmojiPeople FRAGMENT_EMOJI_PEOPLE = new FragmentEmojiPeople();
    private FragmentEmojiNature FRAGMENT_EMOJI_NATURE = new FragmentEmojiNature();
    private FragmentEmojiObjects FRAGMENT_EMOJI_OBJECTS = new FragmentEmojiObjects();
    private FragmentEmojiPlaces FRAGMENT_EMOJI_PLACES = new FragmentEmojiPlaces();
    private FragmentEmojiSymbols FRAGMENT_EMOJI_SYMBOLS = new FragmentEmojiSymbols();


    // CONTRACT
    public EmojiTabAdapter(FragmentManager fm) {
        super(fm);
        FRAGMENT_EMOJI_PEOPLE.subscribeRecentListener(FRAGMENT_EMOJI_RECENTS);
        FRAGMENT_EMOJI_NATURE.subscribeRecentListener(FRAGMENT_EMOJI_RECENTS);
        FRAGMENT_EMOJI_OBJECTS.subscribeRecentListener(FRAGMENT_EMOJI_RECENTS);
        FRAGMENT_EMOJI_PLACES.subscribeRecentListener(FRAGMENT_EMOJI_RECENTS);
        FRAGMENT_EMOJI_SYMBOLS.subscribeRecentListener(FRAGMENT_EMOJI_RECENTS);
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

    // GETTERS AND SETTERS
    public void setOnEmojiClickListener(OnEmojiClickListener listener) {
        FRAGMENT_EMOJI_RECENTS.addEmojiconClickListener(listener);
        FRAGMENT_EMOJI_PEOPLE.addEmojiconClickListener(listener);
        FRAGMENT_EMOJI_NATURE.addEmojiconClickListener(listener);
        FRAGMENT_EMOJI_OBJECTS.addEmojiconClickListener(listener);
        FRAGMENT_EMOJI_PLACES.addEmojiconClickListener(listener);
        FRAGMENT_EMOJI_SYMBOLS.addEmojiconClickListener(listener);
    }

}
