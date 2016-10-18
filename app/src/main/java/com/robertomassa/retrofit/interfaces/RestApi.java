package com.robertomassa.retrofit.interfaces;

import retrofit.Call;
import retrofit.http.GET;
import com.robertomassa.retrofit.domain.Data;

/**
 * Created by androidwarriors on 12/3/2015.
 */
public interface RestApi {

    @GET("/pontotel-docs/data.json")
    Call<Data> getFuncionarios();
}
