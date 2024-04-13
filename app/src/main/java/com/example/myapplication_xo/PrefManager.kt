package com.example.myapplication_xo

import android.content.Context
import android.content.SharedPreferences


class PrefManager:PrefInteface {
    override var pref : SharedPreferences? = null
    constructor(context: Context){
        pref = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
    }

    override fun getServer():String{
        return pref?.getString("server","") ?: ""
    }

    override fun getLogin():String{
        return pref?.getString("login","") ?: ""
    }

    override fun getPassword():String{
        return pref?.getString("password","") ?: ""
    }

    override fun setServer(value: String) {
        val edit = pref?.edit()
        edit?.putString("server", value)
        edit?.apply()
    }

    override fun setLogin(value: String) {
        val edit = pref?.edit()
        edit?.putString("login", value)
        edit?.apply()
    }

    override fun setPassword(value: String) {
        val edit = pref?.edit()
        edit?.putString("password", value)
        edit?.apply()
    }

}