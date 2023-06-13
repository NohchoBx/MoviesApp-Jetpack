package com.example.moviesappjetpack.screens
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.moviesappjetpack.models.Movie

@Composable
fun MovieList(movies: List<Movie>) {
    LazyColumn {
        items(movies.size) { index ->
            val movie = movies[index]
            MovieItem(movie)
        }
    }
}