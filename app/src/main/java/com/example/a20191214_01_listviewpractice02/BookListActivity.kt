package com.example.a20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.adapters.BookAdapter
import com.example.a20191214_01_listviewpractice02.adapters.GameAdapter
import com.example.a20191214_01_listviewpractice02.datas.BookData
import com.example.a20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : BaseActivity() {

    val bookList = ArrayList<BookData>()
    var bookAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        addBooks()

        bookAdapter = BookAdapter(mContext, R.layout.book_list_item, bookList)
        bookListView.adapter = bookAdapter
    }

    fun addBooks() {
        bookList.add(BookData("드래곤볼", "일본"))
        bookList.add(BookData("해리포터", "영국"))
        bookList.add(BookData("반지의제왕", "미국"))
    }

}
