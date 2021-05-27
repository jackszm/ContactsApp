package com.jsz.contactsapp.common.ext

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.widget.NestedScrollView
import com.jsz.contactsapp.R

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.inflater(): LayoutInflater = LayoutInflater.from(this.context)

fun View.adjustElevationAndAlphaBasedOnScroll(
    nestedScrollView: NestedScrollView,
    impactElevation: Boolean = false,
    impactAlpha: Boolean = false,
) {
    val maxElevation = resources.getDimension(R.dimen.scrolling_effects_elevation)
    val targetDistance = resources.getDimension(R.dimen.scrolling_effects_spacing)
    nestedScrollView.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { _, _, scrollY, _, _ ->

        if (impactAlpha) {
            val alpha = (scrollY.toFloat().coerceAtMost(targetDistance) / targetDistance) * 255F
            this.setBackgroundColor(Color.argb(alpha.toInt(), 255, 255, 255))
        }

        if (impactElevation) {
            val elevation = ((scrollY - targetDistance).coerceAtLeast(0F) / 4F).coerceAtMost(maxElevation)
            ViewCompat.setElevation(this, elevation)
        }
    })
}

