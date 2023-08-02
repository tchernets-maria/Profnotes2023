package ru.mry.profnotes

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface PostsDao {
    @Insert
    suspend fun insert(post: PostEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(posts: List<PostEntity>)

    @Query("SELECT * FROM posts")
    suspend fun getPosts(): List<PostEntity>

    @Query("SELECT * FROM posts")
    fun getPostsFlow(): Flow<List<PostEntity>>
}