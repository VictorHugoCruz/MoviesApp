package com.example.moviesapp

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.moviesapp.ui.MovieViewModel
import com.example.moviesapp.ui.components.AppBar
import com.example.moviesapp.ui.components.BottomBarMovie

enum class MoviesApp (@StringRes val title: Int ){
    HOME(R.string.app_name),
    SEARCH(R.string.search_route),
    DOWNLOAD(R.string.download_route),
    PROFILE(R.string.profile_route),
    DETAIL(R.string.detail_route)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesApp(
    navController: NavHostController = rememberNavController(),
    movieViewModel: MovieViewModel= viewModel()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MoviesApp.valueOf(backStackEntry?.destination?.route ?: MoviesApp.HOME.name)
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { AppBar(
            titleRoute = currentScreen
        ) },
        bottomBar = {
            BottomBarMovie(
                onHomeClicked = { navController.navigate(MoviesApp.HOME.name) },
                onSearchClicked = { navController.navigate(MoviesApp.SEARCH.name) },
                onDownloadClicked = { navController.navigate(MoviesApp.DOWNLOAD.name) }) {
                navController.navigate(
                    MoviesApp.PROFILE.name
                )
            }
        }) { innerPadding ->
        val movieState by movieViewModel.movieState.collectAsState()
        NavHost(
            navController = navController,
            startDestination = MoviesApp.HOME.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = MoviesApp.HOME.name) {
                HomeScreen(
                    onMovieClicked = { navController.navigate(MoviesApp.DETAIL.name) }
                )
            }
            composable(route = MoviesApp.SEARCH.name) {
                SearchScreen(
                    movieSearch = movieState.movieSearch,
                    moviesSearched = movieState.movieSearchedList,
                    onValueChange = {movieViewModel.updateMovieSearch(it)},
                    onMovieClicked = { navController.navigate(MoviesApp.DETAIL.name) }
                )
            }
            composable(route = MoviesApp.DOWNLOAD.name) {
                DownloadScreen(
                )
            }
            composable(route = MoviesApp.PROFILE.name) {
                ProfileScreen()
            }
            composable(route = MoviesApp.DETAIL.name) {
                DetailScreen()
            }
        }
    }
}