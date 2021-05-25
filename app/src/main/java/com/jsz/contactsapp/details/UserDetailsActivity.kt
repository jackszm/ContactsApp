package com.jsz.contactsapp.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.jsz.contactsapp.databinding.ActivityUserDetailsBinding

class UserDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra(EXTRA_USER_NAME)
        val userImageUrl = intent.getStringExtra(EXTRA_USER_IMAGE_URL)
        binding.userNameTextView.text = userName
        binding.userImageView.load(userImageUrl)
    }

    companion object {
        private const val EXTRA_USER_NAME = "EXTRA_USER_NAME"
        private const val EXTRA_USER_IMAGE_URL = "EXTRA_USER_IMAGE_URL"

        fun buildIntent(context: Context, name: String, imageUrl: String): Intent {
            return Intent(context, UserDetailsActivity::class.java)
                .putExtra(EXTRA_USER_NAME, name)
                .putExtra(EXTRA_USER_IMAGE_URL, imageUrl)
        }
    }
}
