package com.linkedin.freelanceapp.models.DTO;

import com.linkedin.freelanceapp.models.DTO.remotes.MainDTOClasses;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ImplSrvIntAll {

    
    @GET("api/")
    Call<MainDTOClasses> Login(
    );
}
