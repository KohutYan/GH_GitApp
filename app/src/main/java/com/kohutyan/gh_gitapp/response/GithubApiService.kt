package com.kohutyan.gh_gitapp.response

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApiService {

    @GET("search/repositories")
    fun search(@Query("q") query: String): Call<SearchResponse>

    companion object Factory {
        fun create() {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build()

            val service = retrofit.create(GithubApiService::class.java)
        }
    }
}