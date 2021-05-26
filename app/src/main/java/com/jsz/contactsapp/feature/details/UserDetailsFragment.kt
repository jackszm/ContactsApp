package com.jsz.contactsapp.feature.details

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import coil.load
import coil.transform.CircleCropTransformation
import com.jsz.contactsapp.R
import com.jsz.contactsapp.common.ext.doNothing
import com.jsz.contactsapp.common.ext.exhaustive
import com.jsz.contactsapp.common.ui.BottomSheetFragment
import com.jsz.contactsapp.databinding.UserDetailsFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class UserDetailsFragment : BottomSheetFragment(R.layout.user_details_fragment) {

    override val config = Config(showFullHeight = false)

    private lateinit var binding: UserDetailsFragmentBinding

    private val viewModel by viewModel<UserDetailsViewModel> {
        parametersOf(requireArguments().getString(EXTRA_USER_ID)!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = UserDetailsFragmentBinding.bind(view)
        viewModel.state.observe(this) {
            when (it) {
                is UserDetailsViewModel.State.Data -> {
                    binding.imgUser.load(it.imageUrl) {
                        crossfade(true)
                        transformations(CircleCropTransformation())
                    }
                    binding.txtUserFullName.text = it.fullName
                }
                UserDetailsViewModel.State.Loading -> {
                    doNothing() // TODO: Show loading spinner
                }
                UserDetailsViewModel.State.Error -> {
                    doNothing() // TODO: Show error
                }
            }.exhaustive
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        requireActivity().finish()
    }

    companion object {
        private const val EXTRA_USER_ID = "EXTRA_USER_ID"

        fun newInstance(userId: String): UserDetailsFragment {
            return UserDetailsFragment().apply {
                arguments = bundleOf(
                    EXTRA_USER_ID to userId
                )
            }
        }
    }
}
