package com.jsz.contactsapp.common

import android.app.Activity
import android.util.DisplayMetrics
import kotlin.math.roundToInt

internal fun Activity.getScreenHeightRatio(ratio: Float): Int {
    val displayMetrics = DisplayMetrics()
    display?.getRealMetrics(displayMetrics)
    val height: Int = displayMetrics.heightPixels
    return (height * ratio).roundToInt()
}
