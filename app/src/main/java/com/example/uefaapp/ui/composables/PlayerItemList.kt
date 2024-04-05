package com.example.uefaapp.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.uefaapp.data.model.Player
import com.example.uefaapp.ui.theme.LARGE_PADDING
import com.example.uefaapp.ui.theme.LARGE_TEXT_SIZE
import com.example.uefaapp.ui.theme.SMALL_PADDING
import com.example.uefaapp.ui.theme.uclListBackground
import com.example.uefaapp.ui.theme.uelListBackground
import com.example.uefaapp.util.Constants
import com.example.uefaapp.util.Positions

@Composable
fun PlayerItemList(
    title: String,
    players: List<Player>,
    competition: Int
) {
    val background = when (competition) {
        Constants.UCL_NAV_ID -> uclListBackground
        Constants.UEL_NAV_ID -> uelListBackground
        else -> uclListBackground
    }
    Column(
        Modifier
            .background(background)
            .padding(
                top = LARGE_PADDING,
                bottom = LARGE_PADDING
            )
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .background(background)
                .padding(
                    start = LARGE_PADDING,
                    bottom = SMALL_PADDING,
                    end = LARGE_PADDING
                ),
            text = title,
            fontSize = LARGE_TEXT_SIZE,
            color = Color.White
        )

        Column {
            for (player in players) {
                PlayerItem(
                    player = player,
                    competition = competition
                )
            }
        }
    }
}

@Composable
@Preview
private fun PlayerItemListPreview() {
    PlayerItemList(
        title = Positions.FORWARDS.positionName,
        players = listOf(
            Player(
                id = 0,
                name = "PlayerName",
                country = "Country",
                age = 24,
                position = Positions.FORWARDS.positionName,
                thumbnail = null
            ),
            Player(
                id = 0,
                name = "PlayerName",
                country = "Country",
                age = 24,
                position = Positions.FORWARDS.positionName,
                thumbnail = null
            ),
            Player(
                id = 0,
                name = "PlayerName",
                country = "Country",
                age = 24,
                position = Positions.FORWARDS.positionName,
                thumbnail = null
            )
        ),
        competition = 0
    )
}