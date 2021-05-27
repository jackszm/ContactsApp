-if class com.jsz.contactsapp.data.user.api.ApiUsersResponse
-keepnames class com.jsz.contactsapp.data.user.api.ApiUsersResponse
-if class com.jsz.contactsapp.data.user.api.ApiUsersResponse
-keep class com.jsz.contactsapp.data.user.api.ApiUsersResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
