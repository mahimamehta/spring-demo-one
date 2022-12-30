package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the application context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // extract the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if these 2 beans are pointing to the same objects
        boolean result = (theCoach==alphaCoach);

        System.out.println("\nPointing to the same results "+ result);
        System.out.println("\nMemory location of theCoach "+ theCoach);
        System.out.println("\nMemory location of alphaCoach "+ alphaCoach);

        context.close();
    }
}
