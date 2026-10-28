package com.wetogether.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF075E54),
    secondary = Color(0xFF128C7E),
    tertiary = Color(0xFF25D366),
    background = Color(0xFFECE5DD),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF111B21),
    onSurface = Color(0xFF111B21),
)

@Composable
fun WeTogetherTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
