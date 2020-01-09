package com.kohutyan.gh_gitapp.response

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val ITEM_ID = 0

@Entity(tableName = "item")

data class Item(
    @SerializedName("name")
    val name: String,
    /*@SerializedName("id")
    val id: Long,*/
    @SerializedName("url")
    val url: String,
    @SerializedName("html_url")
    val html_url: String,
    @SerializedName("created_at")
    val created_at: String,
    @SerializedName("updated_at")
    val updated_at: String,
    @SerializedName("pushed_at")
    val pushed_at: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("score")
    val score: Int
) {
    @PrimaryKey(autoGenerate = false)
    val id: Int = ITEM_ID
}