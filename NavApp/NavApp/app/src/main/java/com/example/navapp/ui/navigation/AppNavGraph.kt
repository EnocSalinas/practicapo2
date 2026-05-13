package com.example.navapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navapp.ui.screens.DetalleScreen
import com.example.navapp.ui.screens.InicioScreen
import com.example.navapp.ui.screens.PerfilScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.Inicio.route
    ) {
        composable(NavRoutes.Inicio.route) {
            InicioScreen(
                onVerDetalle = { navController.navigate(NavRoutes.Detalle.route) },
                onVerPerfil = { navController.navigate(NavRoutes.Perfil.route) }
            )
        }
        composable(NavRoutes.Detalle.route) {
            DetalleScreen(
                onVolver = { navController.popBackStack() },
                onVerPerfil = { navController.navigate(NavRoutes.Perfil.route) }
            )
        }
        composable(NavRoutes.Perfil.route) {
            PerfilScreen(
                onVolver = { navController.popBackStack() },
                onIrInicio = {
                    navController.navigate(NavRoutes.Inicio.route) {
                        popUpTo(NavRoutes.Inicio.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
