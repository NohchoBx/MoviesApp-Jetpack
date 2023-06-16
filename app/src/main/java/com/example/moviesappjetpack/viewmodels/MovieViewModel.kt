package com.example.moviesappjetpack.viewmodels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesappjetpack.models.Movie
import com.example.moviesappjetpack.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {
    private val _movies: MutableLiveData<List<Movie>> = MutableLiveData()
    val movies: LiveData<List<Movie>> get() = _movies


    fun fetchMovies() {
        viewModelScope.launch {
            try {
                val result = movieRepository.getLatestMovies()
                _movies.value = result
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}

