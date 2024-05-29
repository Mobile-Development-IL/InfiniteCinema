package com.infitelearning.development.infinitecinema.data.remote.response.similar

import com.google.gson.annotations.SerializedName

data class SimilarRecommendResponse(

	@field:SerializedName("page")
    val page: Int? = null,

	@field:SerializedName("total_pages")
    val totalPages: Int? = null,

	@field:SerializedName("results")
    val results: List<SimilarRecommendItem>,

	@field:SerializedName("total_results")
    val totalResults: Int? = null
)