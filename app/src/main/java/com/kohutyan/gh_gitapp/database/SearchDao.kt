package com.kohutyan.gh_gitapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kohutyan.gh_gitapp.response.RESPONSE_ID

@Dao
interface SearchDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(searchEntry: SearchEntry)

    @Query("select * from searchResponse where id = $RESPONSE_ID")
    fun getSearchData():LiveData<SearchEntry>

}