package ru.mry.profnotes

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("posts/{userId}")
    suspend fun getPosts(
        @Path("userId") userId: String,
    ): List<Posts>
}