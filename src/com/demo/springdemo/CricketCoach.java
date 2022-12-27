package com.demo.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new fields for email & team
    private String emailAddress;
    private String team;

    //create a no arg constructor
    public CricketCoach(){
        System.out.println("inside CricketCoach constructor");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside CricketCoach setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside CricketCoach getTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside CricketCoach setFortuneService");
        this.fortuneService = fortuneService;
    }
}
