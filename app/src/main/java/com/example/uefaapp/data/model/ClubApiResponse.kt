package com.example.uefaapp.data.model

data class ClubApiResponse(
    val code: String?,
    val status: String?,
    val data: ClubData?
)

data class ClubData(
    val id: Int?,
    val name: String?,
    val crest: CrestImage?,
    val status: String?,
    val description: String?,
    val players: List<Player>?
)

data class CrestImage(
    val path: String?,
    val extension: String?
)

data class Player(
    val id: Int?,
    val name: String?,
    val country: String?,
    val age: Int?,
    val position: String?,
    val thumbnail: PlayerThumbnail?,
)

data class PlayerThumbnail(
    val path: String?,
    val extension: String?
)
