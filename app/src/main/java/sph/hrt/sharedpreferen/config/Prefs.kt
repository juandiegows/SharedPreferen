package sph.hrt.sharedpreferen.config

import android.content.Context
import android.view.View

class Prefs(val context: Context) {


    val DB_PREFS = "DB_Example"
    val USER_NAME = "USER"
    val PASS_NAME = "PASS"

    fun SaveUser(user: String, pass: String) {
        var config = context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
        config.edit().putString(USER_NAME, user)
            .putString(PASS_NAME, pass).apply()
    }
    fun  GetPass():String?{
        var config = context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
        return  config.getString(PASS_NAME, null)
    }
    fun  GetUser():String?{
        var config = context.getSharedPreferences(DB_PREFS, Context.MODE_PRIVATE)
        return  config.getString(USER_NAME, null)
    }
}