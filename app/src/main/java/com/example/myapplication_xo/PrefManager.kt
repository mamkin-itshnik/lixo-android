package com.example.myapplication_xo

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class PrefManager {
    var pref : SharedPreferences? = null
    constructor(context: Context){
        pref = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
    }


    fun setPref(keyPref:String, valPref:String){
        val edit = pref?.edit()
        edit?.putString(keyPref, valPref)
        edit?.apply()
    }

    fun getPref(keyPref:String):String {
        Log.d("xnsds", pref?.getString(keyPref,"123")!!)
        return pref?.getString(keyPref,"") ?: "ла-ла-ла"

    }

}