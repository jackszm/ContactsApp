package com.jsz.contactsapp

import android.app.Activity
import com.jsz.contactsapp.feature.details.UserDetailsActivity

class AppNavigator(
    private val activity: Activity
) {
    fun toUserDetails(userId: String) {
        activity.startActivity(
            UserDetailsActivity.buildIntent(activity, userId)
        )
    }
}
