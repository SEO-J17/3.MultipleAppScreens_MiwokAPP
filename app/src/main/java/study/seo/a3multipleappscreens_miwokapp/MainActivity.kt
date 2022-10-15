package study.seo.a3multipleappscreens_miwokapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.numbers).setOnClickListener(this)
        findViewById<TextView>(R.id.family).setOnClickListener(this)
        findViewById<TextView>(R.id.colors).setOnClickListener(this)
        findViewById<TextView>(R.id.phrases).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.numbers -> {
                startActivity(Intent(this, NumberActivity::class.java))
            }
            R.id.family -> {
                startActivity(Intent(this, FamilyActivity::class.java))
            }
            R.id.colors -> {
                startActivity(Intent(this, ColorActivity::class.java))
            }
            R.id.phrases -> {
                startActivity(Intent(this, PhrasesActivity::class.java))
            }
        }
    }
}


