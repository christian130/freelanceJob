package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MainDTOClasses : Serializable {
    @SerializedName("results")
    @Expose
    var results: List<Result>? =
        null
    @SerializedName("info")
    @Expose
    var info: Info? = null

    fun withResults(results: List<Result>?): MainDTOClasses {
        this.results = results
        return this
    }

    fun withInfo(info: Info?): MainDTOClasses {
        this.info = info
        return this
    }

    companion object {
        private const val serialVersionUID = -90932714648691908L
    }
}