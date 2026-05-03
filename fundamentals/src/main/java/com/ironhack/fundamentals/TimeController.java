package com.ironhack.fundamentals;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // pone esta clase como controlador Web
public class TimeController {

    private TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String currentTime() {
        return timeService.currentTime();
    }

    @GetMapping("/date")
    public String currentDate() {
        return timeService.currentDate();
    }

    @GetMapping("/day")
    public String currentDay() {
        return timeService.currentDay();
    }

    @GetMapping("/time/all")
    public String allTime() {
        return "Time: " + timeService.currentTime()
                + ", Date: " + timeService.currentDate()
                + ", Day: " + timeService.currentDay();
    }
}
