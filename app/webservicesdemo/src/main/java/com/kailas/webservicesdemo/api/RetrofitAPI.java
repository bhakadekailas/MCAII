package com.kailas.webservicesdemo.api;

import com.kailas.webservicesdemo.get.MyResponse;
import com.kailas.webservicesdemo.post.MyPostRequest;
import com.kailas.webservicesdemo.post.MyPostResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @GET("/api/users/2")
    Call<MyResponse> getRandomUser();

    @POST("users")
    Call<MyPostResponse> createUser(@Body MyPostRequest myPostRequest);

}
