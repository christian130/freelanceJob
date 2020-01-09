package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Picture : Serializable {
    @SerializedName("large")
    @Expose
    var large: String? = null
    @SerializedName("medium")
    @Expose
    var medium: String? = null
    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null

    fun withLarge(large: String?): Picture {
        this.large = large
        return this
    }

    fun withMedium(medium: String?): Picture {
        this.medium = medium
        return this
    }

    fun withThumbnail(thumbnail: String?): Picture {
        this.thumbnail = thumbnail
        return this
    }

    companion object {
        private const val serialVersionUID = 592023512369038540L
    }
}