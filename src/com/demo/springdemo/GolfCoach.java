package com.demo.springdemo;

public class GolfCoach implements Coach{

    FortuneService fortuneService;

    GolfCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice 30 mins today.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
