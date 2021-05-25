package com.jsz.contactsapp.api

import android.content.Context
import com.jsz.contactsapp.user.api.UsersApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

val apiModule = module {
    fun provideCache(context: Context): Cache {
        val cacheSize = (5 * 1024 * 1024).toLong() // 5 MB
        return Cache(context.cacheDir, cacheSize)
    }

    fun provideHttpClient(
        cache: Cache,
//    responseCachingInterceptor: Interceptor,
//    offlineCachingInterceptor: Interceptor,
        loggingInterceptor: HttpLoggingInterceptor,
    ) = OkHttpClient.Builder()
        .cache(cache)
        .addInterceptor(loggingInterceptor)
        .build()

// fun provideResponseCachingInterceptor() = Interceptor { chain ->
//    val originalResponse: Response = chain.proceed(chain.request())
//    originalResponse.newBuilder()
//        .removeHeader("Pragma")
//        .header("Cache-Control", "public, max-age=" + 5000)
//        .build()
//}
//
// fun provideOfflineCachingInterceptor(context: Context) = Interceptor { chain ->
//    var request: Request = chain.request()
//    if (!hasNetwork(context)) {
//        request = request.newBuilder()
//            .removeHeader("Pragma")
//            .header("Cache-Control", "public, only-if-cached")
//            .build()
//    }
//    chain.proceed(request)
//}
//
//    fun provideHasNetwork(context: Context): Boolean {
//        val connectivityManager =
//            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
//        return activeNetwork != null && activeNetwork.isConnected
//    }

    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.NONE)
//        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    fun provideMoshi() = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    fun provideRetrofit(
        client: OkHttpClient,
        moshi: Moshi,
    ) = Retrofit.Builder()
        .baseUrl("https://randomuser.me/")
        .client(client)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()


//    single { offlineCachingInterceptor(context = get()) }

    single { provideCache(context = get()) }

    single {
        provideHttpClient(
            cache = get(),
//            responseCachingInterceptor = provideResponseCachingInterceptor(),
//            offlineCachingInterceptor = get(),
            loggingInterceptor = provideLoggingInterceptor()
        )
    }

    single {
        provideRetrofit(
            client = get(),
            moshi = provideMoshi()
        )
    }

    single {
        get<Retrofit>().create(UsersApiService::class.java)
    }
}
