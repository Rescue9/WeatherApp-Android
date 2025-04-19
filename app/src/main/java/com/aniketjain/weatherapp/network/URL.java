package com.aniketjain.weatherapp.network;

import android.util.Log;
import com.aniketjain.weatherapp.location.LocationCord;

public class URL {
    private String link;

    public URL() {
        link = "https://api.openweathermap.org/data/3.0/onecall?exclude=minutely&lat="
                + LocationCord.lat + "&lon=" + LocationCord.lon + "&units=imperial" + "&appid=" + LocationCord.API_KEY;
    }
    public String getLink() {
        return link;
    }
}