package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Login : Serializable {
    @SerializedName("uuid")
    @Expose
    var uuid: String? = null
    @SerializedName("username")
    @Expose
    var username: String? = null
    @SerializedName("password")
    @Expose
    var password: String? = null
    @SerializedName("salt")
    @Expose
    var salt: String? = null
    @SerializedName("md5")
    @Expose
    var md5: String? = null
    @SerializedName("sha1")
    @Expose
    var sha1: String? = null
    @SerializedName("sha256")
    @Expose
    var sha256: String? = null

    fun withUuid(uuid: String?): Login {
        this.uuid = uuid
        return this
    }

    fun withUsername(username: String?): Login {
        this.username = username
        return this
    }

    fun withPassword(password: String?): Login {
        this.password = password
        return this
    }

    fun withSalt(salt: String?): Login {
        this.salt = salt
        return this
    }

    fun withMd5(md5: String?): Login {
        this.md5 = md5
        return this
    }

    fun withSha1(sha1: String?): Login {
        this.sha1 = sha1
        return this
    }

    fun withSha256(sha256: String?): Login {
        this.sha256 = sha256
        return this
    }

    companion object {
        private const val serialVersionUID = 4336413312622179675L
    }
}