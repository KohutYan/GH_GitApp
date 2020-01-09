package com.kohutyan.gh_gitapp.database

import androidx.room.ColumnInfo
import com.kohutyan.gh_gitapp.response.Item

data class SearchEntry(
    @ColumnInfo(name = "items")
    var items: List<Item>? = null,
    @ColumnInfo(name = "incomplete_results")
    var incomplete_results: Boolean? = null,
    @ColumnInfo(name = "total_count")
    var total_count: Int? = null
)