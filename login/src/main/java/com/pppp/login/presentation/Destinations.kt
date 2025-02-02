package com.pppp.login.presentation

import kotlinx.serialization.Serializable

sealed interface EntryPoint {

    @Serializable
    object EntryPointScreen : EntryPoint

    @Serializable
    object CreateAccount : EntryPoint

    @Serializable
    object Login : EntryPoint
}