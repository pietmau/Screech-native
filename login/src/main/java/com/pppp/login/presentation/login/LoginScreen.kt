package com.pppp.login.presentation.login

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel()
) {
    viewModel.login("m-pietrantuono.bsky.social", "MP21gatti!")


}
