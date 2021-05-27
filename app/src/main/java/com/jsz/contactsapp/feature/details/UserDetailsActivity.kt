package com.jsz.contactsapp.feature.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class UserDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        UserDetailsFragment.newInstance(
            userId = intent.getStringExtra(EXTRA_USER_ID)!!
        ).show(supportFragmentManager, "TAG")
    }

    companion object {
        private const val EXTRA_USER_ID = "EXTRA_USER_ID"

        fun buildIntent(context: Context, userId: String): Intent {
            return Intent(context, UserDetailsActivity::class.java)
                .putExtra(EXTRA_USER_ID, userId)
        }
    }
}

