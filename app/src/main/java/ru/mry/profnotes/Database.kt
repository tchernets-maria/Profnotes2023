package ru.mry.profnotes

import android.content.Context
import androidx.room.Room

object Database {
    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context
    }

    private val appDatabase: AppDatabase by lazy {
        Room.databaseBuilder(applicationContext, AppDatabase::class.java, "database.db")
            .build()
    }

    val postsDao by lazy { appDatabase.getPostsDao() }
}