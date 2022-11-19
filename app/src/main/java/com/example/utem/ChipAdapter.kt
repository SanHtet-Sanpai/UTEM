package com.example.utem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChipAdapter(private val context: Context, ChipModelArrayList: ArrayList<ChipModel>) :
    RecyclerView.Adapter<ChipAdapter.Viewholder>() {

    var onItemClick: ( (ChipModel) -> Unit)? = null
    private val ChipModelArrayList: ArrayList<ChipModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChipAdapter.Viewholder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.chip_card_layout, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: ChipAdapter.Viewholder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: ChipModel = ChipModelArrayList[position]
        holder.chip_name.setText(model.getChip_name())
        holder.chip_thumbnail.setImageResource(model.getChip_thumbnail())
        holder.itemView.setOnClickListener{
                onItemClick?.invoke(model)
        }
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return ChipModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val chip_thumbnail: ImageView
         val chip_name: TextView

        init {
            chip_thumbnail = itemView.findViewById(R.id.id_chip_thumbnail)
            chip_name = itemView.findViewById(R.id.id_chip_name)
        }
    }

    // Constructor
    init {
        this.ChipModelArrayList = ChipModelArrayList
    }
}
