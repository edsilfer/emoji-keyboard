package br.com.instachat.emojikeyboard

import android.content.Context
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

class doAsync(val background: () -> Any, val postExecute: (result: Any?) -> Unit)
    : AsyncTask<Void, Void, Any>() {
    init {
        execute()
    }

    override fun onPostExecute(result: Any?) {
        postExecute(result)
    }

    override fun doInBackground(vararg params: Void?): Any? {
        return background()
    }
}

fun AppCompatActivity.short_toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.long_toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}

fun currentTime(): Timestamp {
    return Timestamp(Date().time)
}

fun formatTimestamp(context: Context, timestamp: Timestamp, format: String): String =
        SimpleDateFormat(format, context.resources.configuration.locales[0]).format(timestamp)
