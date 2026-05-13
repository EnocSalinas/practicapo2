package com.example.navapp.ui.navigation

sealed class NavRoutes(val route: String) {
    object Inicio : NavRoutes("inicio")
    object Detalle : NavRoutes("detalle")
    object Perfil : NavRoutes("perfil")
}
