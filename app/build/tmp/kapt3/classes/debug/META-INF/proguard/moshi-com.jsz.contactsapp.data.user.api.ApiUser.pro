-if class com.jsz.contactsapp.data.user.api.ApiUser
-keepnames class com.jsz.contactsapp.data.user.api.ApiUser
-if class com.jsz.contactsapp.data.user.api.ApiUser
-keep class com.jsz.contactsapp.data.user.api.ApiUserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
