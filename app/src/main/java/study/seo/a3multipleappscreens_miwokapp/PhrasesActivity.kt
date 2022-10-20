package study.seo.a3multipleappscreens_miwokapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import study.seo.a3multipleappscreens_miwokapp.data.DataSource
import study.seo.a3multipleappscreens_miwokapp.databinding.ActivityInfoPageBinding

class PhrasesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoPage.apply {
            adapter = ListAdapter(DataSource.loadPharse())
            setBackgroundResource(R.color.category_phrases)
        }
    }
}