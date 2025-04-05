package com.example.moviesapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviesapp.ui.components.AppBar
import com.example.moviesapp.ui.components.BottomBarMovie

enum class MoviesApp {
    HOME, SEARCH, DOWNLOAD, PROFILE
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesApp(
    navController: NavHostController = rememberNavController()

) {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = {AppBar()},
        bottomBar = { BottomBarMovie(
            onHomeClicked = {navController.navigate(MoviesApp.HOME.name)},
            onSearchClicked = {navController.navigate(MoviesApp.SEARCH.name)},
            onDownloadClicked = {navController.navigate(MoviesApp.DOWNLOAD.name)}
        ) { navController.navigate(MoviesApp.PROFILE.name) }
        }
    ){
            innerPadding->
        NavHost(
            navController= navController,
            startDestination = MoviesApp.HOME.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable (route=MoviesApp.HOME.name){
                HomeScreen ()
            }
            composable (route=MoviesApp.SEARCH.name){
                SearchScreen(
                )
            }
            composable (route=MoviesApp.DOWNLOAD.name){
                DownloadScreen(
                )
            }
            composable (route=MoviesApp.PROFILE.name){
                ProfileScreen(
                )
            }

        }


    }
}