package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Name : Serializable {
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("first")
    @Expose
    var first: String? = null
    @SerializedName("last")
    @Expose
    var last: String? = null

    fun withTitle(title: String?): Name {
        this.title = title
        return this
    }

    fun withFirst(first: String?): Name {
        this.first = first
        return this
    }

    fun withLast(last: String?): Name {
        this.last = last
        return this
    }

    companion object {
        private const val serialVersionUID = 5024772271198854204L
    }
}