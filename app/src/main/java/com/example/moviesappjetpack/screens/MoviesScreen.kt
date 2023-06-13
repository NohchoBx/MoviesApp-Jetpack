package com.example.moviesappjetpack.screens
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.moviesappjetpack.viewmodels.MovieViewModel

@Composable
fun MovieScreen(movieViewModel: MovieViewModel = remember { MovieViewModel() }) {
    val movies by movieViewModel.movies

    LaunchedEffect(true) {
        movieViewModel.fetchMovies()
    }

    Surface(color = MaterialTheme.colorScheme.background) {
        MovieList(movies)
    }
}
