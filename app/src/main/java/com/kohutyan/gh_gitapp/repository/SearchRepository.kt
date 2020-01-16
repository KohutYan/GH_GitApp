package com.kohutyan.gh_gitapp.repository

import com.kohutyan.gh_gitapp.response.GithubApiService
import com.kohutyan.gh_gitapp.response.Item
import com.kohutyan.gh_gitapp.response.SearchResponse
import retrofit2.Call
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class SearchRepository(private val apiService: GithubApiService) {

    suspend fun searchRepos(name: String): List<Item> = suspendCoroutine {
        val items = apiService.search(query = "$name in:name").execute().body()!!.items
        it.resume(items)
    }
}