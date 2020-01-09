package com.kohutyan.gh_gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kohutyan.gh_gitapp.response.Item
import com.kohutyan.gh_gitapp.response.SearchResponse
import kotlinx.android.synthetic.main.search_list_fragment.*

class MainActivity : AppCompatActivity() {

    val items = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView_search.adapter = SearchAdapter(items)
        recyclerView_search.layoutManager = LinearLayoutManager(this)
    }
}
