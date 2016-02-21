package br.com.instachat.emojikeyboard.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.instachat.emojikeyboard.R;

/**
 * Created by edgar on 21/02/2016.
 */
public class FragmentWhatsApp extends Fragment {

    private View mRootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mRootView = inflater.inflate(R.layout.frag_whatsapp, container, false);
        return this.mRootView;
    }

}
