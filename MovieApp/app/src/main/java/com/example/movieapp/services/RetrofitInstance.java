package com.example.movieapp.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static final String BASE_URL="https://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;

    public static MovieAPI getRetorfitInstance(){
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }

        return retrofit.create(MovieAPI.class);
    }
}
