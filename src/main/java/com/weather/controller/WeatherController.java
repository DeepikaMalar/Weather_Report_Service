package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.services.WeatherService;


@RestController
public class WeatherController {
	@Autowired
	WeatherService weatherService;

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getWeather", method= RequestMethod.POST)
	public String getWeather(@RequestBody String city) {
		return weatherService.getWeather(city);
	}
}
