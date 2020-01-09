package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Dob : Serializable {
    @SerializedName("date")
    @Expose
    var date: String? = null
    @SerializedName("age")
    @Expose
    var age = 0

    fun withDate(date: String?): Dob {
        this.date = date
        return this
    }

    fun withAge(age: Int): Dob {
        this.age = age
        return this
    }

    companion object {
        private const val serialVersionUID = 9085319931236263263L
    }
}