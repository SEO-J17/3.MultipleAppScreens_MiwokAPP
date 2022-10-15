package study.seo.a3multipleappscreens_miwokapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import study.seo.a3multipleappscreens_miwokapp.data.DataSource

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_page)

        findViewById<ListView>(R.id.infoPage)?.apply {
            adapter = ListAdapter(this@PhrasesActivity, DataSource().loadPharse())
            setBackgroundResource(R.color.category_phrases)
        } ?: ToastErrorMessage()
            .errorMessage(this@PhrasesActivity)
    }
}