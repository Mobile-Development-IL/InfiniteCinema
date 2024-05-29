package com.infitelearning.development.infinitecinema.data.remote.retrofit

import com.infitelearning.development.infinitecinema.data.remote.response.detail.DetailResponse
import com.infitelearning.development.infinitecinema.data.remote.response.movie.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(): MoviesResponse

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies() : MoviesResponse

    @GET("trending/movie/day")
    suspend fun getAllTrending() : MoviesResponse

    @GET("movie/upcoming")
    suspend fun getUpComingMovies() : MoviesResponse

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies() : MoviesResponse

    @GET("movie/{movie_id}")
    suspend fun detailMovie(
        @Path("movie_id") id: Int
    ) : DetailResponse
}
