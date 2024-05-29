package com.infitelearning.development.infinitecinema.data.remote.response.image

import com.google.gson.annotations.SerializedName

data class ImageResponse(

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("logos")
    val logos: List<LogoResponseItem>
)
