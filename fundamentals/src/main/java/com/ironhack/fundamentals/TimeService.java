package com.ironhack.fundamentals;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;

@Service //marca esta clase como servicio para Spring
public class TimeService {
    public String currentTime() {
        return LocalTime.now().withNano(0).toString();
    }

    public String currentDate() {
        return LocalDate.now().toString();
    }

    public String currentDay() {
        return LocalDate.now().getDayOfWeek().toString();
    }
}
