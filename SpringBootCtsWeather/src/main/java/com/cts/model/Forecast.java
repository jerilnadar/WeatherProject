package com.cts.model;

import java.util.List;

public class Forecast {
    List<WeatherDetails> weatherDetailsList;

    public List<WeatherDetails> getWeatherDetailsList() {
        return weatherDetailsList;
    }

    public void setWeatherDetailsList(List<WeatherDetails> weatherDetailsList) {
        this.weatherDetailsList = weatherDetailsList;
    }
}
