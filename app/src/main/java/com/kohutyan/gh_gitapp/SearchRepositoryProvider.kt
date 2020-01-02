package com.kohutyan.gh_gitapp

object SearchRepositoryProvider {
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService)
    }
}