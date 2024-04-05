package com.example.uefaapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.uefaapp.R
import com.example.uefaapp.data.model.Player
import com.example.uefaapp.ui.theme.LARGE_PADDING
import com.example.uefaapp.ui.theme.NORMAL_TEXT_SIZE
import com.example.uefaapp.ui.theme.SMALL_PADDING
import com.example.uefaapp.ui.theme.SMALL_TEXT_SIZE
import com.example.uefaapp.ui.theme.THUMBNAIL_SIZE
import com.example.uefaapp.ui.theme.VERY_SMALL_PADDING
import com.example.uefaapp.ui.theme.uclListBackground
import com.example.uefaapp.ui.theme.uelListBackground
import com.example.uefaapp.util.Constants.UCL_NAV_ID
import com.example.uefaapp.util.Constants.UEL_NAV_ID
import com.example.uefaapp.util.Positions

@Composable
fun PlayerItem(
    player: Player,
    competition: Int
) {
    val background = when (competition) {
        UCL_NAV_ID -> uclListBackground
        UEL_NAV_ID -> uelListBackground
        else -> uclListBackground
    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .background(background)
                .padding(
                    start = LARGE_PADDING,
                    end = LARGE_PADDING,
                    top = VERY_SMALL_PADDING,
                    bottom = VERY_SMALL_PADDING
                ),
        ) {
//            Here should go image from Player.thumbnail URL when API is available
            Image(
                painterResource(id = R.drawable.avatar),
                contentDescription = stringResource(R.string.player_thumbnail),
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(THUMBNAIL_SIZE)
            )
            Column(
                modifier = Modifier
                    .padding(start = SMALL_PADDING, end = SMALL_PADDING)
                    .align(Alignment.CenterVertically)
                    .weight(1f)
            ) {
                Text(
                    text = player.name ?: "",
                    fontSize = NORMAL_TEXT_SIZE,
                    color = Color.White

                )
                Text(
                    text = player.country ?: "",
                    fontSize = SMALL_TEXT_SIZE,
                    color = Color.White
                )
            }
            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                text = player.age.toString(),
                fontSize = NORMAL_TEXT_SIZE,
                color = Color.White
            )
        }
    }
}

@Composable
@Preview
private fun PlayerItemPreview() {
    PlayerItem(
        player = Player(
            id = 0,
            name = "PlayerName",
            country = "Country",
            age = 24,
            position = Positions.FORWARDS.positionName,
            thumbnail = null
        ),
        competition = 0
    )
}