package com.example.moviesapp.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.moviesapp.MoviesApp

@ExperimentalMaterial3Api
@Composable
fun AppBar(modifier: Modifier = Modifier,
    titleRoute : MoviesApp
) {
    CenterAlignedTopAppBar(
        modifier=modifier,
        colors = TopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
            actionIconContentColor = Color.Gray,
            scrolledContainerColor = Color.LightGray,
            navigationIconContentColor = Color.Cyan
        ),
        title = {Text(text = stringResource(titleRoute.title), style = MaterialTheme.typography.headlineMedium )},
    )
}