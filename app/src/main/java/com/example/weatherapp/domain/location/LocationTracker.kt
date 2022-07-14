package com.example.weatherapp.domain.location

import android.location.Location

interface LocationTracker {
    //get current location
    suspend fun getCurrentLocation(): Location?
}