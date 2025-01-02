package com.pppp.themeandcomponents.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.AppTheme

@Composable
fun ScreechButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    content: @Composable RowScope.() -> Unit = {},
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = color,
        ),
        content = content,
    )
}

@Preview
@Composable
fun ScreechButtonPreview() {
    AppTheme {
        ScreechButton {
            Text(text = "Test")
        }
    }
}