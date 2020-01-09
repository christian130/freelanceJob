package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Info : Serializable {
    @SerializedName("seed")
    @Expose
    var seed: String? = null
    @SerializedName("results")
    @Expose
    var results = 0
    @SerializedName("page")
    @Expose
    var page = 0
    @SerializedName("version")
    @Expose
    var version: String? = null

    fun withSeed(seed: String?): Info {
        this.seed = seed
        return this
    }

    fun withResults(results: Int): Info {
        this.results = results
        return this
    }

    fun withPage(page: Int): Info {
        this.page = page
        return this
    }

    fun withVersion(version: String?): Info {
        this.version = version
        return this
    }

    companion object {
        private const val serialVersionUID = -2059101631839979619L
    }
}