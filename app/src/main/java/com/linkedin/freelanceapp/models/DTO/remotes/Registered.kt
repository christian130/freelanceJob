package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Registered : Serializable {
    @SerializedName("date")
    @Expose
    var date: String? = null
    @SerializedName("age")
    @Expose
    var age = 0

    fun withDate(date: String?): Registered {
        this.date = date
        return this
    }

    fun withAge(age: Int): Registered {
        this.age = age
        return this
    }

    companion object {
        private const val serialVersionUID = 2521952240036168811L
    }
}