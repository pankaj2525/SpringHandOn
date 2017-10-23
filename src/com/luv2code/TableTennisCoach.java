package com.luv2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {
  
 
  private FortuneService fortuneService;
  
  @Autowired
  public TableTennisCoach(FortuneService fortuneService) {
    
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return "DO foreHand Knock for 30 mins";
  }

  @Override
  public String getDailyFortune() {
    // TODO Auto-generated method stub
    return fortuneService.happyFortuneService();
  }

}
