package com.robertomassa.retrofit.dao;

import com.robertomassa.retrofit.domain.Data;
import com.robertomassa.retrofit.domain.Funcionario;
import com.robertomassa.retrofit.interfaces.Constantes;
import com.robertomassa.retrofit.interfaces.RestApi;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class FuncionarioDAO implements Constantes {

    public List<Funcionario> getLista(){

        final List<Funcionario> funcionarios=  new ArrayList<Funcionario>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RestApi service = retrofit.create(RestApi.class);

        Call<Data> call = service.getFuncionarios();

        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Response<Data> response, Retrofit retrofit) {

                try {

                    funcionarios.addAll(response.body().getData());

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Throwable t) {
            }
        });

       return funcionarios;
    }
}
