package com.example.uefaapp.ui.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uefaapp.R
import com.example.uefaapp.ui.theme.COMPETITION_BUTTON_SIZE
import com.example.uefaapp.ui.theme.LARGE_BUTTON_TEXT_SIZE
import com.example.uefaapp.ui.theme.LARGE_PADDING
import com.example.uefaapp.ui.theme.welcomeIntroTextColor
import com.example.uefaapp.util.Constants.UCL_NAV_ID
import com.example.uefaapp.util.Constants.UEL_NAV_ID

@Composable
fun WelcomeScreen(
    navigateToCompetitionScreen: (competitionId: Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(LARGE_PADDING),
            textAlign = TextAlign.Center,
            text = stringResource(R.string.welcome_screen_intro),
            color = MaterialTheme.colors.welcomeIntroTextColor,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
        UclButton(
            navigateToCompetitionScreen = navigateToCompetitionScreen
        )
        UelButton(
            navigateToCompetitionScreen = navigateToCompetitionScreen
        )
    }
}

@Composable
fun UclButton(
    navigateToCompetitionScreen: (competitionId: Int) -> Unit
) {
    Button(
        onClick = { navigateToCompetitionScreen(UCL_NAV_ID) }
    ) {
        Column(
            modifier = Modifier
                .padding(LARGE_PADDING),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ucl_header),
                contentDescription = stringResource(R.string.ucl_image_description),
                modifier = Modifier.size(COMPETITION_BUTTON_SIZE)
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = stringResource(R.string.ucl_button_text),
                style = TextStyle(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center,
                fontSize = LARGE_BUTTON_TEXT_SIZE
            )

        }
    }
}

@Composable
fun UelButton(
    navigateToCompetitionScreen: (competitionId: Int) -> Unit
) {
    Button(
        onClick = { navigateToCompetitionScreen(UEL_NAV_ID) }
    ) {
        Column(
            modifier = Modifier
                .padding(LARGE_PADDING),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.uel_header),
                contentDescription = stringResource(R.string.uel_image_description),
                modifier = Modifier.size(COMPETITION_BUTTON_SIZE)
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = stringResource(R.string.uel_button_text),
                style = TextStyle(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center,
                fontSize = LARGE_BUTTON_TEXT_SIZE
            )

        }
    }
}

@Composable
@Preview
private fun WelcomeScreenPreview() {
    WelcomeScreen(
        navigateToCompetitionScreen = {}
    )
}