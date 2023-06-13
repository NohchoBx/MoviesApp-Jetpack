package com.example.moviesappjetpack.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesappjetpack.api.MovieApiService
import com.example.moviesappjetpack.models.Movie
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    private val movieApiService = MovieApiService.getInstance()

    private val _movies = mutableStateOf<List<Movie>>(emptyList())
    val movies: State<List<Movie>> = _movies

    fun fetchMovies() {
        viewModelScope.launch {
            try {
                val result = movieApiService.getLatestMovies()
                _movies.value = result
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}
