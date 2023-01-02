package com.example.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APInterface {

    @GET("posts")
    Call<List<Pojo>> getPosts();

}
