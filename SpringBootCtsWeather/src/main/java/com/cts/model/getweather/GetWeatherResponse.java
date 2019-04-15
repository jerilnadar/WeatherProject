package com.cts.model.getweather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GetWeatherResponse {
    @Id
    @GeneratedValue
    private int id;
    private String state;
    private String city;
    private String temperature;
    private String feels;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeels() {
        return feels;
    }

    public void setFeels(String feels) {
        this.feels = feels;
    }

    public GetWeatherResponse(){

    }

    public GetWeatherResponse(int id, String state, String city, String temperature, String feels) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.temperature = temperature;
        this.feels = feels;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

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
}
