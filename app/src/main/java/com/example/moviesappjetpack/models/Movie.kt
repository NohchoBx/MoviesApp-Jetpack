package com.example.moviesappjetpack.models

data class Movie(
   val name: String,
   val overview: String,
   val popularity: Double,
   val vote_count: Int
) {
   override fun toString(): String {
      return "Movie(title='$name', overview='$overview', popularity=$popularity, votesCount=$vote_count)"
   }
}


