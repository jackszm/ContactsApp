package com.jsz.contactsapp.common

import androidx.recyclerview.widget.DiffUtil

interface HasId {
    val id: String
}

class HasIdItemCallback<T : HasId> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: T, newItem: T) = oldItem.hasIdEquals(newItem)
}

fun HasId.hasIdEquals(other: HasId?): Boolean {
    if (javaClass != other?.javaClass) return false
    if (this === other) return true
    return this == other
}
