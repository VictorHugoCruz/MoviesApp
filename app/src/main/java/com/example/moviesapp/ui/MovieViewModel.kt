package com.example.moviesapp.ui

import androidx.lifecycle.ViewModel
import com.example.moviesapp.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MovieViewModel : ViewModel() {
    private val _movieState = MutableStateFlow(MovieUiState())
    val movieState = _movieState.asStateFlow()

    fun updateMovieSearch(movieSearch: String) {
        _movieState.value = _movieState.value.copy(movieSearch = movieSearch)
        updateMovieSearchedList()
    }

    fun updateMovieSearchedList() {
        _movieState.value = _movieState.value.copy(movieSearchedList = DataSource.movies.filter {
            movie -> movie.title.lowercase().contains(_movieState.value.movieSearch.lowercase())
        })
    }
}