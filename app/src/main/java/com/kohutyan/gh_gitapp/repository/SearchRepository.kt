package com.kohutyan.gh_gitapp.repository

import com.kohutyan.gh_gitapp.response.GithubApiService
import com.kohutyan.gh_gitapp.response.SearchResponse
import retrofit2.Call

class SearchRepository(private val apiService: GithubApiService) {
    fun searchUsers(name: String): Call<SearchResponse> {
        return apiService.search(query = "$name in:name")
    }
}