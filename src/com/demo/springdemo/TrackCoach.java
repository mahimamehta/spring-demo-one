package com.demo.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it!!" + fortuneService.getFortune();
    }

    // add an init method - // this method is called just before the bean is ready for use
    public void doMyStartupStuff(){
        System.out.println("Track Coach: inside method doMyStartupStuff");
    }

    // add a destroy method - this method is called just before the bean lifecycle is over
    public void doMyCleanupStuff(){
        System.out.println("Track Coach: inside method doMyCleanupStuff");
    }
}
