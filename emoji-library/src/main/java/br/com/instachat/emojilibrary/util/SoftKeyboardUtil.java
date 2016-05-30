package br.com.instachat.emojilibrary.util;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;


public class SoftKeyboardUtil {

    public static final String TAG = "SoftKeyboardUtil";

    public static void dismissSoftKeyboard(Context context, EditText editText) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        editText.clearFocus();
    }

    public static void showSoftKeyboard(Context context, EditText editText) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        editText.requestFocus();
    }

}
