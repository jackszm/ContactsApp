package com.jsz.contactsapp.common.utils

import androidx.recyclerview.widget.DiffUtil

interface HasId {
    val id: String
}

class HasIdItemCallback<T : HasId> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.hasIdEquals(newItem)
    }
}

fun HasId.hasIdEquals(other: HasId?): Boolean {
    return when {
        javaClass != other?.javaClass -> false
        this === other -> true
        else -> this == other
    }
}
