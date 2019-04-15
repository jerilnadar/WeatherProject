package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    WeatherRepository weatherRepository;

    public GetWeatherResponse getWeatherReport(int id) {
        return weatherRepository.findById(id).get();
    }
    
    public Iterable<GetWeatherResponse> getAllWeatherReport() {
        return weatherRepository.findAll();
    }

    public GetWeatherResponse save(GetWeatherResponse weatherReportResponse) {
        return weatherRepository.save(weatherReportResponse);
    }
}
