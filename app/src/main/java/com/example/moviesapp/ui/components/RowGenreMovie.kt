package com.example.moviesapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesapp.data.DataSource
import com.example.moviesapp.data.Movie

@Composable
fun RowGenreMovie(
    modifier: Modifier = Modifier,
    movieGenreList: List<Movie>,
    text: String,
    imageSize: MovieImageSize,
    onClick: () -> Unit
) {
    Column(modifier=modifier.padding(start = 16.dp, bottom = 24.dp),
    horizontalAlignment = Alignment.Start
    ) {
        Text(style = MaterialTheme.typography.titleLarge,text=text)
        Spacer(modifier= Modifier.padding(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(movieGenreList.size){
                movie -> MovieImage(movie = movieGenreList[movie], size = imageSize, onClick = {onClick()})
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun RowGenreMoviePreview() {
    RowGenreMovie(
        movieGenreList = DataSource.horrorList,
        text = "crime",
        imageSize = MovieImageSize.MEDIUM,
        onClick = {}
    )
}
