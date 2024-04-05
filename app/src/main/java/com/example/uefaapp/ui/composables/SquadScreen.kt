package com.example.uefaapp.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.uefaapp.data.model.ClubData
import com.example.uefaapp.ui.theme.LARGE_PADDING
import com.example.uefaapp.ui.theme.SQUAD_DIVIDER_SIZE
import com.example.uefaapp.ui.theme.uclSquadDividerColor
import com.example.uefaapp.ui.theme.uelSquadDividerColor
import com.example.uefaapp.util.Constants.UCL_NAV_ID
import com.example.uefaapp.util.Positions

@Composable
fun SquadScreen(
    content: String,
    clubData: ClubData?,
    competition: Int
) {
    if (clubData == null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(LARGE_PADDING),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                fontSize = MaterialTheme.typography.h6.fontSize,
                color = Color.White,
                text = content
            )
        }
    } else {
        val players = clubData.players
        val goalkeepers = players?.filter { player ->
            player.position == Positions.GOALKEEPERS.positionName
        }

        val defenders = players?.filter { player ->
            player.position == Positions.DEFENDERS.positionName
        }

        val midfielders = players?.filter { player ->
            player.position == Positions.MIDFIELDERS.positionName
        }

        val forwards = players?.filter { player ->
            player.position == Positions.FORWARDS.positionName
        }

        val coaches = players?.filter { player ->
            player.position == Positions.COACH.positionName
        }

        val dividerColor =
            if (competition == UCL_NAV_ID) uclSquadDividerColor else uelSquadDividerColor

        LazyColumn {
            if (goalkeepers?.isNotEmpty() == true) {
                item {
                    PlayerItemList(
                        title = Positions.GOALKEEPERS.positionName,
                        players = goalkeepers,
                        competition = competition
                    )
                    Divider(
                        color = dividerColor,
                        thickness = SQUAD_DIVIDER_SIZE
                    )
                }
            }
            if (defenders?.isNotEmpty() == true) {
                item {
                    PlayerItemList(
                        title = Positions.DEFENDERS.positionName,
                        players = defenders,
                        competition = competition
                    )
                    Divider(
                        color = dividerColor,
                        thickness = SQUAD_DIVIDER_SIZE
                    )
                }
            }
            if (midfielders?.isNotEmpty() == true) {
                item {
                    PlayerItemList(
                        title = Positions.MIDFIELDERS.positionName,
                        players = midfielders,
                        competition = competition
                    )
                    Divider(
                        color = dividerColor,
                        thickness = SQUAD_DIVIDER_SIZE
                    )
                }
            }
            if (forwards?.isNotEmpty() == true) {
                item {
                    PlayerItemList(
                        title = Positions.FORWARDS.positionName,
                        players = forwards,
                        competition = competition
                    )
                    Divider(
                        color = dividerColor,
                        thickness = SQUAD_DIVIDER_SIZE
                    )
                }
            }
            if (coaches?.isNotEmpty() == true) {
                item {
                    PlayerItemList(
                        title = Positions.COACH.positionName,
                        players = coaches,
                        competition = competition
                    )
                }
            }
        }
    }
}
