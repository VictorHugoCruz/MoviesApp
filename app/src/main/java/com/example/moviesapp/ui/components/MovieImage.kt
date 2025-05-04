package com.example.moviesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesapp.R
import com.example.moviesapp.data.Director
import com.example.moviesapp.data.Genre
import com.example.moviesapp.data.GenreMovie
import com.example.moviesapp.data.Movie


enum class MovieImageSize {
    SMALL, MEDIUM, LARGE
}

@Composable
fun MovieImage(
    modifier: Modifier = Modifier,
    movie: Movie,
    size: MovieImageSize,
    onClick: (movie: Movie) -> Unit = {}
) {
    val sizeImage = when (size) {
        MovieImageSize.SMALL -> {
            listOf(120.dp, 200.dp)
        }

        MovieImageSize.MEDIUM -> {
            listOf(220.dp, 360.dp)
        }

        else -> {
            listOf(400.dp, 600.dp)
        }
    }

    Box(modifier = modifier.clickable(onClick = { onClick(movie) })) {
        Card(modifier = Modifier, elevation = CardDefaults.elevatedCardElevation(12.dp)) {
            Image(
                modifier = Modifier.size(sizeImage[0], sizeImage[1]),
                contentScale = ContentScale.FillHeight,
                painter = painterResource(movie.imageUrl),
                contentDescription = movie.title
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MovieImagePreview() {
    MovieImage(
        movie = Movie(
            title = "Smile",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.6,
            director = listOf(Director("Parker Finn")),
            actors = listOf("Sosie Bacon", "Kyle Gallner", "Jessie T. Usher"),
            synopsis = "A doctor begins to experience terrifying events after witnessing a traumatic incident.",
            imageUrl = R.drawable.smile
        ),
        size = MovieImageSize.MEDIUM
    )
}