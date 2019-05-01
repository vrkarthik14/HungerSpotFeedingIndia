package com.feedindia.locationrx.utils;

import com.feedindia.locationrx.model.ResponsePOJO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("{latLongs}")
    Call<ResponsePOJO> getDistanceMatrix(@Path("latLongs") String latLongs, @Query("sources") Integer sources, @Query("annotations") String annotations, @Query("access_token") String access_token);
}
