package com.example.utem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.google.android.material.appbar.AppBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appbar = findViewById<AppBarLayout>(R.id.appbar_home)
        val cv1 = findViewById<CardView>(R.id.card1)
        val cv2 = findViewById<CardView>(R.id.card2)
        val cv3 = findViewById<CardView>(R.id.card3)

        appbar.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        )
        cv3.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, ChipGalleryHome::class.java)
            startActivity(intent)
        }
        )
    }
}
