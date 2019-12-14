package com.example.a20191214_01_listviewpractice02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.a20191214_01_listviewpractice02.R
import com.example.a20191214_01_listviewpractice02.datas.BookData
import com.example.a20191214_01_listviewpractice02.datas.GameData

class BookAdapter(context:Context, resId:Int, list:ArrayList<BookData>)
    : ArrayAdapter<BookData>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.book_list_item, null)
        }

        val row = tempRow!!

        val data = mList.get(position)

        val bookTitleTxt = row.findViewById<TextView>(R.id.bookTitleTxt)
        val bookCompanyTxt = row.findViewById<TextView>(R.id.bookCompanyTxt)


        bookTitleTxt.text = data.title
        bookCompanyTxt.text = data.companyName


        return row
    }


}