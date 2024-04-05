package com.example.uefaapp.data.repositories

import com.example.uefaapp.data.api.NetworkResult
import com.example.uefaapp.data.model.ClubApiResponse
import com.example.uefaapp.data.model.ClubData
import com.example.uefaapp.data.model.Player
import com.example.uefaapp.util.Positions
import kotlinx.coroutines.flow.MutableStateFlow

class MockRepository {

    private val mockedClubData: ClubApiResponse =
        ClubApiResponse(
            code = "200",
            status = "OK",
            ClubData(
                id = 1,
                name = "Barcelona",
                crest = null,
                status = "Playing",
                description = "Round of 16",
                players = listOf(
                    Player(
                        id = 1,
                        name = "Marc-Andre ter Stegen",
                        country = "Germany",
                        age = 24,
                        position = Positions.GOALKEEPERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 2,
                        name = "Xavi",
                        country = "Catalonia",
                        age = 44,
                        position = Positions.COACH.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 3,
                        name = "João Cancelo",
                        country = "Portugal",
                        age = 30,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 4,
                        name = "Alejandro Balde",
                        country = "Spain",
                        age = 24,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 5,
                        name = "Ronald Araujo",
                        country = "Uruguay",
                        age = 21,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 6,
                        name = "Iñigo Martínez",
                        country = "Spain",
                        age = 33,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 7,
                        name = "Andreas Christensen",
                        country = "Denmark",
                        age = 28,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 8,
                        name = "Marcos Alonso",
                        country = "Spain",
                        age = 34,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 9,
                        name = "Jules Kounde",
                        country = "France",
                        age = 26,
                        position = Positions.DEFENDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 10,
                        name = "Gavi",
                        country = "Spain",
                        age = 20,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 11,
                        name = "Pedri",
                        country = "Spain",
                        age = 22,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 12,
                        name = "Fermín López",
                        country = "Spain",
                        age = 21,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 13,
                        name = "Oriol Romeu",
                        country = "Spain",
                        age = 33,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 14,
                        name = "Sergi Roberto",
                        country = "Spain",
                        age = 32,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 15,
                        name = "Frenkie de Jong",
                        country = "Netherlands",
                        age = 27,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 16,
                        name = "Ilkay Gündogan",
                        country = "Germany",
                        age = 34,
                        position = Positions.MIDFIELDERS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 17,
                        name = "Ferran Torres",
                        country = "Spain",
                        age = 24,
                        position = Positions.FORWARDS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 18,
                        name = "Robert Lewandowski",
                        country = "Poland",
                        age = 36,
                        position = Positions.FORWARDS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 19,
                        name = "Raphinha",
                        country = "Spain",
                        age = 28,
                        position = Positions.FORWARDS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 20,
                        name = "João Félix",
                        country = "Portugal",
                        age = 25,
                        position = Positions.FORWARDS.positionName,
                        thumbnail = null
                    ),
                    Player(
                        id = 20,
                        name = "Vitor Roque",
                        country = "Spain",
                        age = 19,
                        position = Positions.FORWARDS.positionName,
                        thumbnail = null
                    )
                )
            )
        )

    val clubData =
        MutableStateFlow<NetworkResult<ClubApiResponse>>(NetworkResult.Success(mockedClubData))

}