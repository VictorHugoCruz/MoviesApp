package com.example.moviesapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviesapp.data.GenreMovie

@Composable
fun Genres(modifier: Modifier = Modifier) {
    LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(3)
    ,
        verticalArrangement = Arrangement.spacedBy(12.dp)) {
        for (genre in GenreMovie.entries) {
            item {
                Button(
                    modifier= Modifier.wrapContentSize(),
                    onClick = {},
                ) {
                    Text(
                        modifier= Modifier.wrapContentSize(),
                        maxLines = 1,
                        text = "$genre"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun GenresPreview() {
    Genres()
}