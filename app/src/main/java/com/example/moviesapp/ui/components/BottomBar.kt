package com.example.moviesapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BottomBarMovie(
    modifier: Modifier = Modifier,
    onHomeClicked: () -> Unit,
    onSearchClicked: () -> Unit,
    onDownloadClicked: () -> Unit,
    onProfileClicked: () -> Unit
) {
    BottomAppBar(
        modifier = modifier){
        Row(modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround) {

            IconButton(onClick = {onHomeClicked()}) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
            }
            IconButton(onClick = {onSearchClicked()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            }
            IconButton(onClick = {onDownloadClicked()}) {
                Icon(imageVector = Icons.Filled.Download, contentDescription = "Download")
            }
            IconButton(onClick = {onProfileClicked()}) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Account")
            }
        }
    }
}