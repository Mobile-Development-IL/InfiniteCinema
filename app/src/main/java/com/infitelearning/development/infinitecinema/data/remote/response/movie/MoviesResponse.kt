package com.infitelearning.development.infinitecinema.data.remote.response.movie

import com.google.gson.annotations.SerializedName

data class MoviesResponse(

    @field:SerializedName("page")
    val page: Int? = null,

    @field:SerializedName("total_pages")
    val totalPages: Int? = null,

    @field:SerializedName("results")
    val results: List<MovieItemResponse>,

    @field:SerializedName("total_results")
    val totalResults: Int? = null
)