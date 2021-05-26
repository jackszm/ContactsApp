package com.jsz.contactsapp.common.api

import android.content.Context
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
        loggingInterceptor: HttpLoggingInterceptor,
    ) = OkHttpClient.Builder()
        .cache(cache)
        .addInterceptor(loggingInterceptor)
        .build()

    fun provideLoggingInterceptor() = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.NONE)
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


    single { provideCache(context = get()) }

    single {
        provideHttpClient(
            cache = get(),
            loggingInterceptor = provideLoggingInterceptor()
        )
    }

    single {
        provideRetrofit(
            client = get(),
            moshi = provideMoshi()
        )
    }
}
