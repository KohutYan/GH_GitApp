package com.kohutyan.gh_gitapp.response

data class Item(
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