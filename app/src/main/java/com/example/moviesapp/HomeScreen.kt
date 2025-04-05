package com.example.moviesapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesapp.data.DataSource
import com.example.moviesapp.ui.components.MovieCarousel
import com.example.moviesapp.ui.components.MovieImageSize
import com.example.moviesapp.ui.components.RowGenreMovie



@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier= modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        item {
            MovieCarousel(modifier = Modifier.padding(top = 24.dp, bottom = 24.dp),movieList = DataSource.horrorList)
        }
        item {
            RowGenreMovie(movieGenreList = DataSource.dramaList, text = "Drama", imageSize = MovieImageSize.SMALL)
        }
        item {
            RowGenreMovie(movieGenreList = DataSource.horrorList, text = "Horror", imageSize = MovieImageSize.SMALL)
        }

        item {
            RowGenreMovie(movieGenreList = DataSource.forYouList, text = "For You", imageSize = MovieImageSize.MEDIUM)
        }
        item {
            RowGenreMovie(movieGenreList = DataSource.thrillerList, text = "Thriller", imageSize = MovieImageSize.SMALL)
        }
        item {
            RowGenreMovie(movieGenreList = DataSource.animationList, text = "Animation", imageSize = MovieImageSize.SMALL)
        }
        item {
            RowGenreMovie(movieGenreList = DataSource.scienceFictionList, text = "Science Fiction", imageSize = MovieImageSize.SMALL)
        }
    }
}

