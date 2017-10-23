package com.luv2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    Coach coach = context.getBean("tableTennisCoach",Coach.class);
    
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());
    
    context.close();
  }

}
