package com.jsz.contactsapp.common.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.jsz.contactsapp.common.ext.gone
import com.jsz.contactsapp.common.ext.visible
import com.jsz.contactsapp.databinding.LoadingErrorViewBinding

class LoadingErrorView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = LoadingErrorViewBinding.inflate(LayoutInflater.from(context), this)

    fun showLoading() {
        this.visible()
        binding.progressBar.visible()
        binding.errorView.gone()
    }

    fun showError() {
        this.visible()
        binding.progressBar.gone()
        binding.errorView.visible()
    }

    fun hide() {
        gone()
    }
}
