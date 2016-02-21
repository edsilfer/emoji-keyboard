package br.com.instachat.emojikeyboard.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import br.com.instachat.emojikeyboard.model.FragmentTelegram;
import br.com.instachat.emojikeyboard.model.FragmentWhatsApp;

/**
 * Created by edgar on 21/02/2016.
 */
public class TabAdapter extends FragmentPagerAdapter {

    private static FragmentTelegram FRAGMENT_TELEGRAM = new FragmentTelegram();
    private static FragmentWhatsApp FRAGMENT_WHATSAPP = new FragmentWhatsApp();


    // CONTRACT
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    // CALLBACKS
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "TELEGRAM";
            case 1:
                return "WHATS APP";
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
        return 2;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FRAGMENT_TELEGRAM;
            case 1:
                return FRAGMENT_WHATSAPP;
            default:
                return FRAGMENT_TELEGRAM;
        }
    }
}