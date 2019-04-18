package com.cts.model.getweather;

import javax.persistence.*;

@Entity
public class CityWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String temperature;
    private String feels;

    @ManyToOne
    @JoinColumn(name = "get_weather_response_id")
    private GetWeatherResponse getWeatherResponse;

    public CityWeather(String city, String temperature, String feels) {
        this.city = city;
        this.temperature = temperature;
        this.feels = feels;
    }

    public CityWeather(){}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getFeels() {
        return feels;
    }

    public void setFeels(String feels) {
        this.feels = feels;
    }
}
