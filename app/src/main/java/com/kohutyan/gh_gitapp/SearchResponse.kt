package com.kohutyan.gh_gitapp

data class Repository(
    val name: String,
    val id: Long,
    val url: String,
    val html_url: String,
    val created_at: String,
    val updated_at: String,
    val pushed_at: String,
    val language: String,
    val score: Int
)

data class Result (val total_count: Int, val incomplete_results: Boolean, val items: List<Repository>)