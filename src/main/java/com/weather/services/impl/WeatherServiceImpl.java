package com.weather.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.Constant.WeatherConstant;
import com.weather.services.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Override
	public String getWeather(String city) {
		// TODO Auto-generated method stub
        city = city.replaceAll(WeatherConstant.SPECIAL_CHARS,WeatherConstant.EMPTY_STRING);		
		RestTemplate restTemplate = new RestTemplate();
		String weatherReport = restTemplate.getForObject(WeatherConstant.URL+city, String.class);
		return weatherReport; 
	}

}
