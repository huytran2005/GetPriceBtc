package com.example.getpricebtc.Model.Api

import com.example.getpricebtc.Model.Data.BtcPrice
import retrofit2.http.GET

interface ApiService{
    @GET("/api/v3/ticker/price?symbol=BTCUSDT")
    suspend fun getPrice(): BtcPrice
}