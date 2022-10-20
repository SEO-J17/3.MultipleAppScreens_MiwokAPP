package study.seo.a3multipleappscreens_miwokapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import study.seo.a3multipleappscreens_miwokapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.numbers.setOnClickListener {
            startActivity(Intent(this, NumberActivity::class.java))
        }

        binding.family.setOnClickListener {
            startActivity(Intent(this, FamilyActivity::class.java))
        }

        binding.colors.setOnClickListener {
            startActivity(Intent(this, ColorActivity::class.java))
        }

        binding.phrases.setOnClickListener {
            startActivity(Intent(this, PhrasesActivity::class.java))
        }
    }
}


