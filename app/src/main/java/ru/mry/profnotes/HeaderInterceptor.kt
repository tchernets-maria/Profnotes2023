package ru.mry.profnotes

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
            .addHeader("Header-name", "Header-value")
            .build()

        val response = chain.proceed(newRequest)
        return response
    }
}