package com.demo.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class KhoKhoCoach implements Coach, DisposableBean {

    FortuneService fortuneService;

    KhoKhoCoach( FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    // add an init method - // this method is called just before the bean is ready for use
    public void doMyStartupStuff(){
        System.out.println("KhoKhoCoach Coach: inside method doMyStartupStuff");
    }


    // this method is called just before the bean lifecycle is over
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside KhoKhoCoach- destroy method provided by DisposableBean interface. " +
                "This can be used with beans with prototype scope ");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice running!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
