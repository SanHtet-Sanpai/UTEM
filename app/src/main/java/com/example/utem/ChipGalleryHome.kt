package com.example.utem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.appbar.AppBarLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChipGalleryHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_gallery_home)

        val appbar = findViewById<AppBarLayout>(R.id.appbar_chip_gallery)

        appbar.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        )

        val chipRV = findViewById<RecyclerView>(R.id.id_rv_chip_list)

        // dummy chip thumbnail data
        val chipModelArrayList: ArrayList<ChipModel> = ArrayList<ChipModel>()
        chipModelArrayList.add(ChipModel("Chip 1", R.drawable.cpu))
        chipModelArrayList.add(ChipModel("Chip 2", R.drawable.gpu))
        chipModelArrayList.add(ChipModel("Chip 3", R.drawable.dram))
        chipModelArrayList.add(ChipModel("Chip 4", R.drawable.io))
        chipModelArrayList.add(ChipModel("Chip 5", R.drawable.cpu))
        chipModelArrayList.add(ChipModel("Chip 6", R.drawable.gpu))

        // we are initializing our adapter class and passing our arraylist to it.
        val chipAdapter = ChipAdapter(this, chipModelArrayList)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        chipRV.layoutManager = GridLayoutManager(this, 2)
        chipRV.adapter = chipAdapter
        chipAdapter.onItemClick = {
            val intent =  Intent(this,ChipInfo::class.java)
            intent.putExtra("chip",it)
            startActivity(intent)
        }
    }
}

