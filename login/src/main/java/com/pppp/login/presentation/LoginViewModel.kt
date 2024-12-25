package com.pppp.login.presentation

import androidx.lifecycle.ViewModel
import com.pppp.login.domain.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val loginUseCase: LoginUseCase) : ViewModel() {

    fun login() {
        loginUseCase.createSession( "user", "password")
    }

}