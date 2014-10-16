package com.springinaction.springidol.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;

import com.springinaction.springidol.Instrument;

@StringedInstrument//有@Qualifier("stringed")的作用
@Strummed
public class Guitar implements Instrument {
  public void play() {
    System.out.println("Strum strum strum");
  }
}
