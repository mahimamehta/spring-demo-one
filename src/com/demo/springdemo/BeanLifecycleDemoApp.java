package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        // load the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // extract the bean from spring container - singleton
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // bean lifecycle for prototyped scope beans
        Coach alphaCoach = context.getBean("khoKhoCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
