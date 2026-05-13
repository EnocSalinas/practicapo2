# NavApp – Navegación entre Pantallas

Aplicación Android desarrollada con Jetpack Compose que implementa navegación entre 3 pantallas usando Navigation Component.

## Pantallas

| Pantalla | Descripción | Componente interactivo |
|----------|-------------|------------------------|
| **Inicio** | Pantalla principal de bienvenida | Botones para navegar a Detalle y Perfil |
| **Detalle** | Información adicional | Contador con botones + y − |
| **Perfil** | Resumen del usuario | Switch para activar/desactivar notificaciones |

## Flujo de navegación

```
Inicio ──→ Detalle ──→ Perfil
  │                      │
  └──────────────────────┘
         (ciclo continuo)
```

## Tecnologías

- Kotlin
- Jetpack Compose
- Navigation Compose
- Material 3

## Cómo ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/NavApp.git
   ```
2. Abrir en **Android Studio** (Hedgehog o superior).
3. Esperar que Gradle sincronice las dependencias.
4. Conectar un dispositivo o iniciar un emulador con **API 24+**.
5. Presionar **Run ▶**.

## Requisitos

- Android Studio Hedgehog (2023.1.1) o superior
- JDK 11
- Android SDK API 24 mínimo / API 35 target
