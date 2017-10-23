package com.luv2code;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

  @Override
  public String happyFortuneService() {
    
    return "Today you have a wonderfull day";
  }

}
