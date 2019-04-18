package com.cts.SpringBootCtsWeather;

import com.cts.model.getweather.CityWeather;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<CityWeather, Integer> {
}
