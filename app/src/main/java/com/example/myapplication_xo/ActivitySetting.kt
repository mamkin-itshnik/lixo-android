package com.example.myapplication_xo


import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication_xo.databinding.ActivitySettingBinding

class ActivitySetting : AppCompatActivity() {
    lateinit var bindingClass : ActivitySettingBinding
    var prefManager:PrefManager?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        prefManager = PrefManager(this)

        bindingClass.editTextServer.setText(prefManager!!.getServer())
        bindingClass.editTextLogin.setText(prefManager!!.getLogin())
        bindingClass.editTextPassword.setText(prefManager!!.getPassword())
        Log.d("xnsds","huy")
        Log.d("xnsds",prefManager!!.getPassword())
    }



    fun onClickToStart(view : View){
        setResult(RESULT_OK)
        finish()
    }

    fun onClickSave(view : View){
        val editTextServer = bindingClass.editTextServer.text.toString()
        val editTextLogin = bindingClass.editTextLogin.text.toString()
        val editTextPassword = bindingClass.editTextPassword.text.toString()

        prefManager!!.setServer(editTextServer)
        prefManager!!.setLogin(editTextLogin)
        prefManager!!.setPassword(editTextPassword)
    }
}