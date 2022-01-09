package com.example.newby

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newby.DataHolder.SecondData
import kotlinx.android.synthetic.main.activity_reciever.*

class Reciever : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciever)

        setView()
        send2_btn.setOnClickListener(){
            val secondData = SecondData("badri",313)
         reply(secondData)
        }
    }
    fun setView(){
        val str = intent.getSerializableExtra("user")
        data2_tv.text = str.toString()
    }
    fun reply(something:SecondData){

        val intent = Intent()
        intent.putExtra("result",something)
        setResult(Activity.RESULT_OK,intent)
        finish()

    }
}