package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Id : Serializable {
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("value")
    @Expose
    var value: Any? = null

    fun withName(name: String?): Id {
        this.name = name
        return this
    }

    fun withValue(value: Any?): Id {
        this.value = value
        return this
    }

    companion object {
        private const val serialVersionUID = -4104051413081998526L
    }
}