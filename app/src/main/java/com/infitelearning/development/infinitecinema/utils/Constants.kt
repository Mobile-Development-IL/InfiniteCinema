package com.infitelearning.development.infinitecinema.utils

object Constants {
    private const val BEARER = "Bearer "
    private const val API_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3ZTBjMzYwZmY2ODVhYTU2MWIyNzUyMWVjMWU5ZmMxNyIsInN1YiI6IjY0YTgxOTA1NjVjMjZjMDEyZGZhMmI4YSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.JZFOCHeD1Fhwk8HzKcudywg0RvnA6hkSe4e_N9b8kQk"
    private const val IMAGE_URL = "https://image.tmdb.org/t/p/original"
    const val AUTHORIZATION = "Authorization"
    const val BASE_URL = "https://api.themoviedb.org/3/"

    fun getBearer(): String {
        return BEARER + API_KEY
    }

    fun getImageUrl(imageUrl: String) = IMAGE_URL + imageUrl
}