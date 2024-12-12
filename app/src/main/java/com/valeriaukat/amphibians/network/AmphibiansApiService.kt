package com.valeriaukat.amphibians.network

import com.valeriaukat.amphibians.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}