package com.kohutyan.gh_gitapp.response

import com.google.gson.annotations.SerializedName
import com.kohutyan.gh_gitapp.response.Item

class SearchResponse {
    @SerializedName("items")
    var items: List<Item>? = null
    @SerializedName("incomplete_results")
    var incomplete_results: Boolean? = null
    @SerializedName("total_count")
    var total_count:Int? = null
}