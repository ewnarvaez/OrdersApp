package com.willer.ordersapp.requests;

import com.willer.ordersapp.util.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Clase que entrega una instancia Singleton de retrofit
public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    // Instancia de Retrofit
    private static Retrofit retrofit = retrofitBuilder.build();

    //Instancia de clientApi que usa retrofit y proporciona acceso a la interfaz donde se harán todas las llamadas
    private static ClientApi clientApi = retrofit.create(ClientApi.class);

    public static ClientApi getClientApi(){
        return clientApi;
    }

}
