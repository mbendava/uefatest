package com.example.uefaapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.uefaapp.di.UefaModule
import com.example.uefaapp.ui.composables.GroupsScreen
import com.example.uefaapp.ui.composables.MatchesScreen
import com.example.uefaapp.ui.composables.OverviewScreen
import com.example.uefaapp.ui.composables.SquadScreen
import com.example.uefaapp.ui.composables.StatsScreen
import com.example.uefaapp.util.TabItem

class SharedViewModel : ViewModel() {

    //  UefaRepository should be provided here when API is available
    val clubData = UefaModule.provideMockRepository().clubData

    val tabs = listOf(
        TabItem(
            title = "Overview",
            screen = { OverviewScreen(content = "Overview Page") }
        ),
        TabItem(
            title = "Matches",
            screen = { MatchesScreen(content = "Matches Page") }
        ),
        TabItem(
            title = "Groups",
            screen = { GroupsScreen(content = "Groups Page")}
        ),
        TabItem(
            title = "Stats",
            screen = { StatsScreen(content = "Stats Page")}
        ),
        TabItem(
            title = "Squad",
            screen = { SquadScreen(content = "Squad Page")}
        )
    )
}