package com.cts.model.getweather;

import com.cts.model.City;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class GetWeatherResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String state;

    //@OneToMany(mappedBy = "getWeatherResponse", cascade = CascadeType.ALL)
    //@JoinColumn(referencedColumnName="id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<CityWeather> cities;

    public List<CityWeather> getCities() {
        return cities;
    }

    public void setCities(List<CityWeather> cities) {
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public GetWeatherResponse(){

    }

    public GetWeatherResponse(String state, CityWeather... cities) {
        this.state = state;
        this.cities = Stream.of(cities).collect(Collectors.toList());
        //this.cities.forEach(x -> x.setGetWeatherResponse(this));
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
