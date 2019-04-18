package com.cts.model;

import java.util.Map;

public class States {
    Map<String, StateWeather>  stateWeatherMap;

    public Map<String, StateWeather> getStateWeatherMap() {
        return stateWeatherMap;
    }

    public void setStateWeatherMap(Map<String, StateWeather> stateWeatherMap) {
        this.stateWeatherMap = stateWeatherMap;
    }
}
