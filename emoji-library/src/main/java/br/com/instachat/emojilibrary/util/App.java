package br.com.instachat.emojilibrary.util;

import android.app.Application;
import android.content.Context;

/**
 * Helper class that provides a context throught the app to access resources
 */
public class App extends Application {

    private static App mApp = null;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mApp = this;
    }

    public static Context context() {
        return mApp.getApplicationContext();
    }
}
