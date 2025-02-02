package com.pppp.login.presentation.startup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pppp.themeandcomponents.theme.AppTheme
import com.pppp.login.R
import com.pppp.themeandcomponents.components.ScreechButton
import com.pppp.themeandcomponents.theme.ExtendedTheme
import com.pppp.themeandcomponents.theme.padding
import com.pppp.themeandcomponents.theme.spacing

@Composable
fun StartupScreen(
    createAccount: () -> Unit = {},
    login: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ExtendedTheme.colors.splash),
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.birb),
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.small),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.welcome),
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.watchadoing),
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(MaterialTheme.padding.medium),
            ) {
                ScreechButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = createAccount
                ) {
                    Text(text = stringResource(id = R.string.create_account))
                }

                ScreechButton(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = login,
                ) {
                    Text(
                        text = stringResource(id = R.string.sign_in),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun StartupScreenPreview() {
    AppTheme {
        StartupScreen()
    }
}