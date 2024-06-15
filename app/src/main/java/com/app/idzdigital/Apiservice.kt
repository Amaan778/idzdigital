package com.app.idzdigital

import retrofit2.Call
import retrofit2.http.GET

interface Apiservice {
    @GET("dummy/EmployeeDetails.json")
    fun getEmployeeDetails(): Call<EmployeeResponse>
}
