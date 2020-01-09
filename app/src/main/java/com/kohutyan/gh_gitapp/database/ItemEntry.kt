package com.kohutyan.gh_gitapp.database

import androidx.room.ColumnInfo

data class ItemEntry (
    @ColumnInfo(name = "name")
    val name: String,
    /*@ColumnInfo(name = "id")
    val id: Long,*/
    @ColumnInfo(name = "url")
    val url: String,
    @ColumnInfo(name = "html_url")
    val html_url: String,
    @ColumnInfo(name = "created_at")
    val created_at: String,
    @ColumnInfo(name = "updated_at")
    val updated_at: String,
    @ColumnInfo(name = "pushed_at")
    val pushed_at: String,
    @ColumnInfo(name = "language")
    val language: String,
    @ColumnInfo(name = "score")
    val score: Int
)