package study.seo.a3multipleappscreens_miwokapp

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import study.seo.a3multipleappscreens_miwokapp.data.NumberData
import study.seo.a3multipleappscreens_miwokapp.databinding.ListItemBinding

class ListAdapter(
    private val dataSet: List<NumberData>
) : BaseAdapter() {
    private lateinit var binding: ListItemBinding

    override fun getCount(): Int = dataSet.size

    override fun getItem(positon: Int): NumberData = dataSet[positon]

    override fun getItemId(positon: Int): Long = positon.toLong()

    override fun getView(
        positon: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        convertView ?: run {
            binding = ListItemBinding.inflate(parent.layoutInflater, parent, false)
        }

        with(dataSet[positon]) {
            binding.itemTitle.text = numberData
            binding.nameTitle.text = nameData
            binding.image.apply {
                if (imageData == -1) {
                    visibility = View.GONE
                } else {
                    setImageResource(imageData)
                }
            }
            viewClickEvent(this, binding.root.rootView)
        }
        return binding.root.rootView
    }
}

private inline val ViewGroup.layoutInflater: LayoutInflater
    get() = LayoutInflater.from(context)

private fun viewClickEvent(data: NumberData, view: View) {
    view.setOnClickListener {
        MediaPlayer.create(it.context, data.mediaData).apply {
            start()
            setOnCompletionListener {
                release()
            }
        }
    }
}