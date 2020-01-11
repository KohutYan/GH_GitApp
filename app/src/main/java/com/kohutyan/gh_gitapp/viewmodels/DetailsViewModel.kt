package com.kohutyan.gh_gitapp.viewmodels

import androidx.lifecycle.ViewModel
import com.kohutyan.gh_gitapp.database.SearchDao

class DetailsViewModel(dao: SearchDao) : ViewModel() {
    val searchResult = dao.getSearchData()
}
