package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Location : Serializable {
    @SerializedName("street")
    @Expose
    var street: Street? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("state")
    @Expose
    var state: String? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("postcode")
    @Expose
    var postcode = 0
    @SerializedName("coordinates")
    @Expose
    var coordinates: Coordinates? = null
    @SerializedName("timezone")
    @Expose
    var timezone: Timezone? = null

    fun withStreet(street: Street?): Location {
        this.street = street
        return this
    }

    fun withCity(city: String?): Location {
        this.city = city
        return this
    }

    fun withState(state: String?): Location {
        this.state = state
        return this
    }

    fun withCountry(country: String?): Location {
        this.country = country
        return this
    }

    fun withPostcode(postcode: Int): Location {
        this.postcode = postcode
        return this
    }

    fun withCoordinates(coordinates: Coordinates?): Location {
        this.coordinates = coordinates
        return this
    }

    fun withTimezone(timezone: Timezone?): Location {
        this.timezone = timezone
        return this
    }

    companion object {
        private const val serialVersionUID = 8522638055891569256L
    }
}