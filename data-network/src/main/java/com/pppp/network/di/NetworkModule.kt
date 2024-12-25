package com.pppp.network.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import org.screech.ScreechClientApi

@Module
@InstallIn(SingletonComponent::class)
interface NetworkModule {

    companion object {

        @Provides
        fun provideScreechClientApi(): ScreechClientApi = ScreechClientApi(HttpClient(CIO))
    }
}