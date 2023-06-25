import android.os.Build
import androidx.annotation.RequiresApi
import com.example.moviesappjetpack.api.MovieApiService
import io.github.cdimascio.dotenv.Dotenv
import io.github.cdimascio.dotenv.dotenv
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.nio.file.Paths

@RequiresApi(Build.VERSION_CODES.O)
object RetrofitClient {

    val dotenv: Dotenv by lazy {
        dotenv {
            directory = "/assets"
            filename = "env" // instead of '.env', use 'env'
        }
    }

    private val apiToken: String by lazy {
        dotenv["MOVIES_API_READ_ACCESS_TOKEN"] ?: throw IllegalStateException("API token not found")
    }


    private val httpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header("Authorization", "Bearer $apiToken")
                    .build()
                chain.proceed(request)
            }
            .build()
    }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }


    fun getMovieApiService(): MovieApiService {
        return retrofit.create(MovieApiService::class.java)
    }

    // Other API services can be added here

    private const val BASE_URL = "https://api.themoviedb.org/3/"

    // Other configurations and methods can be added here
}
