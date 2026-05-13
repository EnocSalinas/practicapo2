package com.example.navapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InicioScreen(
    onVerDetalle: () -> Unit,
    onVerPerfil: () -> Unit
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "🏠 Pantalla de Inicio",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Bienvenido a la app de navegación.\nDesde aquí puedes explorar las otras pantallas.",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = onVerDetalle,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver Detalle →")
            }

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = onVerPerfil,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver Perfil →")
            }
        }
    }
}
