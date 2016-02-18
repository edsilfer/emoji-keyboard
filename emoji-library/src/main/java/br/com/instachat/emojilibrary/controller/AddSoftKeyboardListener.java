package br.com.instachat.emojilibrary.controller;


import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/**
 * Created by edgar on 18/02/2016.
 */
public class AddSoftKeyboardListener {

    private Activity mActivity;
    private Boolean isKeyboardVisible = Boolean.FALSE;
    private SoftKeyboardListener mListener;

    public AddSoftKeyboardListener(Activity activity, SoftKeyboardListener mListener) {
        this.mActivity = activity;
        this.mListener = mListener;
        this.implementsSoftKeyboardListerner();
    }

    private void implementsSoftKeyboardListerner() {
        final View activityRootView = AddSoftKeyboardListener.this.mActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        activityRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int heightDiff = activityRootView.getRootView().getHeight() - activityRootView.getHeight();
                if (heightDiff > 100) {
                    if (!AddSoftKeyboardListener.this.isKeyboardVisible) {
                        AddSoftKeyboardListener.this.isKeyboardVisible = Boolean.TRUE;
                        AddSoftKeyboardListener.this.mListener.onKeyboardUp();
                    }
                } else if (AddSoftKeyboardListener.this.isKeyboardVisible) {
                    AddSoftKeyboardListener.this.isKeyboardVisible = Boolean.FALSE;
                    AddSoftKeyboardListener.this.mListener.onKeyboardDown();
                }
            }
        });
    }
}
