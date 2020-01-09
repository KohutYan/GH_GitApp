package com.kohutyan.gh_gitapp.response

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val RESPONSE_ID = 0

@Entity(tableName = "searchResponse")

class SearchResponse {
    @SerializedName("items")
    var items: List<Item>? = null
    @SerializedName("incomplete_results")
    var incomplete_results: Boolean? = null
    @SerializedName("total_count")
    var total_count: Int? = null

    @PrimaryKey(autoGenerate = false)
    var id: Int = RESPONSE_ID
}