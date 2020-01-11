package com.kohutyan.gh_gitapp.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.kohutyan.gh_gitapp.viewmodels.DetailsViewModel
import com.kohutyan.gh_gitapp.R
import com.kohutyan.gh_gitapp.SearchAdapter
//import com.kohutyan.gh_gitapp.SearchItem
import com.kohutyan.gh_gitapp.response.Item


class DetailsFragment : Fragment() {

    //private val adapter: SearchAdapter()

    companion object {
        fun newInstance() = DetailsFragment()
    }

    //private lateinit var viewModel: DetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /*viewModel = ViewModelProviders.of(this).get(DetailsViewModel::class.java)
        viewModel.searchResult.observe(this, Observer { searchResult ->
            searchResult.items?.map { Item(it.url, it.name) }
            adapter.submitList(searchResult)
        })*/
    }

}
