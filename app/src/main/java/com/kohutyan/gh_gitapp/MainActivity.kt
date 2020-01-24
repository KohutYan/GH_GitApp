package com.kohutyan.gh_gitapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kohutyan.gh_gitapp.fragments.SearchList
import com.kohutyan.gh_gitapp.response.GithubApiService
import com.kohutyan.gh_gitapp.response.Item
import com.kohutyan.gh_gitapp.viewmodels.SearchListViewModel
import kotlinx.android.synthetic.main.search_list_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* recyclerView_search.adapter = SearchAdapter(items)
        recyclerView_search.layoutManager = LinearLayoutManager(this)*/
        fun create() = GithubApiService.create()
    }

}
