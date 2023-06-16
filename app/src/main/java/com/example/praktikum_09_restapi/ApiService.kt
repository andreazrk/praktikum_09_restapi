package com.example.praktikum_09_restapi

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        @GET("datamahasiswa/")
        fun getdatamahasiswa(): Call<ApiResponse>
}