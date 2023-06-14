package com.example.moviesappjetpack
import com.example.moviesappjetpack.repository.MovieRepository
import com.example.moviesappjetpack.viewmodels.MovieViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { MovieRepository() }
    viewModel { MovieViewModel(get()) }
}
