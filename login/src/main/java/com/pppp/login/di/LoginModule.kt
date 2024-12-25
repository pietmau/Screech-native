package com.pppp.login.di

import com.pppp.login.data.RetrofitLoginRepository
import com.pppp.login.domain.LoginRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface LoginModule {

    @Binds
    fun bindLoginRepository(loginRepositoryImpl: RetrofitLoginRepository): LoginRepository

}