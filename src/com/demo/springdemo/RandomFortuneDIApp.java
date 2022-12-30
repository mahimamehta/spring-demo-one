package com.demo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneDIApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GolfCoach golfCoach = context.getBean("golfCoach", GolfCoach.class);

        System.out.println(golfCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyFortune());
        context.close();

    }
}
