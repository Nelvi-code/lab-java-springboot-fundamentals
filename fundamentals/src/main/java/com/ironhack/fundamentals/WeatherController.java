package com.ironhack.fundamentals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }
    @GetMapping("/weather/temperature")
    public int currentTemperature(){
        return weatherService.currentTemperature();
    }
    @GetMapping("/weather/condition")
    public String currentCondition(){
        return weatherService.weatherCondition();
    }
    @GetMapping("/weather/wind")
    public int currentWind(){
        return weatherService.windSpeed();
    }
    @GetMapping("/weather/all")
    public String allWeather(){
        return "Temperature: " + weatherService.currentTemperature()
                + ", Condition: " + weatherService.weatherCondition()
                + ", Wind:" + weatherService.windSpeed();
    }

}
