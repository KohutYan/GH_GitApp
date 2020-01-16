package com.kohutyan.gh_gitapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kohutyan.gh_gitapp.R
import com.kohutyan.gh_gitapp.repository.SearchRepository
import com.kohutyan.gh_gitapp.response.GithubApiService
import com.kohutyan.gh_gitapp.response.Item
import com.kohutyan.gh_gitapp.response.SearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SearchListViewModel(private val searchRepository: SearchRepository) : ViewModel() {

    private val _items = MutableLiveData<List<Item>>(emptyList())
    val items: LiveData<List<Item>> = _items

//    fun search() = searchRepository.searchRepos(query) as LiveData<*>

    fun onSearchClicked(query: String) {
        GlobalScope.launch {
            val repos = searchRepository.searchRepos(query)
            withContext(Dispatchers.Main) {
                _items.value = repos
            }
        }
    }
}