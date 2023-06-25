package com.example.moviesappjetpack.models

data class Movie (
   val title: String,
   val overview: String,
   val rating: Double,
   val votes: Int
) {
   override fun toString(): String {
      return "Movie(title='$title', overview='$overview', rating=$rating, votes=$votes)"
   }
}

