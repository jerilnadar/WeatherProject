package com.cts.SpringBootCtsWeather;

import com.cts.model.WeatherReportResponse;
import com.cts.model.getweather.CityWeather;
import com.cts.model.getweather.GetWeatherResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EntityScan("com.cts.model.getweather")
public class SpringBootCtsWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCtsWeatherApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(WeatherService weatherService) {
		return args -> {

			List<CityWeather> cityWeatherList1 = new ArrayList<>();
			CityWeather cityWeather1 = new CityWeather("Jersey City", "45", "46");
			CityWeather cityWeather2 = new CityWeather("Edison", "51", "53");
			cityWeatherList1.add(cityWeather1);
			cityWeatherList1.add(cityWeather2);

			List<CityWeather> cityWeatherList2 = new ArrayList<>();
			CityWeather cityWeather3 = new CityWeather("Downtown", "60", "63");
			CityWeather cityWeather4 = new CityWeather("Brooklyn", "71", "80");
			cityWeatherList2.add(cityWeather3);
			cityWeatherList2.add(cityWeather4);

			weatherService.save(new GetWeatherResponse("NJ", cityWeather1, cityWeather2));
			weatherService.save(new GetWeatherResponse("NY", cityWeather3, cityWeather4));
		};
	}

}
