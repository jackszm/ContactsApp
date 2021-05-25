package com.jsz.contactsapp

import android.app.Activity
import com.jsz.contactsapp.details.UserDetailsActivity

class AppNavigator(
    private val activity: Activity
) {
    fun toUserDetails(name: String, imageUrl: String) {
        activity.startActivity(
            UserDetailsActivity.buildIntent(activity, name, imageUrl)
        )
    }
}
