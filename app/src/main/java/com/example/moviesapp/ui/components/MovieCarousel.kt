package com.example.moviesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.example.moviesapp.data.DataSource
import com.example.moviesapp.data.Movie
import kotlin.math.absoluteValue

@Composable
fun MovieCarousel(modifier: Modifier = Modifier, movieList: List<Movie>, onClick: () -> Unit) {
    val pagerState = rememberPagerState(
        pageCount = { movieList.size }
    )
    HorizontalPager(
        modifier = modifier.height(480.dp),
        state = pagerState,
        pageSpacing = 12.dp,
        contentPadding = PaddingValues(start = 36.dp, end = 36.dp)
    ) { page ->

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Card(
                Modifier
                    .size(300.dp, 400.dp)
                    .graphicsLayer {
                        // Calculate the absolute offset for the current page from the
                        // scroll position. We use the absolute value which allows us to mirror
                        // any effects for both directions
                        val pageOffset = (
                                (pagerState.currentPage - page) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue

                        // We animate the alpha, between 50% and 100%
                        val clampedOffset = pageOffset.coerceIn(0f, 1f)
                        alpha = lerp(
                            start = 0.4f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                        scaleX = lerp(1.2f, 1.1f, clampedOffset)
                        scaleY = lerp(1.2f, 1.1f, clampedOffset)
                    },

                elevation = CardDefaults.elevatedCardElevation(12.dp)

            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable(onClick = onClick),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(movieList[page].imageUrl),
                    contentDescription = movieList[page].title,
                ) // Card content
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PagerStateMoviePreview() {
    MovieCarousel(
        movieList = DataSource.horrorList,
        onClick = {  }
    )
}