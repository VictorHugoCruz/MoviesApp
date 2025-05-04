package com.example.moviesapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesapp.data.Movie
import com.example.moviesapp.ui.components.MovieImage
import com.example.moviesapp.ui.components.MovieImageSize

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    onMovieClicked: () -> Unit = {},
    movieSearch: String,
    moviesSearched: List<Movie>,
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        TextField(
            value = movieSearch,
            onValueChange ={onValueChange(it)},
            label = { Text(text = "Search") },
            modifier = Modifier.fillMaxWidth()
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(moviesSearched) {
                movie->
                MovieImage(
                    movie=movie,
                    size = MovieImageSize.SMALL,
                    onClick = {onMovieClicked()}
                )
            }
        }
    }
}