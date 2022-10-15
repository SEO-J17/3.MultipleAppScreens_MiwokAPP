package study.seo.a3multipleappscreens_miwokapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import study.seo.a3multipleappscreens_miwokapp.data.DataSource

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)
        val myDataSet = DataSource().loadColors()
        val recyclerView = findViewById<RecyclerView>(R.id.color_recycler_view)

        //구분선 넣기
        val dividerItemDecoration =
            DividerItemDecoration(recyclerView.context, LinearLayoutManager(this).orientation)
        recyclerView.addItemDecoration(dividerItemDecoration)

        recyclerView.adapter = ItemAdapter(this, myDataSet)
        recyclerView.setBackgroundResource(R.color.category_colors)
        recyclerView.setHasFixedSize(true) //option
    }
}