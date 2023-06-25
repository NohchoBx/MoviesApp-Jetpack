package com.example.moviesappjetpack.screens
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.example.moviesappjetpack.models.Movie
import com.example.moviesappjetpack.viewmodels.MovieViewModel
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



@Composable
fun MovieScreen() {
    val movieViewModel= hiltViewModel<MovieViewModel>()

    val movies: List<Movie> by movieViewModel.movies.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        movieViewModel.fetchMovies()
    }

    Surface(color = MaterialTheme.colorScheme.background) {
        MovieList(movies)
    }
}
