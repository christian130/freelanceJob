package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Coordinates : Serializable {
    @SerializedName("latitude")
    @Expose
    var latitude: String? = null
    @SerializedName("longitude")
    @Expose
    var longitude: String? = null

    fun withLatitude(latitude: String?): Coordinates {
        this.latitude = latitude
        return this
    }

    fun withLongitude(longitude: String?): Coordinates {
        this.longitude = longitude
        return this
    }

    companion object {
        private const val serialVersionUID = -1612687079744991867L
    }
}