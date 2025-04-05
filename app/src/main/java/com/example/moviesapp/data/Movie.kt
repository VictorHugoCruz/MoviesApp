package com.example.moviesapp.data

import androidx.annotation.DrawableRes

data class Movie(

    val title: String,
    val genre: List<Genre>,
    val rating: Double,
    val director: List<Director>,
    val actors: List<String>,
    val synopsis: String,
    @DrawableRes val imageUrl: Int
)

