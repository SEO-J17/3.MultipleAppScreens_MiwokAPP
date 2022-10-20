package study.seo.a3multipleappscreens_miwokapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import study.seo.a3multipleappscreens_miwokapp.data.DataSource
import study.seo.a3multipleappscreens_miwokapp.databinding.ActivityInfoPageBinding

class FamilyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfoPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoPage.apply {
            adapter = ListAdapter(DataSource.loadFamily())
            setBackgroundResource(R.color.category_family)
        }
    }
}