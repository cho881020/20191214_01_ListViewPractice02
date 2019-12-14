package com.example.a20191214_01_listviewpractice02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.a20191214_01_listviewpractice02.R
import com.example.a20191214_01_listviewpractice02.datas.GameData

class GameAdapter(context:Context, resId:Int, list:ArrayList<GameData>)
    : ArrayAdapter<GameData>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.game_list_item, null)
        }
        val row = tempRow!!

        return row
    }


}