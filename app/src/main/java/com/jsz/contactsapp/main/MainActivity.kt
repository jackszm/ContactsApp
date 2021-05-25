package com.jsz.contactsapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsz.contactsapp.AppNavigator
import com.jsz.contactsapp.common.exhaustive
import com.jsz.contactsapp.common.gone
import com.jsz.contactsapp.common.visible
import com.jsz.contactsapp.databinding.ActivityMainBinding
import com.jsz.contactsapp.main.MainViewModel.NavigationEvent.OnUserClicked
import com.jsz.contactsapp.main.MainViewModel.State
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    private val navigator by lazy { AppNavigator(this) }

    private lateinit var binding: ActivityMainBinding

    private val adapter = UsersAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
                is OnUserClicked -> navigator.toUserDetails(it.name, it.imageUrl)
            }.exhaustive
        }
    }
}
