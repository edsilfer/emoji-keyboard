package br.com.instachat.emojikeyboard.Controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import br.com.instachat.emojikeyboard.R;

/**
 * Created by edgar on 17/02/2016.
 */
public class AcitivityHomepage extends AppCompatActivity {

    private Toolbar mBottomPanel;
    private EditText mInput;

    // CALLBACKS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.act_homepage);
        this.getWindow().setBackgroundDrawable(this.getResources().getDrawable(R.drawable.background));
        this.initToolbar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.rsc_bottom_panel_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                break;
            case R.id.action_attach:
                break;
            case R.id.action_mic:
                break;
        }
        return Boolean.TRUE;
    }

    // INITIALIZATIONS
    private void initToolbar() {
        this.mBottomPanel = (Toolbar) this.findViewById(R.id.panel);
        this.mBottomPanel.setNavigationIcon(R.drawable.input_emoji);
        this.mBottomPanel.setTitleTextColor(0xFFFFFFFF);
        this.setSupportActionBar(this.mBottomPanel);
        this.getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.mInput = (EditText) this.mBottomPanel.findViewById(R.id.input);
    }


}
