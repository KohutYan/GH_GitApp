package com.kohutyan.gh_gitapp.repository

import com.kohutyan.gh_gitapp.response.GithubApiService

object SearchRepositoryProvider {
    private lateinit var githubApiService: GithubApiService
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(
            githubApiService
        )
    }
}