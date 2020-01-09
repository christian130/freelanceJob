package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Timezone : Serializable {
    @SerializedName("offset")
    @Expose
    var offset: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null

    fun withOffset(offset: String?): Timezone {
        this.offset = offset
        return this
    }

    fun withDescription(description: String?): Timezone {
        this.description = description
        return this
    }

    companion object {
        private const val serialVersionUID = 1915669365463226971L
    }
}