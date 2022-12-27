package com.demo.springdemo;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Do 30 minutes of Yoga everyday!!";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
