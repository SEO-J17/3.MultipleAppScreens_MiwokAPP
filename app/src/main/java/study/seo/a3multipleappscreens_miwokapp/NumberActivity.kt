package study.seo.a3multipleappscreens_miwokapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import study.seo.a3multipleappscreens_miwokapp.data.DataSource

class NumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_page)

        findViewById<ListView>(R.id.infoPage)?.apply {
            adapter = ListAdapter(this@NumberActivity, DataSource().loadNumbers())
            setBackgroundResource(R.color.category_numbers)
        } ?: ToastErrorMessage()
            .errorMessage(this@NumberActivity)
    }
}