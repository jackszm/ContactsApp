package com.jsz.contactsapp.common

import android.view.LayoutInflater
import android.view.View

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.inflater() = LayoutInflater.from(this.context)
