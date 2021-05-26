package com.jsz.contactsapp.common.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jsz.contactsapp.common.ext.adjustElevationAndAlphaBasedOnScroll
import com.jsz.contactsapp.common.utils.getScreenHeightRatio
import com.jsz.contactsapp.databinding.BottomSheetFragmentBinding

abstract class BottomSheetFragment(
    @LayoutRes private val contentLayoutId: Int
) : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetFragmentBinding

    abstract val config: Config

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = BottomSheetFragmentBinding.inflate(inflater, container, false)
        inflater.inflate(contentLayoutId, binding.bottomsheetContent, true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bottomsheetHeader.adjustElevationAndAlphaBasedOnScroll(binding.bottomsheetContent, impactElevation = true)
        configureBottomSheetBehavior()
    }

    private fun configureBottomSheetBehavior() {
        val behavior = (requireDialog() as BottomSheetDialog).behavior
        val peekHeight = if (config.showFullHeight) PEEK_HEIGHT_FULL_HEIGHT else PEEK_HEIGHT_HALF
        val screenHeightRatio = requireActivity().getScreenHeightRatio(peekHeight)

        behavior.peekHeight = screenHeightRatio
    }

    data class Config(
        val showFullHeight: Boolean = false
    )
}

private const val PEEK_HEIGHT_HALF = 0.56F
private const val PEEK_HEIGHT_FULL_HEIGHT = 1F
