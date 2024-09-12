package com.atilsamancioglu.composeretro.service

import com.atilsamancioglu.composeretro.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    suspend fun getData(): List<CryptoModel>

}