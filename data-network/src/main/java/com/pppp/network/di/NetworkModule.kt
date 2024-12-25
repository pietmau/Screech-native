package com.pppp.network.di

import dagger.Module
import dagger.Provides
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import org.screech.ScreechClientApi

@Module
interface NetworkModule {

    companion object {

        @Provides
        fun provideScreechClientApi(): ScreechClientApi = ScreechClientApi(HttpClient(CIO))
    }
}