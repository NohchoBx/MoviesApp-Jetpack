package com.example.moviesappjetpack.di
import com.example.moviesappjetpack.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesModule {

    @Provides
    @Singleton
    fun provideMovieRepository() : MovieRepository {
        return MovieRepository()
    }


}