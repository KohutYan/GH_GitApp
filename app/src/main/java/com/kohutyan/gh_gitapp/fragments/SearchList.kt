package com.kohutyan.gh_gitapp.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kohutyan.gh_gitapp.MainActivity
import com.kohutyan.gh_gitapp.R
import com.kohutyan.gh_gitapp.SearchAdapter
import com.kohutyan.gh_gitapp.viewmodels.SearchListViewModel
import kotlinx.android.synthetic.main.search_list_fragment.*


class   SearchList : Fragment() {

    companion object {
        fun newInstance() = SearchList()
    }

    private lateinit var viewModel: SearchListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val items = viewModel.items.value
        recyclerView_search.adapter = SearchAdapter(items)
        recyclerView_search.layoutManager = LinearLayoutManager(MainActivity())
        return inflater.inflate(R.layout.search_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SearchListViewModel::class.java)
        viewModel.items.observe(this, Observer {
            //TODO: set items into RV adapter
        })
        search_button.setOnClickListener {
            viewModel.onSearchClicked("XSmile2008")
        }
    }

}
