package com.example.utem

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout

class ChipInfo : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_info)

        viewPager = findViewById(R.id.idViewPager)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.cpu
        imageList = imageList + R.drawable.gpu
        imageList = imageList + R.drawable.io
        imageList = imageList + R.drawable.dram
        imageList = imageList + R.drawable.cpu

        viewPagerAdapter = ViewPagerAdapter(this@ChipInfo, imageList)
        viewPager.adapter = viewPagerAdapter

        val appbar = findViewById<AppBarLayout>(R.id.appbar_chip_info)
        appbar.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        )

        val chipAttrRV = findViewById<RecyclerView>(R.id.id_rv_chip_specs)

        // dummy chip thumbnail data
        val chipAttrModelArrayList: ArrayList<ChipAttrModel> = ArrayList<ChipAttrModel>()
        chipAttrModelArrayList.add(ChipAttrModel("attr 1", "value 1"))
        chipAttrModelArrayList.add(ChipAttrModel("attr 2", "value 2"))
        chipAttrModelArrayList.add(ChipAttrModel("attr 3", "value 3"))
        chipAttrModelArrayList.add(ChipAttrModel("attr 4", "value 4"))
        chipAttrModelArrayList.add(ChipAttrModel("attr 5","value 5"))
        chipAttrModelArrayList.add(ChipAttrModel("attr 6", "value 6"))

        // we are initializing our adapter class and passing our arraylist to it.
        val chipAttrAdapter = ChipAttrAdapter(this, chipAttrModelArrayList)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        chipAttrRV.layoutManager = LinearLayoutManager(this)
        chipAttrRV.adapter = chipAttrAdapter

        val chip = intent.getParcelableExtra<ChipModel>("chip")
        if (chip != null){
            val textView: TextView = findViewById(R.id.chip_info_title)

            textView.text = chip.getChip_name()
        }
    }

}