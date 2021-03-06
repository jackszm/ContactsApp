package com.jsz.contactsapp.feature.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsz.contactsapp.AppNavigator
import com.jsz.contactsapp.common.ext.exhaustive
import com.jsz.contactsapp.common.ext.gone
import com.jsz.contactsapp.common.ext.visible
import com.jsz.contactsapp.databinding.MainActivityBinding
import com.jsz.contactsapp.feature.main.MainViewModel.NavigationEvent.OnUserClicked
import com.jsz.contactsapp.feature.main.MainViewModel.State
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    private val navigator by lazy { AppNavigator(this) }

    private lateinit var binding: MainActivityBinding

    private val adapter = UsersAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.usersRecyclerView.adapter = adapter

        observeState()
        observeNavigationEvents()
    }

    private fun observeState() {
        viewModel.state.observe(this) { state ->
            when (state) {
                State.Loading -> {
                    binding.loadingErrorView.showLoading()
                    binding.swipeToRefresh.gone()
                }
                is State.Data -> {
                    binding.loadingErrorView.gone()
                    binding.swipeToRefresh.visible()
                    binding.swipeToRefresh.isRefreshing = state.refreshing
                    binding.swipeToRefresh.isEnabled = state.refreshing
                    adapter.submitList(state.items)
                }
                State.Error -> {
                    binding.loadingErrorView.showError()
                    binding.swipeToRefresh.gone()
                }
            }.exhaustive
        }
    }

    private fun observeNavigationEvents() {
        viewModel.navigationEvents.observe(this) {
            when (it) {
                is OnUserClicked -> navigator.toUserDetails(it.userId)
            }.exhaustive
        }
    }
}
