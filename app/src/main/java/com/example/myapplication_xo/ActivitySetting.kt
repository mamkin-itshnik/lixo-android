package com.example.myapplication_xo


import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication_xo.databinding.ActivitySettingBinding

class ActivitySetting : AppCompatActivity() {
    lateinit var bindingClass : ActivitySettingBinding
    //var pref : SharedPreferences? = null
    var prefManager:PrefManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        prefManager = PrefManager(this)

        //pref = getSharedPreferences("settings", MODE_PRIVATE)

        bindingClass.editTextServer.setText(prefManager!!.getPref("server"))
        bindingClass.editTextLogin.setText(prefManager!!.getPref("login"))
        bindingClass.editTextPassword.setText(prefManager!!.getPref("password"))
        Log.d("xnsds","huy")
        Log.d("xnsds",prefManager!!.getPref("password"))


    //bindingClass.editTextPassword.setText(pref?.getString("password",""))
    }



    fun onClickToStart(view : View){
        setResult(RESULT_OK)
        finish()
    }

    fun onClickSave(view : View){
        val editTextServer = bindingClass.editTextServer.text.toString()
        val editTextLogin = bindingClass.editTextLogin.text.toString()
        val editTextPassword = bindingClass.editTextPassword.text.toString()
        //val edit = pref?.edit()
        //edit?.putString("server", editTextServer)
        prefManager!!.setPref("server", editTextServer)
        prefManager!!.setPref("login", editTextLogin)
        prefManager!!.setPref("password", editTextPassword)


        //edit?.putString("login", editTextLogin)
        //edit?.putString("password", editTextPassword)
        //edit?.apply()
    }
}