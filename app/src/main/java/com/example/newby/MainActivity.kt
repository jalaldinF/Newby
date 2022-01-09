package com.example.newby

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newby.DataHolder.SampleData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val LAUNCH_DETAIL:Int=313
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
            if (resultCode==Activity.RESULT_OK){
                val str: String = data?.getSerializableExtra("result").toString()
                data_tv.text = str
        }
    }

    fun initViews(){
            send_btn.setOnClickListener(){
            var sampleData = SampleData("Jalal ad-Din",21)
            sendData(sampleData)
      }
    }

    fun sendData(sampleData: SampleData) {
        val intent = Intent(this,Reciever::class.java)
        intent.putExtra("user",sampleData)
        startActivityForResult(intent, LAUNCH_DETAIL)
    }
}