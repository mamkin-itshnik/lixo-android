package com.example.myapplication_xo

import android.content.SharedPreferences

interface PrefInteface {
    var pref : SharedPreferences?

    fun getServer():String
    fun getLogin():String
    fun getPassword():String

    fun setServer(value:String)
    fun setLogin(value:String)
    fun setPassword(value:String)
}