package com.example.a20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_game_detail.*

class GameDetailActivity : BaseActivity() {

    var mGameData:GameData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mGameData = intent.getSerializableExtra("gameData") as GameData


        titleTxt.text = mGameData?.title
        companyNameTxt.text = mGameData?.companyName


    }

}
