package com.example.learnandroid.ui.components.searchbar

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.learnandroid.R
import com.example.learnandroid.ui.components.usersList.UsersListViewModel
import com.example.learnandroid.ui.utils.baseui.BaseFragment

class SearchBar : BaseFragment() {

    companion object {
        fun newInstance() = SearchBar()
    }

    val searchBarViewModel: SearchBarViewModel
        get() { return viewModel as SearchBarViewModel }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_bar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(this).get(SearchBarViewModel::class.java)
        super.onActivityCreated(savedInstanceState)
    }
}
