package com.pppp.login.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pppp.Result
import com.pppp.login.domain.LoginUseCase
import com.pppp.login.domain.models.CreateSession
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val loginUseCase: LoginUseCase) : ViewModel() {

    fun login(
        username: String,
        password: String
    ) {
        viewModelScope.launch {
            loginUseCase.createSession(username, password).collect{
                foo(it)
            }
        }
    }

    private fun foo(it: Result<CreateSession>) {

    }

}