package com.example.moviesappjetpack.repository
import com.example.moviesappjetpack.api.MovieApiService
import com.example.moviesappjetpack.models.Movie

class MovieRepository(private val movieApiService: MovieApiService) {
    suspend fun getMovies(): List<Movie> {
        return movieApiService.getMovies()
    }

    suspend fun getMovieById(movieId: String): Movie {
        return movieApiService.getMovieById(movieId)
    }

}
