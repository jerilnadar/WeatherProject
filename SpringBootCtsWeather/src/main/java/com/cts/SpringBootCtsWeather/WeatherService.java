package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.CityWeather;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepository weatherRepository;

    @Autowired
    CityRepository cityRepository;

    public GetWeatherResponse getWeatherReport(int id) {
        return weatherRepository.findById(id).get();
    }
    
    public Iterable<GetWeatherResponse> getAllWeatherReport() {
        List<GetWeatherResponse> weatherResponses = new ArrayList<>();
        weatherRepository.findAll().forEach(getWeatherResponse -> weatherResponses.add(getWeatherResponse));
        return weatherResponses;
    }

    public GetWeatherResponse getWeatherReportByState(String state) {
        GetWeatherResponse getWeatherResponse = new GetWeatherResponse();
        for (GetWeatherResponse getWeatherResponse1 : weatherRepository.findAll()) {
            if (state.equalsIgnoreCase(getWeatherResponse1.getState())) {
                return getWeatherResponse1;
            }
        }
        return getWeatherResponse;
    }

    public GetWeatherResponse save(GetWeatherResponse weatherReportResponse) {
        return weatherRepository.save(weatherReportResponse);
    }
}
