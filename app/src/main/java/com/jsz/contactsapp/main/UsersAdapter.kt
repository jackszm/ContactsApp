package com.jsz.contactsapp.main

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.jsz.contactsapp.common.HasIdItemCallback
import com.jsz.contactsapp.common.inflater
import com.jsz.contactsapp.databinding.ItemLetterBinding
import com.jsz.contactsapp.databinding.ItemUserBinding
import com.jsz.contactsapp.main.UsersListItemUiModel.LetterHeader
import com.jsz.contactsapp.main.UsersListItemUiModel.UserItemUiModel

class UsersAdapter : ListAdapter<UsersListItemUiModel, RecyclerView.ViewHolder>(HasIdItemCallback<UsersListItemUiModel>()) {
    enum class Type { LETTER, USER }

    override fun getItemViewType(position: Int) = when (getItem(position)) {
        is LetterHeader -> Type.LETTER.ordinal
        is UserItemUiModel -> Type.USER.ordinal
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = when (Type.values()[viewType]) {
        Type.LETTER -> LetterHeaderViewHolder.create(parent)
        Type.USER -> UserViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = getItem(position)) {
            is LetterHeader -> (holder as LetterHeaderViewHolder).bind(item)
            is UserItemUiModel -> (holder as UserViewHolder).bind(item)
        }
    }
}

class UserViewHolder(
    private val binding: ItemUserBinding,
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun create(parent: ViewGroup): UserViewHolder {
            val binding = ItemUserBinding.inflate(parent.inflater(), parent, false)
            return UserViewHolder(binding)
        }
    }

    fun bind(userItem: UserItemUiModel) {
        binding.imgUser.load(userItem.user.imageUrl) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        binding.txtUserFullName.text = userItem.user.fullName
        binding.txtUserEmail.text = userItem.user.email
        itemView.setOnClickListener { userItem.clickAction(userItem.user) }
    }
}

class LetterHeaderViewHolder(
    private val binding: ItemLetterBinding,
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun create(parent: ViewGroup): LetterHeaderViewHolder {
            val binding = ItemLetterBinding.inflate(parent.inflater(), parent, false)
            return LetterHeaderViewHolder(binding)
        }
    }

    fun bind(letter: LetterHeader) {
        binding.txtLetter.text = letter.letterLabel
    }
}

