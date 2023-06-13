package com.example.moviesappjetpack.api
import RetrofitClient
import com.example.moviesappjetpack.models.Movie
import retrofit2.http.GET
import retrofit2.http.Path


interface MovieApiService {
    companion object {
        fun getInstance(): MovieApiService {
            return RetrofitClient.getMovieApiService()
        }
    }

    @GET("movie/latest")
    suspend fun getLatestMovies(): List<Movie>

    @GET("movies/{id}")
    suspend fun getMovieById(@Path("id") movieId: String): Movie

}
