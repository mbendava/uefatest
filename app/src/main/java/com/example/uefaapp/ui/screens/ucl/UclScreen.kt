package com.example.uefaapp.ui.screens.ucl

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.uefaapp.R
import com.example.uefaapp.ui.theme.BACKGROUND_IMAGE_HEIGHT
import com.example.uefaapp.ui.theme.LARGE_PADDING
import com.example.uefaapp.ui.theme.TABS_HEIGHT
import com.example.uefaapp.ui.theme.uclTabBackground
import com.example.uefaapp.ui.theme.uclTabSelectedText
import com.example.uefaapp.ui.viewmodel.SharedViewModel
import com.example.uefaapp.util.Constants.UCL_NAV_ID
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UclScreen(
    navigateToWelcomeScreen: () -> Unit,
    sharedViewModel: SharedViewModel
) {
    sharedViewModel.competition = UCL_NAV_ID
    val tabs = sharedViewModel.tabs

    val pagerState = rememberPagerState(pageCount = { tabs.size })
    val coroutineScope = rememberCoroutineScope()

    Column {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(BACKGROUND_IMAGE_HEIGHT),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.ucl_header),
            contentDescription = stringResource(id = R.string.ucl_image_description)
        )
        TabRow(
            modifier = Modifier
                .fillMaxWidth()
                .height(TABS_HEIGHT),
            selectedTabIndex = pagerState.currentPage,
            contentColor = uclTabSelectedText,
            backgroundColor = uclTabBackground
        ) {
            tabs.forEachIndexed { index, item ->
                Tab(
                    selected = index == pagerState.currentPage,
                    text = { Text(text = item.title) },
                    onClick = { coroutineScope.launch { pagerState.animateScrollToPage(index) } },
                )
            }
        }
        HorizontalPager(
            state = pagerState
        ) {
            tabs[pagerState.currentPage].screen()
        }
    }
    IconButton(
        onClick = { navigateToWelcomeScreen() }
    ) {
        Icon(
            modifier = Modifier.padding(LARGE_PADDING),
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Back button",
            tint = Color.White
        )
    }
}
