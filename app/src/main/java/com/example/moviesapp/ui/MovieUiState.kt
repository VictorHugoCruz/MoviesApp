package com.example.moviesapp.ui

import com.example.moviesapp.data.Movie

data class MovieUiState(
    val movieSearch: String = "",
    val movieSearchedList: List<Movie> = emptyList(),

)