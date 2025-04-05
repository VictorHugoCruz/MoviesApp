package com.example.moviesapp.data

data class Genre(
    val category: GenreMovie
)
enum class GenreMovie {
    CRIME,DRAMA,ACTION,FANTASY,WESTERN,SCIENCE_FICTION,THRILLER,ANIMATION, COMEDY,ADVENTURE,HORROR
}