package com.example.burclarkotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        var position = intent.extras?.get("tiklanilanOgePosition") as Int
        var tumBurcBilgileri = intent.extras?.get("tumBurcBilgileri") as ArrayList<Burc>

        tvBurcOzellikleri.setText(tumBurcBilgileri.get(position).burcGenelOzellikleri)
        header.setImageResource(tumBurcBilgileri.get(position).burcBuyukResim)

        setSupportActionBar(anim_toolbar)
        collapsing_toolbar.title = tumBurcBilgileri.get(position).burcAdi




    }
}