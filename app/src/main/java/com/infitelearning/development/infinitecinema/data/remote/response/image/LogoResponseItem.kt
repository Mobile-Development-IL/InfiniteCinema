package com.infitelearning.development.infinitecinema.data.remote.response.image

import com.google.gson.annotations.SerializedName

data class LogoResponseItem(
    @field:SerializedName("file_path")
    val filePath: String? = null,
)