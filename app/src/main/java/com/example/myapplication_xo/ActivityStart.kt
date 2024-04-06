package com.example.myapplication_xo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100) Log.d("MyLogXO", "Возврат из настроек осуществлен")
        if(requestCode==101) Log.d("MyLogXO", "Возврат из игры осуществлен")
    }
    fun onClickToGame(view : View){
        val i = Intent(this, MainActivity::class.java)
        startActivityForResult(i,101)
    }
    fun onClickToSetting(view : View){
        val i = Intent(this, ActivitySetting::class.java)
        startActivityForResult(i,100)
    }
}