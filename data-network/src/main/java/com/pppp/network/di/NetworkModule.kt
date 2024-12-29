package com.pppp.network.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.compression.ContentEncoding
import io.ktor.client.plugins.defaultRequest
import org.screech.ScreechClientApi

@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    companion object {

        @Provides
        fun provideScreechClientApi(httpClient: HttpClient): ScreechClientApi = ScreechClientApi(httpClient)

        @Provides
        fun provideHttpClient(): HttpClient {
            return HttpClient {
                install(ContentEncoding) {
                    gzip()
                    deflate()
                }
                defaultRequest {
                    url("https://bsky.social")
                }
            }
        }

    }
}