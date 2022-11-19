package com.example.utem

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChipAttrAdapter (private val context: Context, ChipAttrModelArrayList: ArrayList<ChipAttrModel>) :
    RecyclerView.Adapter<ChipAttrAdapter.Viewholder>() {
    private val ChipAttrModelArrayList: ArrayList<ChipAttrModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChipAttrAdapter.Viewholder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.chip_spec, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: ChipAttrAdapter.Viewholder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: ChipAttrModel = ChipAttrModelArrayList[position]
        holder.chip_attr.setText(model.getChipAttr())
        holder.chip_val.setText(model.getChipAttr())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return ChipAttrModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chip_attr: TextView
        val chip_val: TextView

        init {
            chip_attr = itemView.findViewById(R.id.id_chip_attr)
            chip_val = itemView.findViewById(R.id.id_chip_attr_value)
        }
    }

    // Constructor
    init {
        this.ChipAttrModelArrayList = ChipAttrModelArrayList
    }
}
