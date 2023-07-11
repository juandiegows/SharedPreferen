package sph.hrt.sharedpreferen.config

import android.app.Application

class SharedPreferentApplication : Application() {
    companion object {
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(this)
    }
}