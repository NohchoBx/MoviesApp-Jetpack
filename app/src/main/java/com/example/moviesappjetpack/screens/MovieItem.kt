package com.example.moviesappjetpack.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesappjetpack.models.Movie

@Composable
fun MovieItem(movie: Movie) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = movie.name, style = MaterialTheme.typography.bodyLarge)
        Text(text = movie.overview, style = MaterialTheme.typography.bodyMedium)
        Text(text = "Rating: ${movie.popularity}%", style = MaterialTheme.typography.bodySmall)
        Text(text = "Votes: ${movie.vote_count}", style = MaterialTheme.typography.bodySmall)
    }
}