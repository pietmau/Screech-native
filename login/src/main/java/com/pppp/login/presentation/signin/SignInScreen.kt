package com.pppp.login.presentation.signin

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun SignInScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {
    viewModel.login("m-pietrantuono.bsky.social", "MP21gatti!")

}
