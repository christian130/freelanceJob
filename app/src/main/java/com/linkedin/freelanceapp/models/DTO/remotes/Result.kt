package com.linkedin.freelanceapp.models.DTO.remotes

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Result : Serializable {
    @SerializedName("gender")
    @Expose
    var gender: String? = null
    @SerializedName("name")
    @Expose
    var name: Name? = null
    @SerializedName("location")
    @Expose
    var location: Location? = null
    @SerializedName("email")
    @Expose
    var email: String? = null
    @SerializedName("login")
    @Expose
    var login: Login? = null
    @SerializedName("dob")
    @Expose
    var dob: Dob? = null
    @SerializedName("registered")
    @Expose
    var registered: Registered? = null
    @SerializedName("phone")
    @Expose
    var phone: String? = null
    @SerializedName("cell")
    @Expose
    var cell: String? = null
    @SerializedName("id")
    @Expose
    var id: Id? = null
    @SerializedName("picture")
    @Expose
    var picture: Picture? = null
    @SerializedName("nat")
    @Expose
    var nat: String? = null

    fun withGender(gender: String?): Result {
        this.gender = gender
        return this
    }

    fun withName(name: Name?): Result {
        this.name = name
        return this
    }

    fun withLocation(location: Location?): Result {
        this.location = location
        return this
    }

    fun withEmail(email: String?): Result {
        this.email = email
        return this
    }

    fun withLogin(login: Login?): Result {
        this.login = login
        return this
    }

    fun withDob(dob: Dob?): Result {
        this.dob = dob
        return this
    }

    fun withRegistered(registered: Registered?): Result {
        this.registered = registered
        return this
    }

    fun withPhone(phone: String?): Result {
        this.phone = phone
        return this
    }

    fun withCell(cell: String?): Result {
        this.cell = cell
        return this
    }

    fun withId(id: Id?): Result {
        this.id = id
        return this
    }

    fun withPicture(picture: Picture?): Result {
        this.picture = picture
        return this
    }

    fun withNat(nat: String?): Result {
        this.nat = nat
        return this
    }

    companion object {
        private const val serialVersionUID = -2728046022359536084L
    }
}