import com.example.moviesappjetpack.api.MovieApiService
import com.example.moviesappjetpack.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent;


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    // Define your dependencies here
    @Provides
    fun provideMovieRepository(movieApiService: MovieApiService): MovieRepository {
        return MovieRepository(movieApiService)
    }

    @Provides
    fun provideMovieApiService(): MovieApiService {
        return RetrofitClient.getMovieApiService()
    }
}