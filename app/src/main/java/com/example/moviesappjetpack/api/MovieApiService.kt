package com.example.moviesappjetpack.api
import RetrofitClient
import com.example.moviesappjetpack.models.Movie
import com.example.moviesappjetpack.models.MovieList
import com.example.moviesappjetpack.utils.LogManager
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path


interface MovieApiService {
    companion object {
        fun getInstance(): MovieApiService {
            val instance =  RetrofitClient.getMovieApiService()
            LogManager.addLog("MovieApiService", "MovieApiService instance created: $instance")
            return instance
        }
    }

    @GET("tv/top_rated")
    suspend fun getLatestMovies(): MovieList

    @GET("movies/{id}")
    suspend fun getMovieById(@Path("id") movieId: String): Movie

}
