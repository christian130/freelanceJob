package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Street : Serializable {
    @SerializedName("number")
    @Expose
    var number = 0
    @SerializedName("name")
    @Expose
    var name: String? = null

    fun withNumber(number: Int): Street {
        this.number = number
        return this
    }

    fun withName(name: String?): Street {
        this.name = name
        return this
    }

    companion object {
        private const val serialVersionUID = 5297966220168678994L
    }
}