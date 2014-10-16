package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component  //自动注册位spring Bean
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Strum strum strum");
  }
}