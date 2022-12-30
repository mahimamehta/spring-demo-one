package com.demo.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    String[] fortunes;
    Random random;

    RandomFortuneService(){
        fortunes = new String[]{"You are lucky", "Smile and be happy", "Hello Sunshine"};
        random = new Random();
    }

    @Override
    public String getFortune() {
        // randomly gives the fortune
        return fortunes[random.nextInt(3)];
    }
}
