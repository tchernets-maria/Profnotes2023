package ru.mry.profnotes

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Database.init(this)
    }
}