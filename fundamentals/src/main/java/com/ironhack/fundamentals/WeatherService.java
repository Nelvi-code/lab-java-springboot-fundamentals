package com.ironhack.fundamentals;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {

    public int currentTemperature() {
        Random random = new Random();
        return random.nextInt(51) - 10;

    }

    public String weatherCondition() {
        Random random = new Random();
        int option = random.nextInt(4);

        if (option == 0) {
            return "Sunny";
        }
        if (option == 1) {
            return "Rayni";
        }
        if (option == 2) {
            return "Cloudy";
        }
        else{
            return "Windy";
        }
    }

    public int windSpeed(){
        Random random = new Random();
        return random.nextInt(101);

    }
}