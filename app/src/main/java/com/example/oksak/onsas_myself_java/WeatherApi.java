package com.example.oksak.onsas_myself_java;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

public interface WeatherApi {

    @GET("/data/2.5/{name}")
    public Observable<Entity> get(@Path("name") String name, @Query("id") String q,@Query("unit") String unit,@Query("appid") String appid);

}
