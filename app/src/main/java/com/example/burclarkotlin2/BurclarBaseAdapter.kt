package com.example.burclarkotlin2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*
import java.util.*

class BurclarBaseAdapter(context: Context , tumBurcBilgileri:ArrayList<Burc>) : BaseAdapter() {

    var tumBurclar:ArrayList<Burc>
    var context:Context

    init {
       this.tumBurclar = tumBurcBilgileri
        this.context = context


    }
    override fun getCount(): Int {
        return tumBurclar.size
    }

    override fun getItem(position: Int): Any {
        return tumBurclar.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var tek_satir_view = convertView
        var viewHolder:ViewHolder2
        if (tek_satir_view == null){
            var inflater = LayoutInflater.from(context)
            tek_satir_view = inflater.inflate(R.layout.tek_satir,parent,false)

            viewHolder = ViewHolder2(tek_satir_view)
            tek_satir_view.tag=viewHolder
        }else{
            viewHolder = tek_satir_view.getTag() as ViewHolder2
        }


        viewHolder.burcResim.setImageResource(tumBurclar.get(position).burcSembol)
        viewHolder.burcAdi.setText(tumBurclar.get(position).burcAdi)
        viewHolder.burcTarihi.setText(tumBurclar.get(position).burcTarihi)
        return tek_satir_view
    }
}



class ViewHolder2 (tek_satir_view:View){
    var burcResim:ImageView
    var burcAdi:TextView
    var burcTarihi:TextView

    init {
        this.burcResim = tek_satir_view.imgBurcSembol
        this.burcAdi = tek_satir_view.textViewBurcAdi
        this.burcTarihi = tek_satir_view.textViewDetay
    }
}