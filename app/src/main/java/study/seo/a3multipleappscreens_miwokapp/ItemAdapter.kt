package study.seo.a3multipleappscreens_miwokapp

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import study.seo.a3multipleappscreens_miwokapp.data.ActivityData

class ItemAdapter(private val context: Context, private val dataset: List<ActivityData>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val numberView = view.findViewById<TextView>(R.id.item_title)
        val nameView = view.findViewById<TextView>(R.id.name_title)
        val imageView = view.findViewById<ImageView>(R.id.image)
        val layoutView = view.findViewById<LinearLayout>(R.id.parentLinearLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val number = dataset[position].numberData
        val name = dataset[position].nameData
        val media = dataset[position].mediaData
        holder.nameView.text = name
        holder.numberView.text = number
        if (dataset[position].imageData != -1) {
            val numberImage = dataset[position].imageData
            holder.imageView.setImageResource(numberImage)
        } else {
            //TODO: 이미지뷰 없애기
        }


        holder.layoutView.setOnClickListener(View.OnClickListener {
            val mMedia = MediaPlayer.create(context, media)
            mMedia.start()
            mMedia.setVolume(1.0f, 1.0f)
            mMedia.setOnCompletionListener {
                it.release()
            }
        })
    }

    override fun getItemCount(): Int = dataset.size
}