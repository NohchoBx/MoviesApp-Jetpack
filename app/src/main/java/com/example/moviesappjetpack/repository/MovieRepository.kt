package com.example.moviesappjetpack.repository
import com.example.moviesappjetpack.api.MovieApiService
import com.example.moviesappjetpack.models.Movie
import com.example.moviesappjetpack.models.MovieList

class MovieRepository(private val movieApiService: MovieApiService = MovieApiService.getInstance()) {
    suspend fun getLatestMovies(): MovieList {
        return movieApiService.getLatestMovies()
    }

    suspend fun getMovieById(movieId: String): Movie {
        return movieApiService.getMovieById(movieId)
    }

}
