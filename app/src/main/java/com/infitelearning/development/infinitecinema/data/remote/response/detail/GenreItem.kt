package com.infitelearning.development.infinitecinema.data.remote.response.detail

import com.google.gson.annotations.SerializedName

data class GenreItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int
)