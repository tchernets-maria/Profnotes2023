package ru.mry.profnotes

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "posts")
data class PostEntity(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)
