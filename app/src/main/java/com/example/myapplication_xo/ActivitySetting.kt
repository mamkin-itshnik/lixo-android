package com.example.myapplication_xo


import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication_xo.databinding.ActivitySettingBinding

class ActivitySetting : AppCompatActivity() {
    lateinit var bindingClass : ActivitySettingBinding
    var pref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        pref = getSharedPreferences("settings", MODE_PRIVATE)
        bindingClass.editTextServer.setText(pref?.getString("server",""))
        bindingClass.editTextLogin.setText(pref?.getString("login",""))
        bindingClass.editTextPassword.setText(pref?.getString("password",""))
    }



    fun onClickToStart(view : View){
        setResult(RESULT_OK)
        finish()
    }

    fun onClickSave(view : View){
        val editTextServer = bindingClass.editTextServer.text.toString()
        val editTextLogin = bindingClass.editTextLogin.text.toString()
        val editTextPassword = bindingClass.editTextPassword.text.toString()
        val edit = pref?.edit()
        edit?.putString("server", editTextServer)
        edit?.putString("login", editTextLogin)
        edit?.putString("password", editTextPassword)
        edit?.apply()
    }
}