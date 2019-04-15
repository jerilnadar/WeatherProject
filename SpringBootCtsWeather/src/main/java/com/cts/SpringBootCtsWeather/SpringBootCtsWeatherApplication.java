package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("com.cts.model.getweather")
public class SpringBootCtsWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCtsWeatherApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(WeatherService weatherService) {
		return args -> {
			weatherService.save(new GetWeatherResponse(1,"NJ", "Jersey City", "45", "40"));
			weatherService.save(new GetWeatherResponse(1,"NJ", "Edison", "45", "40"));
			weatherService.save(new GetWeatherResponse(2,"CA", "Edison", "45", "40"));
			weatherService.save(new GetWeatherResponse(3,"NY", "Metropark", "45", "40"));
		};
	}

}
