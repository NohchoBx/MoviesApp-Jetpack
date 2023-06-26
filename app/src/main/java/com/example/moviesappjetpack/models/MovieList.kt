package com.example.moviesappjetpack.models

import com.google.gson.annotations.SerializedName

class MovieList {
    @SerializedName("results")
    val movies: List<Movie> = emptyList()
}