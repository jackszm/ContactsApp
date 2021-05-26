package com.jsz.contactsapp.feature.details

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import coil.load
import coil.transform.CircleCropTransformation
import com.jsz.contactsapp.R
import com.jsz.contactsapp.common.ui.BottomSheetFragment
import com.jsz.contactsapp.databinding.ActivityUserDetailsBinding
import com.jsz.contactsapp.databinding.UserDetailsFragmentBinding
import com.jsz.contactsapp.feature.details.UserDetailsViewModel.State.Data
import com.jsz.contactsapp.feature.details.UserDetailsViewModel.State.Loading
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class UserDetailsActivity : AppCompatActivity() {


    private lateinit var binding: ActivityUserDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        UserDetailsFragment.newInstance(
            userId = intent.getStringExtra(EXTRA_USER_ID)!!
        ).show(supportFragmentManager, "TAG")
//        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }

    companion object {
        private const val EXTRA_USER_ID = "EXTRA_USER_ID"

        fun buildIntent(context: Context, userId: String): Intent {
            return Intent(context, UserDetailsActivity::class.java)
                .putExtra(EXTRA_USER_ID, userId)
        }
    }
}

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
                is Data -> {
                    binding.txtUserFullName.text = it.fullName
                    binding.imgUser.load(it.imageUrl) {
                        crossfade(true)
                        transformations(CircleCropTransformation())
                    }
                }
                Loading -> {
                    // TODO:
                }
            }
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

