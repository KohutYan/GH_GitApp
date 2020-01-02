package com.kohutyan.gh_gitapp

import retrofit2.Call

class SearchRepository(val apiService: GithubApiService) {
    fun searchUsers(name: String): Call<Result> {
        return apiService.search(query = "$name in:name")
    }
}