package com.kohutyan.gh_gitapp.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kohutyan.gh_gitapp.R
import com.kohutyan.gh_gitapp.viewmodels.SearchListViewModel


class   SearchList : Fragment() {

    companion object {
        fun newInstance() = SearchList()
    }

    private lateinit var viewModel: SearchListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SearchListViewModel::class.java)
        // TODO: Use the ViewModel

    }

}
