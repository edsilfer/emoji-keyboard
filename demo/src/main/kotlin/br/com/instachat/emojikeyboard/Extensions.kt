package br.com.instachat.emojikeyboard

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

/**
 * Asynchronous
 */
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

fun <T> delay(milliseconds: Long, task: () -> T): () -> T = {
    Thread.sleep(milliseconds)
    task()
}


/**
 * Time
 */
fun now(): Timestamp = Timestamp(Date().time)

fun Timestamp.format(format: String): String =
        SimpleDateFormat(format, Locale.ENGLISH).format(this)


/**
 * RecyclerView
 */
fun ViewGroup.inflate(layoutRes: Int): View =
        LayoutInflater.from(context).inflate(layoutRes, this, false)


/**
 * Other
 */
fun AppCompatActivity.shortToast(msg: String) =
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

inline fun <T> with(obj: T, f: T.() -> Unit) {
    obj.f()
}