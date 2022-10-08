package sph.hrt.sharedpreferen.config

import android.app.Application
import android.content.Intent
import sph.hrt.sharedpreferen.MainActivity

class SharedPreferentApplication : Application() {
    companion object {
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        prefs = Prefs(this)
        super.onCreate()
        startActivity(Intent(this, MainActivity::class.java))
    }
}