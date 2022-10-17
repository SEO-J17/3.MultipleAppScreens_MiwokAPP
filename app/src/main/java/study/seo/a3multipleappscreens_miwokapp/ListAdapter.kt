package study.seo.a3multipleappscreens_miwokapp

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import study.seo.a3multipleappscreens_miwokapp.data.NumberData

class ListAdapter(
    private val context: Context,
    private val dataSet: List<NumberData>
) : BaseAdapter() {
    override fun getCount(): Int = dataSet.size

    override fun getItem(positon: Int): Any = dataSet[positon]

    override fun getItemId(positon: Int): Long = 0

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(
        positon: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val view = convertView ?: LayoutInflater
            .from(context)
            .inflate(R.layout.list_item, parent, false)

        with(dataSet[positon]) {
            view.findViewById<TextView>(R.id.item_title).text = numberData
            view.findViewById<TextView>(R.id.name_title).text = nameData
            view.findViewById<ImageView>(R.id.image).apply {
                if (imageData == -1) {
                    visibility = View.GONE
                } else {
                    setImageResource(imageData)
                }
            }
            viewClickEvent(this, view)
        }
        return view
    }

    private fun viewClickEvent(data: NumberData, view: View) {
        view.setOnClickListener {
            MediaPlayer.create(context, data.mediaData).apply {
                start()
                setOnCompletionListener {
                    release()
                }
            }
        }
    }
}