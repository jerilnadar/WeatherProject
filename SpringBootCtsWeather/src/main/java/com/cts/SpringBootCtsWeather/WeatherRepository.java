package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<GetWeatherResponse, Integer> {
}
