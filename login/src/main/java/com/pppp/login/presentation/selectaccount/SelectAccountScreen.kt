package com.pppp.login.presentation.selectaccount

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pppp.login.R
import com.pppp.themeandcomponents.theme.AppTheme
import com.pppp.themeandcomponents.theme.padding
import com.pppp.themeandcomponents.theme.spacing

@Composable
fun SelectAccountScreen() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(MaterialTheme.padding.medium),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            modifier = Modifier.padding(bottom = MaterialTheme.spacing.medium),
            text = stringResource(id = R.string.select_account),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            modifier = Modifier.padding(bottom = MaterialTheme.spacing.small),
            text = stringResource(id = R.string.sign_in_as),
            style = MaterialTheme.typography.titleSmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
        )
        Row(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.outlineVariant,
                    shape = RoundedCornerShape(16.dp)
                )
                .fillMaxWidth()
                .height(100.dp),
        ) {
            Column {}
        }

    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL, showSystemUi = true)
@Composable
fun SelectAccountScreenPreview() {
    AppTheme {
        SelectAccountScreen()
    }
}

