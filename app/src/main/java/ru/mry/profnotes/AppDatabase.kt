package ru.mry.profnotes

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    version = 1,
    entities = [
        PostEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getPostsDao(): PostsDao
}