package com.example.f1api.httpclient;

import com.example.f1api.Model.ResponseF1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("f1.json?auth=APoocEFUFqttdJ4a1gUtn3F35HynRvAzI5Rajwpf")
    Call<ResponseF1> getData();


}