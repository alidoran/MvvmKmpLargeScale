package ir.dorantech.ui.navigation

import kotlinx.serialization.Serializable

sealed interface RouteApp {
    @Serializable
    data object MainRoute : RouteApp

    @Serializable
    data object RetrofitRoute : RouteApp
}